/**
* DO NOT REMOVE THIS COMMENT
* STUDENT ID: 46358757
* STUDENT NAME: Dominic Wright
* [x]: add an 'x' inside the square brackets to declare that you haven't seen any other person's code
*/
package attempts;

public class Block {
	public int id; // Number
	public int rank; // position in the Chain
	public Block next;
	public Block head;
	public Block tail;
	

	// attributes to be added
	public int size;
	
	public Block(int id, int rank) {	 	  			     		 		    		 	
		this.id = id;
		this.rank = rank;
		this.next = null;
		
		// attributes to be added
	}	 	  			     		 		    		 	
	
	public Block(int id, int rank, Block next) {	 	  			     		 		    		 	
		this.id = id;
		this.rank = rank;
		this.next = next;
		
		// attributes to be added
	}	 	 
	
	public int size() {
		int count = 0;
		Block current = this;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	// Additional constructors may be added
	
	public void addToFront(int id, int rank) {
		Block temp = new Block(id, rank, head);
		head = temp;
	}

	// DO NOT MODIFY
	public String toString() {	 	  			     		 		    		 	
		String str = "(" + id + ", " + rank + ")";
		if (this.next == null) {
			return str;
		}
		return str + " -> " + next.toString();
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return the number of Blocks in the Chain that has an even ID.
	 */	 	  			     		 		    		 	
	public int numberEvenBlocks() {	 	  			     		 		    		 	
		Block current = this;
		int evenCount = 0;
		
		while(current != null) {
			if(current.id % 2 == 0) {
				evenCount++;
			}
			current = current.next;
		}
		return evenCount;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return the number of Blocks in the Chain that has an odd ID.
	 */	 	  			     		 		    		 	
	public int numberOddBlocks() {	 	  			     		 		    		 	
		Block current = this;
		int oddCount = 0;
		
		while(current != null) {
			if(current.id % 2 != 0) {
				oddCount++;
			}
			current = current.next;
		}
		return oddCount;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return true if the chain starting at the current node is a valid Collatz
	 *         chain and false otherwise. For a chain to be valid, it needs to
	 *         follow the 3n+1 rule but not necessarily have a valid rank. The fast
	 *         collatz chain should be treated as invalid.
	 */	 	  			     		 		    		 	
	public boolean isValid() {	 	  			     		 		    		 	
		Block current = this;
		int temp = 0;
		int counter = 0;
		int size = size();
		
		for(int i = 0; i<size-1; i++) {
			if(current.id % 2 == 0) {
				temp = current.id/2;
			}
			else {
				temp = current.id*3+1;
			}
			
			if(temp == current.next.id) {
				counter++;
			}
			current = current.next;
		}
		
		if(counter >= size-1) {
			return true;
		}	

		return false;
	}
		
	
	/**	 	  			     		 		    		 	
	 * IMPORTANT: Even thought this method is in the Block class, it may be harder
	 * than most in the Chain class.
	 * 
	 * @return true if the chain starting at the current node is either a valid
	 *         Collatz chain or a fast Collatz chain. In this question, you also
	 *         need to ensure that the rank is valid. A valid rank starts at 1 and
	 *         increases with one.
	 */	 	  			     		 		    		 	
	public boolean isValidAdvanced() {	 	  			     		 		    		 	
		return false;
	}	 	  			     		 		    		 	
}
