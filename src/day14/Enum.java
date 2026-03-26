package day14;

enum Status{
	Hello, Yugal, Baba, 
}
public class Enum {

	public static void main(String[] args) {
		/*Status s = Status.Yugal;
		System.out.println(s);*/
		
		Status[] ss = Status.values();
		for (Status s : ss) {
			System.out.println(s + ":" + s.ordinal());
		}
	}

}
