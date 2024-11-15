package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet myset= new HashSet();
        
       myset.add(100);
       myset.add(10.2);
       myset.add("Welcome");
       myset.add('A');
       myset.add(null);
       myset.add(null);
       myset.add(100);
      // System.out.println(myset);
       myset.remove(10.2);
       //System.out.println(myset);
       /*ArrayList li= new ArrayList(myset);
       System.out.println(li);
       System.out.println(li.get(2));*/
     /*  for(Object x:myset) {
    	   System.out.println(x);
       }*/
      /* Iterator it= myset.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }*/
       //myset.clear();
       
       //System.out.println(myset.size());
	}

}
