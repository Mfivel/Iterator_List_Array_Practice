package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;



public class RITester{
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("This program was written by Michelle Almendarez\n");
		System.out.println("TESTING RIForArrayList");
		System.out.println("\nTESTING WITH INTEGERS");
		//Create arraylist and RI with integers 10 elements
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		System.out.println("Adding integers 1-20 to an arrayList");
		for(int i=1; i<= 10; i++){
			arrayList1.add(i);
		}
		System.out.println(arrayList1);		
		RIForArrayList <Integer>RIarrayList1 = new RIForArrayList<Integer>(arrayList1);
		
		//Create arraylist and RI with string 11 elements
		ArrayList<String> arrayList2 = new ArrayList<String>() ;
		//adding string to arraylist2
		arrayList2.add("I'm");
		arrayList2.add("sad");
		arrayList2.add("I");
		arrayList2.add("have");
		arrayList2.add("way");
		arrayList2.add("too");
		arrayList2.add("much");
		arrayList2.add("homework");
		arrayList2.add("to");
		arrayList2.add("do");
		arrayList2.add(" =(");
		RIForArrayList<String> RIarrayList2 = new RIForArrayList<String>(arrayList2);
		
		//Create arraylist and RI with Song
		// FILLS PLAYLIST WITH PURE60S
		Playlist pure60 = new Playlist("Pure 60s");
		Scanner scan2 = new Scanner(new File("pure-60s.txt"));
		while (scan2.hasNextLine()) {
			String line = scan2.nextLine();
			int tab61 = line.indexOf('\t');
			int tab62 = line.indexOf('\t', tab61 + 1);
			int tab63 = line.indexOf("\t", tab62 + 1);
			if (tab61 >= 0 && tab62 >= 0 && tab63 >= 0) {
				String title = line.substring(0, tab61);
				String time = line.substring(tab61 + 1, tab62);
				String artist = line.substring(tab62 + 1, tab63);
				String album = line.substring(tab63 + 1);
				pure60.addSong(new Song(title, time, artist, album));
			}

		}
		scan2.close();
		//CREATE SONG ITERATOR PLAYLIST AND ARRAYLIST
		Iterator<Song> iterator = pure60.iterator();
		ArrayList<Song> arrayList3 = new ArrayList<Song>() ;
		RIForArrayList <Song>RIarrayList3 = new RIForArrayList<Song>(arrayList3);
		
		//FILL THE ARRAY USING PLAYLIST ITERATOR
		while(iterator.hasNext()){
			arrayList3.add(iterator.next());
			
		}
		//RIForArrayList TESTS		
		//Integer tests
		System.out.println("Test with pattern 1");
		testPattern1(RIarrayList1);
		System.out.println("\nReturning to first element in the Iterator and test with pattern 2");
		testPattern2(RIarrayList1);
		System.out.println("Return to last element in the Iterator");
		returnToLast(RIarrayList1);
		
		//RI_FOR_ARRAY_LIST String tests
		System.out.println("\n");
		System.out.println("TESTING arraylist with STRINGS");
		System.out.println("Filling arraylist with strings" + arrayList2);
		System.out.println("\nTest with pattern 1");
		testPattern1(RIarrayList2);
		System.out.println("\nReturning to first element in the Iterator and test pattern 2");
		testPattern2(RIarrayList2);
		System.out.println("Return to last element in the Iterator");
		returnToLast(RIarrayList2);
		System.out.println("Return to first element in the Iterator");
		returnToFront(RIarrayList2);
		
		//RI_FOR_ARRAY_LIST Song tests
		System.out.println("\n");
		System.out.println("TESTING arraylist with SONGS");
		System.out.println("Filling array with Songs from playlist" );
		System.out.println(arrayList3 + "\n");
		System.out.println("Test with pattern 1");
		testPattern1(RIarrayList3);
		System.out.println("\nReturning to first element in the Iterator and test with pattern 2");
		testPattern2(RIarrayList3);
		System.out.println("Return to first element in the Iterator:");
		returnToFront(RIarrayList3);
		//System.out.println(RIarrayList3.hasNext());
		System.out.println("---\nEND OF RIForArrayList TESTS\n----");
		
