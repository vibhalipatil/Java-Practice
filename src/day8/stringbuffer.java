package day8;

public class stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Vibhali");
		sb.append( " "+"Patil");
		sb.insert(0, "Yugal ");
		 //sb.reverse();  
		 sb.delete(6, 13); 
		System.out.print(sb);
		

	}

}
