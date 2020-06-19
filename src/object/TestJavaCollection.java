package object;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection {

	public static void main(String[] args) {
		
		ArrayList<String>list =new ArrayList<String>();
		
		list.add("Amit");
		list.add("Smar");
		list.add("Zeba");
		list.add("Jeenat");
		
		Iterator itr=list.iterator();
		 
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		ArrayList<Integer>list1 =new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		
		System.out.println(list1);
		list.remove(2);
		System.out.println(list.removeAll(list));
		
	}
	
}
