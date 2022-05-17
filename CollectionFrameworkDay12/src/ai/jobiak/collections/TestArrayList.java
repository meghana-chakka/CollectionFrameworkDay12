package ai.jobiak.collections;


import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		
       ArrayList bookList = new ArrayList();
       System.out.println(bookList.size());
       
       
       bookList.add("Thinking in Java");
       bookList.add("JavaUnleashed");
       bookList.add("Java for Dummies in 21 days");
       bookList.add("Head First Java");
       bookList.add("Java in Action");
       System.out.println(bookList.size());
       System.out.println(bookList);
       
       bookList.add("Head First Design Pattern");
       bookList.add("The Java EE Server Programming");
       
       
       System.out.println(bookList.size());
       System.out.println(bookList);
       System.out.println(bookList.get(5));
       
       
       System.out.println(bookList.contains("thinging in Java"));
       
       
       List list=bookList;
       System.out.println(list);
       Collection collection = list;
       System.out.println(collection);
       
       
       ////iteration
       //Iteration iter = collection.iteration();
       //Iteration iter = list.iteration();
       Iterator iter = bookList.iterator();
       while(iter.hasNext()) {
    	   System.out.println(iter.next());
       
       //enhanced for loop,wherein you don't need to maintain the index of elements
       }
       for(Object book : bookList) {
    	   
    	   
    	   System.out.println(book);
       }
       for(int i=0;i<bookList.size();i++) {
    	   
    	   System.out.println(bookList.get(i));
    	   
       }
       Collections.sort(bookList);
       System.out.println(bookList);
       int foundAt=Collections.binarySearch(bookList,"Java for ummies in 21 days");
       
       System.out.println(foundAt);
       
       Object books[]= collection.toArray();
       System.out.println(books.length);
       
       
       List listOfBooks = Arrays.asList(books);
       System.out.println(listOfBooks);
       
       
       
	}

}
