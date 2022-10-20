package Exception;

public class ArithExcep {
  public static void main(String[] args) {
	  int num=10;
	  int num1=0;
	  try {
		  int num2=num/num1;
		  System.out.println(num2);
	  }
	  catch(Exception e) {
		  System.out.println(e+" "+"we can not divide 0 by any numbers");
		  e.printStackTrace();
	  }
  }
}
