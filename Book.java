class Book{
	
	String title;
	String author;
	Book(String t, String a){
	title = t;
	author = a;
	}
	void displayInfo(){
	System.out.println("Book Title"+title);
	System.out.println("Author:"+author);
	}
	}