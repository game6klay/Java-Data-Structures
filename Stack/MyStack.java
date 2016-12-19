public class MyStack {
	private static class StackNode<T> {

		private T data;
		private StackNode<T> next;

		public StackNode<T> (T data){

			this.data = data;
		}

	}

	private StackNode T top;

	public T pop(){

		if (top == null) throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		return item;
	}

	public T push(){

		StackNode<T> t = new StackNode<T>();
		t.next = top;
		top = t;
	}

	public T peek(){

		if (top == null) throw new EmptyStackException();
		return top.data;		
	}

	public boolean isEmpty(){

		return top == null;
	}

	
}