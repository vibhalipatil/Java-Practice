package Day1;

public class OverRiding { 
	
	public String getresult() {
	 AvdCalc obj = new AvdCalc();
	 
     int Addition = obj.add(2, 3);
     int Subtraction = obj.sub(5, 3);
     int Division = obj.div(20 , 2);
    
     return Addition + ":" + Subtraction + ":" + Division ;
    }
}