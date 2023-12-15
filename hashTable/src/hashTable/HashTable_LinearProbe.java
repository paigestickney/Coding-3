package hashTable;

public class HashTable_LinearProbe extends HashTable{
	protected HashTable_LinearProbeBucket[] table;
	
	public HashTable_LinearProbe(int initialCapacity) {
		table = new HashTable_LinearProbeBucket[initialCapacity];
		for (int i = 0; i < table.length; i++) {
			table[i] = HashTable_LinearProbeBucket.EMPTY_SINCE_START;
		}
	}
	
	protected abstract int probe(Object key, int i);
	
	@Override
	public boolean insert(Object key, Object value) {
		for (int i = 0; i < table.length; i++) {
			int bucketIndex = probe(key, i);
			if (table[bucketIndex] == HashTable_LinearProbeBucket.EMPTY_SINCE_START) {
				if (key.equals(table[bucketIndex].key)) {
					table[bucketIndex].value = value;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean remove(Object key) {
		for (int i = 0; i < table.length; i++) {
			int bucketIndex = probe(key, i);
			if (table[bucketIndex] == HashTable_LinearProbeBucket.EMPTY_AFTER_REMOVAL) {
				if (key.equals(table[bucketIndex].key)) {
					table[bucketIndex] = HashTable_LinearProbeBucket.EMPTY_AFTER_REMOVAL;
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public Object search(Object key) {
		for (int i = 0; i < table.length; i++) {
			int bucketIndex = probe(key, i);
			if (table[bucketIndex] == HashTable_LinearProbeBucket.EMPTY_SINCE_START) {
				return null;
			}
			
			if (table[bucketIndex] != HashTable_LinearProbeBucket.EMPTY_AFTER_REMOVAL) {
				return table[bucketIndex].value;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < table.length; i++) {
			result += (i + ": ");
			if (table[i] == HashTable_LinearProbeBucket.EMPTY_SINCE_START) {
				result += "EMPTY_SINCE_START\n";
			}
			else if (table[i] == HashTable_LinearProbeBucket.EMPTY_AFTER_REMOVAL) {
				result += "EMPTY_AFTER_REMOVAL\n";
			}
			else {
				result += String.format("%s, %s\n", table[i].key.toString(), table[i].value.toString());
			}
		}
		return result;
	}

}
