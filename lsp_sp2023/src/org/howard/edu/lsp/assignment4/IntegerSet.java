package org.howard.edu.lsp.assignment4;
import java.util.*;


public class IntegerSet {
	private List<Integer> num_set;
	
	public IntegerSet(){
		num_set = new ArrayList<Integer>();
	}
	
	public class IntegerSetException extends Exception {
		public IntegerSetException(String error) {
			super(error);
		}
	}
	
	public List<Integer> get_set() {
		return num_set;
	}

	public void set_set(List<Integer> newnum_set){
		num_set = newnum_set;
	}
	
	public void clear(){
		num_set.clear();
	}

	public int length() {
		return num_set.size();
	}
	
	public boolean equals(IntegerSet set) {
		if(num_set.size() != set.length()) {
			return false;
		}else {
				return num_set.containsAll(set.num_set);
		}
	}

	public int largest() throws IntegerSetException {
		int max = Integer.MIN_VALUE;
		if (num_set.isEmpty()) {
				throw new IntegerSetException("Set is Empty");
			}
			else {
				for (Integer integer : num_set) {
					if (integer > max) {
						max = integer;
					}
				}
			}
		return max;
	}

	public int smallest() throws IntegerSetException {
		int min = Integer.MAX_VALUE;
		if (num_set.isEmpty()) {
				throw new IntegerSetException("Set is Empty");
			}
			else {
				for (Integer integer : num_set) {
					if (integer < min) {
						min = integer;
					}
				}
			}
		return min;
	}
	
	public void add(int item) {
		if (num_set.contains(item) == false) {
		num_set.add(item);
		}
	}

	public void remove(int item) {
		if (num_set.contains(item) == true) {
			num_set.remove(item);
		}
	}

	public void union(IntegerSet intSetb) {
		for(int i = 0; i < intSetb.num_set.size(); i++) {
			if(num_set.contains(intSetb.num_set.get(i)) == false){
				num_set.add(intSetb.num_set.get(i));
			}
		}
	}

	public void intersection(IntegerSet intsetb) {
		num_set.retainAll(intsetb.num_set);
	}

	public void difference(IntegerSet intSetb) {
		for(int i = 0; i < intSetb.length();i++) {
			if(num_set.contains(intSetb.num_set.get(i)) == true){
				num_set.remove(intSetb.num_set.get(i));
			}
		}
	}

	public boolean isEmpty() {
		if(num_set.isEmpty() == true){
			return true;
		}
		else {
			return false;
		}
	}

	public String ToString() {
		String setString = "";
		for(int i = 0; i < num_set.size(); i++) {
			setString += num_set.get(i).toString() + ' ';
		}
		return setString;
	}



}