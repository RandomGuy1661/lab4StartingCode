package exercise2;

public class MyNode<E>
{

	private E element;
	private MyNode<E> next;
	private MyNode<E> prev;
	
	public MyNode(E element ){
		this.element = element;
		this.setNext(null);
		this.setPrev(null);
	}
	
	public E getElement() {
		return element;
	}

	public MyNode<E> getPrev() {
		return prev;
	}

	public void setPrev(MyNode<E> prev) {
		this.prev = prev;
	}

	public MyNode<E> getNext() {
		return next;
	}

	public void setNext(MyNode<E> next) {
		this.next = next;
	}

}
