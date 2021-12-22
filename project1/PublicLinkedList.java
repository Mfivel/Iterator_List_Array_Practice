package project1;

import java.util.ArrayList;
import java.util.Iterator;

//stores the front and back of the listed list
public class PublicLinkedList<Object> {
	//the front and back of the list
	public PublicNode<Object>  front, back;//changed from public
	public PublicLinkedList(){
	front = back = null;
	}
}
