package hashTable;

public class HashTable_ChainingItem {
	public Object key;
	public Object value;
	public HashTable_ChainingItem next;
	
	HashTable_ChainingItem(Object itemkey, Object itemValue) {
		key = itemkey;
		value = itemValue;
		next = null;
	}

}
