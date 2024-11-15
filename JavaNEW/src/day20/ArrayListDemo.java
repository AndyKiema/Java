package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList mylist= new ArrayList();
        //List li= new ArrayList();
		//ArrayList<Integer> mylist= new ArrayList<Integer>();
		//ArrayList<Employee>mylist= new ArrayList<Employee>();
        mylist.add(100);
        mylist.add('A');
        mylist.add("Welcome");
        mylist.add(10.5);
        mylist.add('A');
        mylist.add(100);
       // System.out.println("The length of the ArrayList is "+mylist.size());
        //System.out.println(mylist);
       // mylist.remove(3);
        //System.out.println(mylist);
        mylist.add(2,"Yes");
        //System.out.println(mylist);
        mylist.set(3, "Go");
        //System.out.println(mylist);
        //System.out.println(mylist.get(2));
        /*for(int i=0; i<mylist.size(); i++) {
        	System.out.println(mylist.get(i));
        }*/
       /* for(Object x:mylist) {
        	System.out.println(x);
        }*/
        /*Iterator it= mylist.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }*/
        //System.out.println(mylist.isEmpty());
        
	}

}
