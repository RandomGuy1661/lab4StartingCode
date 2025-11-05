package exercise2;

public class MyNode<E>
{

	private E element;
	private MyNode<E> next;
	private MyNode<E> prev;
	
	/**
	 * constructor 
	 * @param element
	 */
	public MyNode(E element ){
		this.element = element;
		this.setNext(null);
		this.setPrev(null);
	}
	
	/**
	 * gets the element of the node
	 * @return element of the node
	 */
	public E getElement() {
		return element;
	}

	/**
	 * gets the previous node node 
	 * @return the previous node
	 */
	public MyNode<E> getPrev() {
		return prev;
	}

	/**
	 * sets the previous nodes
	 * @param prev previous node
	 */
	public void setPrev(MyNode<E> prev) {
		this.prev = prev;
	}

	/**
	 * gets the next node
	 * @return the next node
	 */
	public MyNode<E> getNext() {
		return next;
	}

	/**
	 * sets the next node to the input node
	 * @param next the node you want to replace the current with
	 */
	public void setNext(MyNode<E> next) {
		this.next = next;
	}

}
