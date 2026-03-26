package day8;

public class string {

	public static void main(String[] args) {
		String name = new String("Vibhali");
		String name1 = "Yugal";
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name.charAt(3));
		System.out.println(name.concat("Patil"));
		System.out.println ("**************");
		String s = "Vibhali Satish Patil";
		String [] splittedstring = s.split("Satish");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[1].trim());
		for(int i =0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println ("**************");
		for(int i =s.length()-1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