		//TESTING RIForArray
		//CREATING RIForARRAY
		Integer[] moreArrays = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		RIForArray forArray1 = new RIForArray(moreArrays);
		
		//RI_FOR_ARRAY INTEGER TESTS
		System.out.println("TESTING RIForArray");
		System.out.println("\nTESTING WITH INTEGERS");
		System.out.println("TESTING!!!!!!!!!!!!");
		System.out.println(forArray1);
//
////		System.out.println(forArray1.hasPrevious());
////		System.out.println(forArray1.next());
////		System.out.println(forArray1.next());
////		System.out.println(forArray1.next());
////		System.out.println(forArray1.hasPrevious());
////		System.out.println(forArray1.next());
////		System.out.println(forArray1.next());
////		System.out.println(forArray1.next());
////		System.out.println(forArray1.next());
////		System.out.println(forArray1.next());
////		System.out.println(forArray1.next());
////		System.out.println(forArray1.next());
////		System.out.println(forArray1.hasPrevious());
		
		System.out.println("Test with pattern 1");
		System.out.println("Starts at first element");
		System.out.println("testPattern calls next and begins test");
		testPattern1(forArray1);
		System.out.println("Return to last element in the Iterator");
		returnToLast(forArray1);
		//returnToFront(forArray1);
		
		
		//RI_FOR_ARRAY String tests
		String[] moreArrays2 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		RIForArray forArray2 = new RIForArray(moreArrays2);
		System.out.println("\n");
		System.out.println("TESTING array with STRINGS");
		System.out.println("Filling array with strings" + forArray2);
		System.out.println("\nTest with pattern 1");
		System.out.println("Using next");
		testPattern1(forArray2);
		System.out.println("Return to last element in the Iterator");
		returnToLast(forArray2);
		returnToFront(forArray2);
		System.out.println("----END TESTING FOR RIForArray\n----");
		
		System.out.println("TESTING RIForLinkedList");
		System.out.println("\nTESTING WITH SONGS");
		System.out.println("TESTING!!!!!!!!!!!!");
		//create collectionlinkedList
		
		//READ MAMA-PAPAS
		Playlist mamas = new Playlist("Mamas");
		Scanner scanner = new Scanner(new File("mamas-papas.txt"));
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			int tab61 = line.indexOf('\t');
			int tab62 = line.indexOf('\t', tab61 + 1);
			int tab63 = line.indexOf("\t", tab62 + 1);
			if (tab61 >= 0 && tab62 >= 0 && tab63 >= 0) {
				String title = line.substring(0, tab61);
				String time = line.substring(tab61 + 1, tab62);
				String artist = line.substring(tab62 + 1, tab63);
				String album = line.substring(tab63 + 1);
				mamas.addSong(new Song(title, time, artist, album));
			}

		}
		scanner.close();
		
		//fill in linkedlist with songs
		Iterator<Song> scanning = mamas.iterator();
		LinkedList<Song> coll = new LinkedList<Song>();
		
		while(scanning.hasNext()){
			
			coll.add(scanning.next());
		}
		RIForLinkedList link = new RIForLinkedList(coll);
		System.out.println("fill and LinkedList start at first element" + "\n" + coll);
		System.out.println("Does it have a next? : " + link.hasPrevious());
		System.out.println(" Testing with pattern 2");
		testPattern2(link);
		System.out.println("return to last element on the list ");
		returnToLast(link);
		System.out.println("\nDoes last element have next?: " +  link.hasNext());
		System.out.println("----END RIForLinkedList TESTING-------");
		
	
		

		
		
		
		
		
		
		
		
