package org.howard.edu.lsp.midterm.problem51;
import java.util.*;

public class IntegerRange implements Range {
    	private int lower;
    	private int upper;

		public int getUpper() {
			return upper;
		}
		public int getLower(){
			return lower;// Hint: implement getters for lower and upper
		}
    
   	 	IntegerRange(int lower, int upper) { 	// Constructor
        		this.lower = lower;
        		this.upper = upper;
   	 	}
   	 	public boolean contains(int value) {
			return value >= lower && value <= upper;// implement
   	 	}
   	 	public boolean overlaps(Range other) throws EmptyRangeException {
   	 		return other.contains(lower);
   	 		other.contains(upper);// implement
   	 	}

   	 	public int size()  {
   	 		return upper - lower + 1;// implement
   	 	}
}

