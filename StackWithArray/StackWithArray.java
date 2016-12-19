public class StackWithArray {
	
	private String[] stackArray;
	private int stackSize;

	// Sets stack as empty
	private int topOfStack = -1;

	StackWithArray(int size) {

		stackSize = size;
		stackArray = new String[size];

		Arrays.fill(stackArray, "-1");

	}

	public void push(String input){

		if (topOfStack +1 <stackSize) {

			topOfStack ++;
			stackArray[topOfStack] = input;
		}

		else {System.out.println("Sorry but the stack is full")};

		displayTheStack();
	}

	public String pop(){

		if (topOfStack==-1){
			System.out.println("the stack is empty");
			return -1;

		}



		else {

			stackArray[topOfStack] = -1;
			return stackArray[topOfStack--];
		}
	}


	public String peek() {

		return stackArray[topOfStack];

	}

	public boolean isEmpty() {

		if (topOfStack = -1) {

			return true;
		}

		return false;
	}

	public void displayTheStack(){

		for (i=0;i<=stackSize;i++){

			if (stackArray[n].equals("-1")) {

				System.out.print("  ");
			}else 

			System.out.println("| "+stackArray[i]+" |");
		}

	}


	public static void main (String[] args) {

		StackWithArray stack = new StackWithArray();

		stack.push("10");
		stack.push("12");
		stack.push("17");

		stack.peek();

		stack.pop();
		stack.pop();

		if (stack.isEmpty()){
			System.out.println("the stack is empty");
		}
		else{

			stack.pop();
		}



	}



}


