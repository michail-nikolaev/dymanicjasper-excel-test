package org.nkey.dynamicjasper

import ar.com.fdvs.dj.core.DJConstants
import ar.com.fdvs.dj.core.DynamicJasperHelper
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager
import ar.com.fdvs.dj.domain.AutoText
import ar.com.fdvs.dj.domain.DynamicReport
import ar.com.fdvs.dj.domain.builders.FastReportBuilder
import net.sf.jasperreports.engine.JRExporterParameter
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperPrint
import net.sf.jasperreports.engine.JasperReport
import net.sf.jasperreports.engine.export.JRXlsExporterParameter
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter

class SimpleExcelReport {
    static void main(args) {
        DynamicReport firstReport = createMainReport()
        DynamicReport secondReport = createSecondReport("Second report")

        FastReportBuilder drb = new FastReportBuilder();
        DynamicReport dynamicReport = drb.setUseFullPageWidth(true)
                .setWhenNoDataAllSectionNoDetail()
                .addAutoText(AutoText.AUTOTEXT_PAGE_X_OF_Y, AutoText.POSITION_FOOTER, AutoText.ALIGNMENT_CENTER)
                .setIgnorePagination(true)
                .setMargins(0, 0, 0, 0)
                .setUseFullPageWidth(true)
                .addConcatenatedReport(firstReport, new ClassicLayoutManager(), "first",
                DJConstants.DATA_SOURCE_ORIGIN_PARAMETER, DJConstants.DATA_SOURCE_TYPE_COLLECTION, false)
                .addConcatenatedReport(secondReport, new ClassicLayoutManager(), "second",
                DJConstants.DATA_SOURCE_ORIGIN_PARAMETER,
                DJConstants.DATA_SOURCE_TYPE_COLLECTION, false).setIgnorePagination(true).build();

        def params = [:];
        params["first"] = TestDataProvider.testData();
        params["second"] = TestDataProvider.testData();

        JasperReport jasperReport = DynamicJasperHelper.generateJasperReport(dynamicReport,
                new ClassicLayoutManager(), params);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params);
        exportToXLSX(jasperPrint)
    }

    private static void exportToXLSX(JasperPrint jasperPrint) {
        JRXlsxExporter exporter = new JRXlsxExporter();

        File outputFile = new File("G:/Dev/GitHub/dymanicjasper-excel-test/test.xlsx");
        FileOutputStream fos = new FileOutputStream(outputFile);

        exporter.setParameter(JRExporterParameter.JASPER_PRINT_LIST, [jasperPrint, jasperPrint]);
        exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, fos);

        //Excel specific parameter
        exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, true);
        exporter.setParameter(JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, true);
        exporter.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND, false);
        exporter.setParameter(JRXlsExporterParameter.IGNORE_PAGE_MARGINS, true);

        exporter.setParameter(JRXlsExporterParameter.SHEET_NAMES, ["Belka","Strelka"].toArray(new String[2]) );
        exporter.exportReport();
    }

    private static DynamicReport createMainReport() {
        FastReportBuilder drb = new FastReportBuilder();
        drb.addColumn("State", "state", String.class.getName(), 30)
                .addColumn("Branch", "branch", String.class.getName(), 30)
                .addColumn("Product Line", "productLine", String.class.getName(), 50)
                .addColumn("Item", "item", String.class.getName(), 50)
                .addColumn("Item Code", "id", Long.class.getName(), 30, true)
                .addColumn("Quantity", "quantity", Long.class.getName(), 60, true)
                .addColumn("Amount", "amount", Float.class.getName(), 70, true)
                .setColspan(0, 4, "Colspan0")
                .setColspan(5, 2, "Colspan2")
                .setPrintColumnNames(true)
                .setIgnorePagination(true)
                .setMargins(0, 0, 0, 0)
                .setTitle("April 2013 sales report")
                .setSubtitle("This report was generated at " + new Date())
                .setUseFullPageWidth(true);
        def dynamicReport = drb.build()
        dynamicReport
    }

    private static DynamicReport createSecondReport(String title) throws Exception {
        FastReportBuilder rb = new FastReportBuilder();
        rb.addColumn("Branch", "branch", String.class.getName(), 30)
                .addColumn("Product Line", "productLine", String.class.getName(), 50)
                .addColumn("Item", "item", String.class.getName(), 50)
                .addGroups(1)
                .setMargins(5, 5, 20, 20)
                .setUseFullPageWidth(true)
                .setTitle(title)
                .setPrintColumnNames(true)
                .setIgnorePagination(true)
                .build();
    }
}
