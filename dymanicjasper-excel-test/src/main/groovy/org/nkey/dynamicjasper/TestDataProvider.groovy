package org.nkey.dynamicjasper


class TestDataProvider {

    static List<Product> testData() {
        List col =  new ArrayList();

        //The collection is ordered by State, Branch and Product Line
        col.add(new Product( new Long("1"),"book","Harry Potter 7","Florida","Main Street", new Long("2500"), new Float("10000")));
        col.add(new Product( new Long("1"),"book","Harry Potter 7","Florida","Railway Station", new Long("1400"), new Float("2831.32")));
        col.add(new Product( new Long("1"),"book","Harry Potter 7","Florida","Baseball Stadium", new Long("4000"), new Float("38347")));
        col.add(new Product( new Long("1"),"book","Harry Potter 7","Florida","Shopping Center", new Long("3000"), new Float("9482.4")));
        col.add(new Product( new Long("1"),"book","Harry Potter 7","New York","Main Street", new Long("2500"), new Float("27475.5")));
        col.add(new Product( new Long("1"),"book","Harry Potter 7","New York","Railway Station", new Long("1400"), new Float("3322")));
        col.add(new Product( new Long("1"),"book","Harry Potter 7","New York","Baseball Stadium", new Long("4000"), new Float("78482")));
        col.add(new Product( new Long("1"),"book","Harry Potter 7","New York",
                "Shopping Center", new Long("3000"), new Float("5831.32")));
		col.add(new Product( new Long("1"),"book","Harry Potter 7","Washington","Main Street", new Long("1500"), new Float("78482")));
		col.add(new Product( new Long("1"),"book","Harry Potter 7","Washington","Railway Station", new Long("8400"), new Float("2831.32")));
		col.add(new Product( new Long("1"),"book","Harry Potter 7","Washington","Baseball Stadium", new Long("1400"), new Float("38347")));
		col.add(new Product( new Long("1"),"book","Harry Potter 7","Washington","Shopping Center", new Long("3000"), new Float("8329.2")));
		col.add(new Product( new Long("1"),"book","Harry Potter 7","Arizona","Main Street", new Long("1500"), new Float("27475.5")));
		col.add(new Product( new Long("1"),"book","Harry Potter 7","Arizona","Railway Station", new Long("4000"), new Float("3322")));
		col.add(new Product( new Long("2"),"book","The Sum of All Fears","Florida","Main Street", new Long("8400"), new Float("78482")));
		col.add(new Product( new Long("2"),"book","The Sum of All Fears","Florida","Railway Station", new Long("1400"), new Float("2831.32")));
		col.add(new Product( new Long("2"),"book","The Sum of All Fears","Florida","Baseball Stadium", new Long("4000"), new Float("38347")));
		col.add(new Product( new Long("2"),"book","The Sum of All Fears","Florida","Shopping Center", new Long("3000"), new Float("9482.4")));
        col.add(new Product( new Long("2"),"book","The Sum of All Fears","New York","Main Street", new Long("1500"), new Float("8329.2")));
        col.add(new Product( new Long("2"),"book","The Sum of All Fears","New York","Railway Station", new Long("2500"), new Float("27475.5")));
		col.add(new Product( new Long("2"),"book","The Sum of All Fears","New York","Baseball Stadium", new Long("1400"), new Float("3322")));
		col.add(new Product( new Long("2"),"book","The Sum of All Fears","New York","Shopping Center", new Long("1500"), new Float("78482")));
		col.add(new Product( new Long("2"),"book","The Sum of All Fears","Washington","Main Street", new Long("2500"), new Float("5831.32")));
		col.add(new Product( new Long("2"),"book","The Sum of All Fears","Washington","Railway Station", new Long("1400"), new Float("78482")));
		col.add(new Product( new Long("2"),"book","The Sum of All Fears","Washington","Baseball Stadium", new Long("4000"), new Float("2831.32")));
		col.add(new Product( new Long("2"),"book","The Sum of All Fears","Washington","Shopping Center", new Long("3000"), new Float("38347")));
		col.add(new Product( new Long("3"),"book","The Pelican Brief,","Florida","Main Street", new Long("1400"), new Float("78482")));
		col.add(new Product( new Long("3"),"book","The Pelican Brief,","Florida","Railway Station", new Long("4000"), new Float("5831.32")));
		col.add(new Product( new Long("3"),"book","The Pelican Brief,","Florida","Baseball Stadium", new Long("3000"), new Float("78482")));
		col.add(new Product( new Long("3"),"book","The Pelican Brief,","Florida","Shopping Center", new Long("1500"), new Float("2831.32")));
        col.add(new Product( new Long("3"),"book","The Pelican Brief,","New York","Main Street", new Long("2500"), new Float("38347")));
        col.add(new Product( new Long("3"),"book","The Pelican Brief,","New York","Railway Station", new Long("1400"), new Float("9482.4")));
        col.add(new Product( new Long("3"),"book","The Pelican Brief,","New York","Baseball Stadium", new Long("1500"), new Float("8329.2")));
        col.add(new Product( new Long("3"),"book","The Pelican Brief,","New York","Shopping Center", new Long("2500"), new Float("27475.5")));
        col.add(new Product( new Long("3"),"book","The Pelican Brief,","Washington","Main Street", new Long("1400"), new Float("3322")));
        col.add(new Product( new Long("3"),"book","The Pelican Brief,","Washington","Railway Station", new Long("4000"), new Float("78482")));
        col.add(new Product( new Long("3"),"book","The Pelican Brief,","Washington","Baseball Stadium", new Long("3000"), new Float("5831.32")));
        col.add(new Product( new Long("3"),"book","The Pelican Brief,","Washington","Shopping Center", new Long("4000"), new Float("78482")));
        col.add(new Product( new Long("3"),"book","The Pelican Brief,","Arizona","Main Street", new Long("3000"), new Float("2831.32")));
        col.add(new Product( new Long("3"),"book","The Pelican Brief,","Arizona","Railway Station", new Long("1500"), new Float("38347")));
//		col.add(new Product( new Long("3"),"book","The Pelican Brief,","Arizona","Baseball Stadium", new Long("8400"), new Float("9482.4")));
        col.add(new Product( new Long("3"),"book","The Pelican Brief,","Arizona","Shopping Center", new Long("1400"), new Float("8329.2")));
        col.add(new Product( new Long("4"),"dvd","Titanic","Florida","Main Street", new Long("4000"), new Float("27475.5")));
        col.add(new Product( new Long("4"),"dvd","Titanic","Florida","Railway Station", new Long("3000"), new Float("3322")));
        col.add(new Product( new Long("4"),"dvd","Titanic","Florida","Baseball Stadium", new Long("1500"), new Float("78482")));
        col.add(new Product( new Long("4"),"dvd","Titanic","Florida","Shopping Center", new Long("2500"), new Float("5831.32")));
        col.add(new Product( new Long("4"),"dvd","Titanic","New York","Main Street", new Long("1400"), new Float("78482")));
        col.add(new Product( new Long("4"),"dvd","Titanic","New York","Railway Station", new Long("1500"), new Float("2831.32")));
        col.add(new Product( new Long("4"),"dvd","Titanic","New York","Baseball Stadium", new Long("2500"), new Float("38347")));
        col.add(new Product( new Long("4"),"dvd","Titanic","New York","Shopping Center", new Long("1400"), new Float("9482.4")));
        col.add(new Product( new Long("4"),"dvd","Titanic","Washington","Main Street", new Long("4000"), new Float("8329.2")));
        col.add(new Product( new Long("4"),"dvd","Titanic","Washington","Railway Station", new Long("3000"), new Float("27475.5")));
        col.add(new Product( new Long("4"),"dvd","Titanic","Washington","Baseball Stadium", new Long("4000"), new Float("3322")));
        col.add(new Product( new Long("4"),"dvd","Titanic","Washington","Shopping Center", new Long("3000"), new Float("78482")));
        col.add(new Product( new Long("4"),"dvd","Titanic","Arizona","Main Street", new Long("1500"), new Float("5831.32")));
        col.add(new Product( new Long("4"),"dvd","Titanic","Arizona","Railway Station", new Long("8400"), new Float("3322")));
		col.add(new Product( new Long("4"),"dvd","Titanic","Arizona","Baseball Stadium", new Long("1400"), new Float("78482")));
        col.add(new Product( new Long("4"),"dvd","Titanic","Arizona","Shopping Center", new Long("4000"), new Float("5831.32")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","Florida","Main Street", new Long("3000"), new Float("78482")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","Florida","Railway Station", new Long("1500"), new Float("2831.32")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","Florida","Baseball Stadium", new Long("2500"), new Float("38347")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","Florida","Shopping Center", new Long("1400"), new Float("9482.4")));
        col.add(new Product( new Long("5"),"dvd","Back To the Future","New York","Main Street", new Long("1500"), new Float("8329.2")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","New York","Railway Station", new Long("2500"), new Float("27475.5")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","New York","Baseball Stadium", new Long("1400"), new Float("3322")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","New York","Shopping Center", new Long("4000"), new Float("78482")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","Washington","Main Street", new Long("3000"), new Float("5831.32")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","Washington","Railway Station", new Long("4000"), new Float("78482")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","Washington","Baseball Stadium", new Long("3000"), new Float("2831.32")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","Washington","Shopping Center", new Long("1500"), new Float("38347")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","Arizona","Main Street", new Long("8400"), new Float("9482.4")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","Arizona","Railway Station", new Long("1400"), new Float("8329.2")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","Arizona","Baseball Stadium", new Long("4000"), new Float("27475.5")));
		col.add(new Product( new Long("5"),"dvd","Back To the Future","Arizona","Shopping Center", new Long("3000"), new Float("3322")));
		col.add(new Product( new Long("6"),"dvd","Monsters Inc","Florida","Main Street", new Long("1500"), new Float("78482")));
		col.add(new Product( new Long("6"),"dvd","Monsters Inc","Florida","Railway Station", new Long("2500"), new Float("5831.32")));
		col.add(new Product( new Long("6"),"dvd","Monsters Inc","Florida","Baseball Stadium", new Long("1400"), new Float("3322")));
		col.add(new Product( new Long("6"),"dvd","Monsters Inc","Florida","Shopping Center", new Long("1500"), new Float("78482")));
		col.add(new Product( new Long("6"),"dvd","Monsters Inc","New York","Main Street", new Long("2500"), new Float("5831.32")));
        col.add(new Product( new Long("6"),"dvd","Monsters Inc","New York","Railway Station", new Long("1400"), new Float("78482")));
        col.add(new Product( new Long("6"),"dvd","Monsters Inc","New York","Baseball Stadium", new Long("4000"), new Float("2831.32")));
        col.add(new Product( new Long("6"),"dvd","Monsters Inc","New York","Shopping Center", new Long("3000"), new Float("38347")));
        col.add(new Product( new Long("6"),"dvd","Monsters Inc","Washington","Main Street", new Long("4000"), new Float("9482.4")));
        col.add(new Product( new Long("6"),"dvd","Monsters Inc","Washington","Railway Station", new Long("3000"), new Float("8329.2")));
		col.add(new Product( new Long("6"),"dvd","Monsters Inc","Washington","Baseball Stadium", new Long("1500"), new Float("27475.5")));
		col.add(new Product( new Long("6"),"dvd","Monsters Inc","Washington","Shopping Center", new Long("8400"), new Float("3322")));
		col.add(new Product( new Long("6"),"dvd","Monsters Inc","Arizona","Main Street", new Long("1400"), new Float("78482")));
		col.add(new Product( new Long("6"),"dvd","Monsters Inc","Arizona","Railway Station", new Long("4000"), new Float("5831.32")));
		col.add(new Product( new Long("6"),"dvd","Monsters Inc","Arizona","Baseball Stadium", new Long("3000"), new Float("78482")));
		col.add(new Product( new Long("6"),"dvd","Monsters Inc","Arizona","Shopping Center", new Long("1500"), new Float("2831.32")));
		col.add(new Product( new Long("7"),"magazine","Sports Illustrated","Florida","Main Street", new Long("2500"), new Float("38347")));
		col.add(new Product( new Long("7"),"magazine","Sports Illustrated","Florida","Railway Station", new Long("1400"), new Float("9482.4")));
		col.add(new Product( new Long("7"),"magazine","Sports Illustrated","Florida","Baseball Stadium", new Long("1500"), new Float("8329.2")));
		col.add(new Product( new Long("7"),"magazine","Sports Illustrated","Florida","Shopping Center", new Long("2500"), new Float("27475.5")));
        col.add(new Product( new Long("7"),"magazine","Sports Illustrated","New York","Main Street", new Long("1400"), new Float("3322")));
        col.add(new Product( new Long("7"),"magazine","Sports Illustrated","New York","Railway Station", new Long("4000"), new Float("78482")));
        col.add(new Product( new Long("7"),"magazine","Sports Illustrated","New York","Baseball Stadium", new Long("3000"), new Float("5831.32")));
		col.add(new Product( new Long("7"),"magazine","Sports Illustrated","New York","Shopping Center", new Long("4000"), new Float("3322")));
		col.add(new Product( new Long("7"),"magazine","Sports Illustrated","Washington","Main Street", new Long("3000"), new Float("78482")));
		col.add(new Product( new Long("7"),"magazine","Sports Illustrated","Washington","Railway Station", new Long("1500"), new Float("5831.32")));
		col.add(new Product( new Long("7"),"magazine","Sports Illustrated","Washington","Baseball Stadium", new Long("8400"), new Float("78482")));
		col.add(new Product( new Long("7"),"magazine","Sports Illustrated","Washington","Shopping Center", new Long("1400"), new Float("2831.32")));
		col.add(new Product( new Long("7"),"magazine","Sports Illustrated","Arizona","Main Street", new Long("4000"), new Float("38347")));
		col.add(new Product( new Long("7"),"magazine","Sports Illustrated","Arizona","Railway Station", new Long("3000"), new Float("9482.4")));
		col.add(new Product( new Long("7"),"magazine","Sports Illustrated","Arizona","Baseball Stadium", new Long("1500"), new Float("8329.2")));
		col.add(new Product( new Long("7"),"magazine","Sports Illustrated","Arizona","Shopping Center", new Long("2500"), new Float("27475.5")));
		col.add(new Product( new Long("8"),"magazine","The Economist","Florida","Main Street", new Long("1400"), new Float("3322")));
		col.add(new Product( new Long("8"),"magazine","The Economist","Florida","Railway Station", new Long("1500"), new Float("78482")));
		col.add(new Product( new Long("8"),"magazine","The Economist","Florida","Baseball Stadium", new Long("2500"), new Float("5831.32")));
		col.add(new Product( new Long("8"),"magazine","The Economist","Florida","Shopping Center", new Long("1400"), new Float("78482")));
		col.add(new Product( new Long("8"),"magazine","The Economist","New York","Main Street", new Long("4000"), new Float("2831.32")));
		col.add(new Product( new Long("8"),"magazine","The Economist","New York","Railway Station", new Long("3000"), new Float("38347")));
		col.add(new Product( new Long("8"),"magazine","The Economist","New York","Baseball Stadium", new Long("4000"), new Float("9482.4")));
		col.add(new Product( new Long("8"),"magazine","The Economist","New York","Shopping Center", new Long("3000"), new Float("8329.2")));
		col.add(new Product( new Long("8"),"magazine","The Economist","Washington","Main Street", new Long("1500"), new Float("27475.5")));
		col.add(new Product( new Long("8"),"magazine","The Economist","Washington","Railway Station", new Long("8400"), new Float("3322")));
		col.add(new Product( new Long("8"),"magazine","The Economist","Washington","Baseball Stadium", new Long("1400"), new Float("78482")));
		col.add(new Product( new Long("8"),"magazine","The Economist","Washington","Shopping Center", new Long("4000"), new Float("5831.32")));
		col.add(new Product( new Long("8"),"magazine","The Economist","Arizona","Main Street", new Long("3000"), new Float("3322")));
		col.add(new Product( new Long("8"),"magazine","The Economist","Arizona","Railway Station", new Long("1500"), new Float("78482")));
		col.add(new Product( new Long("8"),"magazine","The Economist","Arizona","Baseball Stadium", new Long("2500"), new Float("5831.32")));
		col.add(new Product( new Long("8"),"magazine","The Economist","Arizona","Shopping Center", new Long("1400"), new Float("78482")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","Florida","Main Street", new Long("1500"), new Float("2831.32")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","Florida","Railway Station", new Long("2500"), new Float("38347")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","Florida","Baseball Stadium", new Long("1400"), new Float("9482.4")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","Florida","Shopping Center", new Long("4000"), new Float("8329.2")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","New York","Main Street", new Long("3000"), new Float("27475.5")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","New York","Railway Station", new Long("1400"), new Float("3322")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","New York","Baseball Stadium", new Long("4000"), new Float("78482")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","New York","Shopping Center", new Long("3000"), new Float("5831.32")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","Washington","Main Street", new Long("4000"), new Float("3322")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","Washington","Railway Station", new Long("3000"), new Float("78482")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","Washington","Baseball Stadium", new Long("1500"), new Float("5831.32")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","Washington","Shopping Center", new Long("8400"), new Float("78482")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","Arizona","Main Street", new Long("1400"), new Float("2831.32")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","Arizona","Railway Station", new Long("4000"), new Float("38347")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","Arizona","Baseball Stadium", new Long("3000"), new Float("9482.4")));
		col.add(new Product( new Long("9"),"magazine","National Geographic","Arizona","Shopping Center", new Long("1500"), new Float("8329.2")));
		col.add(new Product( new Long("10"),"food","snickers","Florida","Main Street", new Long("2500"), new Float("27475.5")));
		col.add(new Product( new Long("10"),"food","snickers","Florida","Railway Station", new Long("1400"), new Float("3322")));
		col.add(new Product( new Long("10"),"food","snickers","Florida","Baseball Stadium", new Long("1500"), new Float("78482")));
		col.add(new Product( new Long("10"),"food","snickers","Florida","Shopping Center", new Long("2500"), new Float("27475.5")));
        col.add(new Product( new Long("10"),"food","snickers","New York","Main Street", new Long("1400"), new Float("3322")));
        col.add(new Product( new Long("10"),"food","snickers","New York","Railway Station", new Long("1500"), new Float("78482")));
        col.add(new Product( new Long("10"),"food","snickers","New York","Baseball Stadium", new Long("2500"), new Float("5831.32")));
		col.add(new Product( new Long("10"),"food","snickers","New York","Shopping Center", new Long("1400"), new Float("78482")));
		col.add(new Product( new Long("10"),"food","snickers","Washington","Main Street", new Long("4000"), new Float("2831.32")));
		col.add(new Product( new Long("10"),"food","snickers","Washington","Railway Station", new Long("3000"), new Float("38347")));
		col.add(new Product( new Long("10"),"food","snickers","Washington","Baseball Stadium", new Long("4000"), new Float("9482.4")));
		col.add(new Product( new Long("10"),"food","snickers","Washington","Shopping Center", new Long("3000"), new Float("8329.2")));
		col.add(new Product( new Long("10"),"food","snickers","Arizona","Main Street", new Long("1500"), new Float("27475.5")));
		col.add(new Product( new Long("10"),"food","snickers","Arizona","Railway Station", new Long("8400"), new Float("3322")));
		col.add(new Product( new Long("10"),"food","snickers","Arizona","Baseball Stadium", new Long("1400"), new Float("78482")));
		col.add(new Product( new Long("10"),"food","snickers","Arizona","Shopping Center", new Long("4000"), new Float("5831.32")));

        return col;
    }


    static class Product {
        String state
        String branch
        String productLine
        String item
        Long id
        Long quantity
        Float amount

        public Product(Long id, String productLine, String item, String state, String branch, Long quantity, Float amount) {
            this.id = id;
            this.productLine = productLine;
            this.item = item;
            this.state = state;
            this.branch = branch;
            this.quantity = quantity;
            this.amount = amount;
        }
    }
}
