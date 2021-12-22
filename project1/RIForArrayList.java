package project1;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class RIForArrayList<T>  implements ReversibleIterator{
	   private int previous, next; // indexes of previous and next elements
	   private ArrayList<T> array; // the ArrayList to reversibly iterate

	   public RIForArrayList(ArrayList<T> list) {
	      this.array = list;
	      previous = -2; // the current index is inbetween previous and next
	      next = 0;
	   }

	   // checks to see if next (previous) are legal indexes
	   //return true if a next element can be returned
	   public boolean hasNext() { return next >= 0 && next < array.size(); }
	   //return true if a previous element can be returned
	   public boolean hasPrevious() { return previous >= 0 && previous < array.size(); }
	   
	   // Returns the next element in the iteration.
	   // need to update both previous and next
	   public T next() {
	      if (! hasNext()) throw new NoSuchElementException();
	      previous++;  next++;
	      return array.get(next - 1);
	   }
	   //return the previous element
	   // don't seem to need previous much
	   public T previous() {
	      if (! hasPrevious()) throw new NoSuchElementException();
	      previous--;  next--;
	      return array.get(next - 1);
	   }

	   // The remove operation is not supported.
	   public void remove() { throw new UnsupportedOperationException(); }
	}
	



