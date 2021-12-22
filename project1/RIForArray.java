package project1;

public class RIForArray<T> implements ReversibleIterator {
		private T array[];
		private int current = -1;
		
		public RIForArray(T array[]){
		this.array = array;
		
	}
	
	//return true if a previous element can be returned
	public boolean hasPrevious() {
		if (current <= 0 || current > array.length) {//current<= -1
		return false;
		}
		else return true;
	}
	
	//return the previous element
	public Object previous() {
		if (current > array.length || current <= 0) {//-1
			return null;
		} else { 
			current--;
			return array[current];
		}

	
	}

	//reversibleIterator extends iterator
	// Returns true if the iteration has more elements
	public boolean hasNext() {
		if(current < array.length-1 && current >= -1)
			return true;
		else
			
		return false;
		
	}

	//reversible Iterator extends iterator	
	 //Returns the next element in the iteration.
	public Object next() {
//		if(current == -1){
//			return array[0];
//		}
		if(current < array.length || current >= -1)//>-2
			current++;
			return array[current];
			
		
		
		 
	}

	//reversible iterator extends iterator
	//remove operation is not supported
	public void remove() {throw new UnsupportedOperationException();
		
	}
	//ressize array
	private void resize() {

		// creates new bigger array
		T newArray[];
		newArray = (T[])new Object[array.length *2];

		// moving values from old array to new bigger array
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}

		// old array is equal to the new array
		array = newArray;

	}
	//to string
	public String toString(){
		String result= " ";
		for(int i =0; i < array.length; i++)
		result += array[i]+ " " ;
		return result;
	}
	

}
