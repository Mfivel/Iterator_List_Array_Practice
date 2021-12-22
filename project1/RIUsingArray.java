package project1;

import java.util.Iterator;



public class RIUsingArray implements ReversibleIterator {
	public RIUsingArray(Iterator iter){
		
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object previous() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
//private Iterator<T> iter;
//private int counter = -1;
//private int index = 0 ;
//private Object  array [] ;
//private T previous;
//	public RIUsingArray(Iterator it,int size){
//		
//		iter = it;
//		//array = new Object[];
//		//array =(Object[]) ( new Object( array[size]));
//		//array = (T[])new Object[size];
//		System.out.println(iter.next());
//		Object element = iter.next();
//		array[index] = new Object(); 
//		//help(iter.next());
//		//System.out.println(array[0]);
//		//System.out.println(element);
//		System.out.println(array[0].toString());
//	}
//
//	//returns true if has previous element
//	public boolean hasPrevious() {
//		if(counter <= 0){
//		return false;
//		}
//		else return true;
//	}
//
//	
//	public T previous() {
//		
//		
//		return previous;
//		
//	}
//
//	
//	public boolean hasNext() {
//		
//		return iter.hasNext();
//	}
//
//	
//	public Object next() {
//		if(iter.hasNext())
//			array = new Iterable [counter];
//			//array.add(iter.next());
//			counter++;
//		
//		return iter.next();
//	}
//
//	//remove is not supported
//	public void remove() {throw new UnsupportedOperationException();}
//	
//	//add elements to the array
//	public void add(Iterable element) {
//		//if (size >= array.length) {//array starts at index zero
//			//resize();
//			array[counter+1] = element;//because counter starts at -1
//
//		}
//		
//
//	
//	//ressize array
//	private void resize() {
//
//		// creates new bigger array
//		Iterable newArray[];
//		newArray = (Iterable[])new Object[array.length *2];
//
//		// moving values from old array to new bigger array
//		for (int i = 0; i < array.length; i++) {
//			newArray[i] = array[i];
//		}
//
//		// old array is equal to the new array
//		array = newArray;
//
//	}
//
//	//to string
//	public String toString(){
//		String result= " ";
//		for(int i =0; i < array.length; i++)
//		result += array[i]+ " " ;
//		return result;
//	}
//	public void help (Object obj){
//		obj = iter.next();
//		array[index]= obj;
//		System.out.println(array.toString());
//	}
}
