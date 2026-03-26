package day8;

import java.util.ArrayList;

class student {
	int Rollno;
	String Name;
}
public class arraylist {

	public static void main(String[] args) {
		/*student s1 = new student();
		s1.Rollno = 1;
		s1.Name = "Riya";
		
		student s2 = new student();
		s2.Rollno= 2;
		s2.Name= "Snehal";
		
		student s3 = new student();
		s3.Rollno= 3;
		s3.Name= "Shruti";
		
		student s4 = new student();
		s4.Rollno= 4;
		s4.Name= "Snehal";
		
		student students[] = new student[4];
		students[0]= s1;
		students[1]= s2;
		students[2]= s3;
		students[3]= s4;
		
		for (int i =0; i< students.length; i++){
			System.out.println(students[i].Rollno + " " + students[i].Name);
		}*/
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Vibhali");
		a.add("Snehal");
		System.out.println(a.get(1));
		
		for(int i = 0; i <a.size(); i++) {
			System.out.println(a.get(i));
		}
		for (String val : a) {
			System.out.println(val);
		}
		System.out.println(a.contains("Vibhali"));
		System.out.println(a.contains("Yugal"));
	}

}
