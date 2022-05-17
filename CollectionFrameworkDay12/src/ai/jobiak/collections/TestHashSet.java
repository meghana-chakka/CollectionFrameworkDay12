package ai.jobiak.collections;

import java.time.LocalDateTime;
import java.util.*;

//Template Design in C++ (type definitions)==Generics in java

public class TestHashSet {

	public static void main(String[] args) {
		
		
		HashSet<String> colors = new HashSet<String>();//by default the java collections are generic -wider or widest
		//java generics 
		//Type safety--->compile time and the other is run time type safety
		
		colors.add("green");
		colors.add("blue");
		colors.add("yellow");
		colors.add("purple");
		colors.add("black");
		colors.add("white");
		colors.add("pink");
		
	/*	for(Object obj : colors) {
			System.out.println(obj);
		  } 
		*/
	//  LocalDateTime dt =LocalDateTime.now();
	//	colors.add(dt);
	//	colors.add(new Boolean("false"));
    //  colors.add(new BigInteger("100"));
    //  colors.add(new Object());
		
		
        Iterator<String> iter = colors.iterator();
        
        while(iter.hasNext()) {	
        
        	
       	System.out.println(iter.next().toUpperCase());
       
       } 	
        System.out.println(colors.size());
    }
}


