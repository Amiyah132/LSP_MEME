package org.howard.edu.lsp.assignment4;

import org.howard.edu.lsp.assignment4.IntegerSet.IntegerSetException;

public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(3);
		set1.add(5);
		set1.add(7);
	
		System.out.println("Value of Set1 is: " + set1.ToString());
		System.out.println("The smallest value in set1 is: " + set1.smallest());
		System.out.println("The largest value in set1 is: " + set1.largest());
		System.out.println("Length of the set1 is: " + set1.length());
		IntegerSet set2 = new IntegerSet();
		set2.add(2);
		set2.add(3);
		set2.add(5);
		set2.add(6);
		set2.add(8);
        System.out.println("Value of Set2 is:" + set2.ToString());
        System.out.println("Length of the set2 is: " + set2.length());
        System.out.println("Result of union of Set1 and Set2: ");
        set1.union(set2);
        System.out.println("Set1 and Set2 are equal: " + set1.equals(set2));
        set2.remove(5);
        System.out.println("Value of Set2 is now:" + set2.ToString());
		System.out.println("Set2 before intersection: " + set2.ToString());
		set2.intersection(set1);
		System.out.println("Set2 after intersection: " + set2.ToString());
		set1.remove(7);
		System.out.println("Set1 before difference: " + set1.ToString());
		set1.difference(set2);
		System.out.println("Set1 after difference: " + set1.ToString());
		System.out.println("Set1 is Empty: " + set1.isEmpty());
		set1.clear();
		System.out.println("Set1 is Empty: " + set1.isEmpty());
	}

}