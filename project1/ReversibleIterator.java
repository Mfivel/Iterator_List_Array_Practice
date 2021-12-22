package project1;

import java.util.Iterator;

public interface ReversibleIterator<T> extends Iterator {
	
	public boolean hasPrevious();//return true if a previous element can be returned
	public T previous();//return the previous element
	

}
