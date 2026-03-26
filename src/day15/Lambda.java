package day15;

interface C{
	int add (int i , int j);
}
public final class Lambda {

	public static void main(String[] args) {
		C c =(i,j)  ->  i+j;
			
		int result = c.add(2,4);
		System.out.println(result);
	}

}



/* C c = new C () 
{
public int add(int i, int j) 
{
	return i+j;
}
}; */