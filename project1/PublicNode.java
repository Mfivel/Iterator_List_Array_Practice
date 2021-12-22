package project1;
//stores an element and references to the prev and next nodes in the list
public class PublicNode<Object> {
	// element is stored in the node
	private Object element;
	//the previous and next nodes in the list
	private PublicNode<Object> previous, next;
	
	
	//construct the node with the element to store
	public PublicNode(Object element){
		this.element = element;
		previous = next = null;
	}
	public PublicNode<Object> getNext(){
		return next;
	}
	public PublicNode<Object> getPervious(){
		return previous;
	}
	
	public void setNext(PublicNode<Object> node){
		next = node;
	}
	public void setPrevious(PublicNode<Object> node){
		previous = node;
	}
	public Object getElement(){
		return element;
	}
	public void  setElement(Object object){
		this.element = element;
	}
	
}
