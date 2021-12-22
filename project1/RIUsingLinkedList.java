package project1;

import java.util.Iterator;



public class RIUsingLinkedList implements ReversibleIterator{
	private Iterator scan ;
	private PublicNode first;
	//private PublicNode last;
	private PublicNode current;
	private PublicLinkedList list;
	private int count = 0;
	private PublicNode pervious;
	public RIUsingLinkedList(Iterator iter){
		scan = iter;
		list = new PublicLinkedList<Object>();
		
	}

	//returns true if there is a previous object
	public boolean hasPrevious() {
		if(count > 0){
			System.out.println(count);
			return true;
		}
		
		else return false;
	}

	//returns element of previous object
	public Object previous() {
		if(count > 0)
		count--;
		return pervious.getElement();
	}

	//returns true if there is a next object
	public boolean hasNext() {
		
		return scan.hasNext();
	}

	//returns element of next object
	public Object next() {
		if(count ==0){
		count++;
		list.front.setElement(scan.next()); 
		current.setElement(list.front.getElement());
		//list.back.setElement(list.front.getElement());
		}
		if(count>0 && scan.hasNext()){
			pervious.setElement(current.getElement());
			current.setElement(scan.next());
			count++;
		}
		
		return current.getElement();
	}

	//remove is not supported
	public void remove() {throw new UnsupportedOperationException();
		
	}

}
