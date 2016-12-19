public class Link {
	
	/*
		each node would have two properties - name of the node mostly what are the objects about in the linked list 
		and the value the each name of the object holds 
	*/

		public String bookName;
		public int millionsSold;
		

		public Link next;

    // Reference to next link made in the LinkList
    // Holds the reference to the Link that was created before it
    // Set to null until it is connected to other links

		public Link (String bookName,int millionsSold ){

			this.millionsSold = millionsSold;
			this.bookName = bookName;
		}

		public void display(){

			System.out.println(bookName + "has" + millionsSold+"00,000 Sold");

		}

		public String getBookNameString (String bookName) {

			return bookName;
		}


}


class LinkedList {

	// Reference to first Link in list
    // The last Link added to the LinkedList

	public Link firstLink;

	// initiate LinkedList with firstLink set as null
	public LinkedList(){

		firstLink = null;
	}

	public boolean isEmpty(){

		if (firstLink = null){

			return firstLink;
		}
	}

	public void insertFirstLink(String bookName, int millionsSold) {

		Link link = new Link(String bookName, int millionsSold);

		// Connects the firstLink field to the new Link

			link.next = firstLink;

			firstLink = link;

	}

	public Link removeFirst(){

		Link linkReference = firstLink;

		if (!isEmpty()){

			// Removes the Link from the List

			firstLink.next = firstLink;
		} else {

			System.out.println("List is empty");
		}

		return linkReference;
	}

	public Link find (String bookName) {

		Link linkReference = firstLink;

		if (!isEmpty()){

			 while(linkReference.bookName != bookName) {

			 	// Checks if at the end of the LinkedList

			 	if (linkReference.next == null) {

			 		return null;
			 	}

			 	linkReference = linkReference.next;
			 }
		} 

		return linkReference;
	}

	public Link removeLink(String bookName) {

		Link linkReference = firstLink;

		if(!isEmpty()) {

			while(linkReference.next != null) {

				if (linkReference.bookName != bookName){

					linkReference = linkReference.next;

				}

				else {

					linkReference.next = linkReference;

				}

			}

			return System.out.println("Book not found");

		}

		return linkReference;
	}







}