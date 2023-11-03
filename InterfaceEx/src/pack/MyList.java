package pack;

public interface MyList {
	public void Appdnd(int x);
	
	public void Prepend(int x);
	
	// possibility for this to not work if there is no w in the list
	// if don't achieve the goal, have to deal with that
	public boolean InsertAfter(int w, int x);
	
	public boolean Remove(int x);
	
	public int Search(int x);
	
	public void Print();
	
	public void PrintReverse();
	
	// can do void or MyList, but for this ex. saying void
	public void Sort();
	
	public boolean IsEmpty();
	
	public int GetLength();
	// no implementation after so that's why you'd end statement with ";"

}
