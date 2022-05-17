package ai.jobiak.collections;


import java.util.*;




public class TestHashSet3 {

	public static void main(String[] args) {
		
		
		HashSet<Course> courseSet = new HashSet<Course>();
		Course c1=new Course("BCL1","Computer Basics",20,500);
		Course c2=new Course("PGL1","Algorithms",40,2500);
		Course c3=new Course("AdvProgL3","Java Programming",60,5000);
		Course c4=new Course("AdvProgL3","Java Programming",60,5000);
		
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		
		
		courseSet.add(c1);
		courseSet.add(c2);
		courseSet.add(c3);
		courseSet.add(c4);
		courseSet.add(null);
		System.out.println(courseSet);
		System.out.println(courseSet.size());
	}
}	
