package hashTable;

public class Driver {
	public static void main(String[] args) {
		final int initialCapacity = 10;
		
		HashTable_LinearProbe table = new HashTable_LinearProbe(initialCapacity);
		table.insert(1,  7);
		table.insert(2,  21);
		table.insert(3,  89);
		table.insert(4,  45);
		table.insert(5,  94);
		table.insert(6,  27);
		table.insert(7,  84);
		table.insert(8,  99);
		table.insert(9,  1);
		table.insert(10,  10);
		table.insert(11,  36);
		table.insert(12,  77);
		table.insert(13,  83);
		table.insert(14,  51);
		table.insert(15,  48);
		table.insert(16,  95);
		table.insert(17,  11);
		table.insert(18,  32);
		table.insert(19,  79);
		table.insert(20,  80);
		
		table.toString();
		System.out.println(table);
		
		HashTable_Chaining table2 = new HashTable_Chaining(initialCapacity);
		table2.insert(1,  7);
		table2.insert(2,  21);
		table2.insert(3,  89);
		table2.insert(4,  45);
		table2.insert(5,  94);
		table2.insert(6,  27);
		table2.insert(7,  84);
		table2.insert(8,  99);
		table2.insert(9,  1);
		table2.insert(10,  10);
		table2.insert(11,  36);
		table2.insert(12,  77);
		table2.insert(13,  83);
		table2.insert(14,  51);
		table2.insert(15,  48);
		table2.insert(16,  95);
		table2.insert(17,  11);
		table2.insert(18,  32);
		table2.insert(19,  79);
		table2.insert(20,  80);
		
		table2.toString();
		System.out.println(table2);
	}

}
