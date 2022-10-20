package Exception;

public class Number {
   public static void main(String[] args) {
	  try {
		  String val="ram";
	  int val1=Integer.parseInt(val);
	  System.out.println(val1);
   }
	  catch(NumberFormatException a) {
		  System.out.println(a+" "+"we can not change the string to int");
		  a.printStackTrace();
	  }
	  
   }
}
