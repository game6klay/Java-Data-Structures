import java.util.ArrayList;

public class HashTable {

	// create a array or ArrayList of HashTables 
	// we have two integer value where one is the size of the ArrayList and other is limit of the number of buckets added to one chain 
	// in the constructor we have to initialize the num of buckets to its capacity with null values 

	private ArrayList<HashNode<K, V>> bucketArray;

	private int size;
	private int numBuckets;

	public HashTable() {

		bucketArray = new ArrayList<HashNode<K, V>>;
		numBuckets = 10;
		size =0;

		for (i=0;i<numBuckets;i++) {

			bucketArray.add(null);
		}
	}

	public int size() { return size; }
	public boolean isEmpty() { return size() == 0; }

	public int getBucketIndex() {

		int hash = key.hashCode();
		int index = hash % numBuckets;
		return index;
	}

	public V remove (K key) {

		int bucketIndex = key.getBucketIndex();

		HashNode prev = null;

		// Get head of chain
        HashNode<K, V> head = bucketArray.get(bucketIndex);

		while (head != null) {

			if (head.getKey().equals(key)) {
				break;
			}

			prev = head;
			head = head.next;

		}

		if (head == null) {

			return null;
		}

		size --;

		// remove the given value for a key 

		if (prev != null) {

			prev.next = head.next;
		}

		else {

			bucketArray.set(bucketIndex,head.next);
		}
		return head.value();
	}

	public void add (K key, V value) {

		int bucketIndex = getBucketIndex(key);

		HashNode head = bucketArray.get(bucketIndex);

		// Check if key is already present

		while (head != null) {

			if (head.key.equals(key)){
				return
			}
			head = head.next;
		}

		// Insert key in chain
		size ++;
		head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

		// If load factor goes beyond threshold, then
        // double hash table size
        if ((size/numBuckets >= 0.7)) {

        	
        }


	} 



}

class HashNode<K,V> {

	K key;
	V value;

	HashNode <K, V> next;

	public HashNode (K key, V value) {

		this.key = key;
		this.value = value;
		next = null;
	}

}