package day5;

public class whileloop {

	public static void main(String[] args) {
		String a = "Vibhali";
		String b = "Yugal";
		String result1 = "";
		String result2 = "";
		String finals = "";
		
		for(int i= 6; i>=0; i--) {
			result1 = result1 + a.charAt(i);
		}
		for (int i=4; i>=0;i--) {
			result2 = result2 + b.charAt(i);
		}
		System.out.println(result1);
		System.out.println(result2);
		
		int i =0;
		while(i < result1.length() || i < result2.length()) {
			if (i < result1.length()){
				finals = finals + result1.charAt(i);
			}
			if (i < result2.length() ) {
				finals = finals + result2.charAt(i);
			}
			i ++;
		}
		System.out.println(finals);
	}

}
