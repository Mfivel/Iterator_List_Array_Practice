package project1;

import java.util.ArrayList;
import java.util.Iterator;

public class RIUsingArrayList<T, array, E> implements ReversibleIterator{
	private Iterator  scan;
	private ArrayList<E> array;
	Iterator arrayiter;
	int index = 0;
	private Iterator scan2;
	
	public RIUsingArrayList(Iterator iter, int size){
		scan = iter; 
		int s= 0;
		while(iter.hasNext()){
			Object item = iter.next();
			array.add(index,(E) item);
		}
		//while(s <= size){
			//scan2 = array.iterator();
			System.out.println(array);
			//array.listIterator()= scan;
		//}
		//System.out.println(scan.next());
		//array.set(index, iter.next());
		//arrayiter =  array.iterator();
		
		//System.out.println(arrayiter.next());
	}
//	private ArrayList <T> array;
//	private RIForArrayList RIarry;
//	int counter = -1;//starts counter at -1
//	int prev = -2;
//	private Iterator<T> scan2;
//	RIUsingArrayList(Iterator <T> iter){
//		scan = iter;
//		scan2= iter;
//		//System.out.println(iter.next());
//		//System.out.println(scan.next());
//		//System.out.println(scan2.next());
//		//System.out.println(((ReversibleIterator) scan).previous());
//		//System.out.println(previous());
//	}
//
//	public boolean hasPrevious() {
//		System.out.println(counter);
//		if(counter <= 0){
//			return false;
//		}
//		else return true;
//	}
//	//returns previous element increments counter by -1
//	public T previous() {
//		if(hasPrevious())
//		counter--;
//		prev--;
//		return array.get(counter);
//	}
//	//returns true if has next element else false
//	public boolean hasNext() {
//		//if(counter < array.size())
//		
//		return scan.hasNext();
//		//return false;
//	}
//	//returns next element increments counter by 1
//	public T next() {
//		System.out.println("in RI does it?" +scan.hasNext());
//		//if(scan.hasNext())
//		//if(counter < array.size()|| counter == -1);
//		T element = scan.next();
//		//for(int i = 0; i<=1;i++);
//		array.add(scan.next());
//			//System.out.println(scan.next());                
//		counter++;	
//		prev++;
//		System.out.print(counter);
//		System.out.println(array.toString());
////		scan.next();
//		
////		//array.add(element);
////		array.add(counter, element);
////		System.out.println(array.toString());
//	//return array.get(counter);
//	return scan.next();
//	}
//	
	//not supported
	public void remove() {
		throw new UnsupportedOperationException();
		
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
}
