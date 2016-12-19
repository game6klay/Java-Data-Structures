public class RemoveDuplicates {
	
	public void removeDups (Node head) {

		HashTable ht = new HashTable();

		if (ht.containsKey(head.data)){
			
			head.data = head.next.data;
			head.next = head.next.next;
		}
		else {

			ht.put(head.data, true);
			removeDups(head.next);
		}



	}

	public void followup (Node head) {

		Node point = head.next
		while(point != null) {

			if (point.data.equals(head.data)){

				point.data = point.next.data;
				point.next = point.next.next;
			}

			point = point.next;


		}

		followup(head.next);


	}
}