package hashTable;

public abstract class HashTable {
	protected int hash(Object key) {
		long keyHash = key.hashCode();
		if (keyHash < 0) {
			keyHash += 2147483648L;
		}
		return (int)keyHash;
	}
	public abstract boolean HashInsert(Object key, Object value);
	
	public abstract Object HashSearch(int key);
	
	public abstract boolean HashDelete(Object key);

}
