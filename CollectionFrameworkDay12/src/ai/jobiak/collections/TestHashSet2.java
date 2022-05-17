package ai.jobiak.collections;


import java.time.LocalDateTime;

import java.util.*;

public class TestHashSet2 {

	public static void main(String[] args) {
		
		
		HashSet<String> colors = new HashSet<String>();//by default the java collections are generic -wider or widest
		
		
		colors.add("green");
		colors.add("blue");
		colors.add("yellow");
		colors.add("purple");
		colors.add("black");
		colors.add("white");
		colors.add("pink");
		
	
	    LocalDateTime dt =LocalDateTime.now();
		// colors.add(dt);
		//colors.add(new Boolean("false"));
        //colors.add(new BigInteger("100"));
        //colors.add(new Object());
		 
        //for(String obj:colors) {}
		
        Iterator<String> iter = colors.iterator();
        
        while(iter.hasNext()) {	
        	System.out.println(iter.next().toUpperCase());
        }
        
        Object obj=iter.next();
         if(obj instanceof String) {
        	 String str=(String)iter.next();
        	 System.out.println(str);
         }else if(obj instanceof Integer) {
        	 Integer bi=(Integer)obj;
        	 System.out.println(bi);
         }
         else if(obj instanceof Boolean) {
        	 Boolean bool=(Boolean)obj;
        	 System.out.println(bool);
        	 
         }else if(obj instanceof LocalDateTime) {
        	 LocalDateTime Idt=(LocalDateTime)obj;
        	 System.out.println(Idt);
         }else {
        	 System.out.println(obj);
         }
       
        	
        System.out.println(colors.size());
    }
}


