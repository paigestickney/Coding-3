package hashTable;

public class HashTable_LinearProbeBucket {
	public Object key;
	public Object value;
	
	public static final HashTable_LinearProbeBucket EMPTY_SINCE_START = new HashTable_LinearProbeBucket(null, null);
	public static final HashTable_LinearProbeBucket EMPTY_AFTER_REMOVAL = new HashTable_LinearProbeBucket(null, null);
	
	HashTable_LinearProbeBucket (Object bucketKey, Object bucketValue) {
		key = bucketKey;
		value = bucketValue;
	}
	
	boolean isEmpty() {
		return this == EMPTY_SINCE_START || this == EMPTY_AFTER_REMOVAL;
	}

}