//		///TESTING RIUSING LINKEDLIST 
//		ArrayList listing = new ArrayList();
//		for(int e =80; e<=90; e++){
//		listing.add(e);
//		}
//		Iterator numIter = listing.iterator();
//		RIUsingLinkedList RILL = new RIUsingLinkedList(numIter);
//		System.out.println(listing);
//		System.out.println(RILL.next());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//TESTING FOR RI_USING_ARRAY
//		System.out.println("TESTING RIUsingArray");
//		System.out.println("\nTESTING WITH INTEGERS");
//		System.out.println("TESTING!!!!!!!!!!!!");
//		
//		//Integer[] moreAndMoreArrays = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
//		ArrayList elements = new ArrayList();
//		elements.add(54);
//		elements.add(98);
//		elements.add(27);
//		elements.add(32);
//		elements.add(44);
//		elements.add(-8);
//		elements.add(12);
//		elements.add(0);
//		elements.add(100);
//		elements.add(55);
//		elements.add(87);
//		Iterator newIter = elements.iterator();
//		//ArrayList test = new ArrayList();
//		//while(newIter.hasNext())
//		//{
//			//test.add(newIter.next());
//		//}
//		
//		//}
//		//System.out.println(elements);
//		//returnToFront(test);
//		RIUsingArrayList<Object, Object, Object> newele= new RIUsingArrayList<Object, Object, Object>(newIter,10);
//		System.out.println(newIter.next());
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		//TESTING RI_USING_ARRAYLIST
//		System.out.println("TESTING RIUsingArrayList");
//		System.out.println("\nTESTING WITH SONGS");
//		System.out.println("TESTING!!!!!!!!!!!!");
//		ArrayList <Integer> evenMoreArrays = new ArrayList<Integer>();
//		for(int i =100;i<= 110;i++ ){
//		evenMoreArrays.add(i);
//		}
//		System.out.println(evenMoreArrays);
//		Iterator it = evenMoreArrays.iterator();
//		//System.out.println(it.next());
////		//returnToFront(it);
//		RIUsingArrayList itering = new  RIUsingArrayList(it);
////		//returnToFront(it);
//		System.out.println("Does it have a next?: " + itering.hasNext());
//		System.out.println("Using ri " + itering.next());
////		System.out.println(it.hasNext());
////		
////		System.out.println("What is this? " + it.next());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	//as long as i have 10 elements or more
	public static void testPattern1(ReversibleIterator RI ){
		RI.next();//1
		System.out.println("Does element have pervious? Answer: " + RI.hasPrevious());
		System.out.println("Using next: " + RI.next());//2
		RI.next();//3
		RI.next();//4
		RI.next();//5
		System.out.println("Using next four times: " + RI.next());//6
		System.out.println("Using previous once: " + RI.previous());//5
		RI.next();//6
		RI.next();//7
		RI.next();//8
		RI.next();//9
		RI.next();//10
		System.out.println("Using next five times and previous once: " + RI.previous());//9
		System.out.println("Using next once. Iterator is at the last element on the array " + RI.next());//10
		System.out.println("Does element have next? Answer:  "+ RI.hasNext());
		System.out.println("Does element have previous? Answer:  "+ RI.hasPrevious());
		System.out.println("Using pervious once. Iterator is at second to last element: " + RI.previous());//9
		System.out.println("Does element have next? Answer: " + RI.hasNext());
		
		
	}
	//returns to first element on arraylist
	public static void returnToFront(ReversibleIterator RI){
		while(RI.hasPrevious()){
			System.out.print(RI.previous()+ " ");
		}
	
	}
	public static void testPattern2(ReversibleIterator RI){
		//returns to the very first element
		returnToFront(RI);//1
		
		RI.next();//2
		System.out.println("\nUsing next: " + RI.next());//3
		System.out.println("Does element have pervious? Answer: " + RI.hasPrevious());
		RI.next();//4
		RI.next();//5
		RI.next();//6
		System.out.println("Using next four times: " + RI.next());//7
		System.out.println("Using previous once: " + RI.previous());//6
		RI.next();//7
		RI.next();//8
		RI.next();//9
		RI.next();//10
		System.out.println("Using next five times and previous once: " + RI.previous());//9
		System.out.println("Does element have next? Answer:  "+ RI.hasNext());
		System.out.println("Does element have previous? Answer:  "+ RI.hasPrevious());
		System.out.println("Using pervious once. " + RI.previous());//8
		RI.previous();//7
		RI.previous();//6
		RI.previous();//5
		RI.previous();//4
		RI.previous();//3
		RI.previous();//2
		System.out.println("Using previous seven times: " + RI.previous());//1
		System.out.println("Does element have next? Answer:  "+ RI.hasNext());
		System.out.println("Does element have previous? Answer:  "+ RI.hasPrevious());
		
		
	}
	//set iterator at last element
	public static void returnToLast(ReversibleIterator RI){
		while(RI.hasNext()){
			System.out.print(RI.next()+ " ");
		}
	}
	
}

