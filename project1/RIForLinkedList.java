package project1;


import java.util.LinkedList;
import java.util.NoSuchElementException;


public class RIForLinkedList<T> implements ReversibleIterator{
	private LinkedList list;
	private Object current;
	private Object first;
	private Object back;
	int index = 0;
	
	//constructor sets current to first element
	public RIForLinkedList(LinkedList list){
			this.list = list;
			first = list.getFirst();
			back = list.getLast();
			current = list.getFirst();
	}
	
	//returns true is has previous else false
	public boolean hasPrevious() {
		if(current != first){
			return true;
		}else{
			return false;
		}
	}
	//return the previous element in the list
	public Object previous() {
		if(current != first){
			current = list.get(index);
			index--;
		}
		
		return current;
	}
	//return true if a next element can be returned
	public boolean hasNext() {
		if(current != back){
			return true;
		}else{
			
		return false;
		}
	}
	//retuns next element in the list
	public Object next() {
		if(current != back){
			
			current = list.get(index);
			index++;
		}
		
		return current;
	}
	//remove is not supported
	public void remove() {throw new UnsupportedOperationException();
		
	}


}
