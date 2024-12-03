package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class  SetDemo {
		public static void main(String a[]) {
		Set<Integer> s = new HashSet<Integer>();
		//insert
		s.add(10);
		boolean b=s.add(20);
		System.out.println(s);
		Set<Integer> s1=new HashSet<Integer>();
		s1.addAll(s);
		s.add(145);
		System.out.println(s1);
		
		System.out.println("treeset");
		Set<Integer> t = new TreeSet<Integer>();
		t.add(97);
		t.add(99);
		t.add(67);
		t.add(67);
		System.out.println(t);//sorted order
		t.remove(67);
		System.out.println(t);//sorted order
		boolean ele = t.contains(5671);
		System.out.println("t conatins 5671" +ele);
		//converts set to array-t.toarray();
		//How to convert array to set?
		
		
	}
	

	
}
