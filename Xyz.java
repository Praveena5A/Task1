package Exception;

public class Xyz {
  public static void main(String[] args) {
	  
	  try{
		  int a=4;
	      int b=2;
	  System.out.println(a/b);
	  
	  String a1=null;
	  System.out.println(a1.length());
	  
	  String a3="ram";
	  int a4=Integer.parseInt(a3);
	  System.out.println(a4);
	  
	 int nums[]= {2,4,6};
	 System.out.println(nums[7]);
	 
	 String name="Raj";
	 System.out.println(name.charAt(10));
  }
	  catch(ArithmeticException ae) {
		  System.out.println(ae+" "+"we can't divide 0 by any Numbers");
		  ae.printStackTrace();
	  }
	  catch(NullPointerException ne) {
		  System.out.println(ne+" "+"we can't find length for null");
		  ne.printStackTrace();
	  }
	  catch(NumberFormatException nn) {
		  System.out.println(nn+" "+"we can't pass the string to int");
		  nn.printStackTrace();
	  }
	  catch(ArrayIndexOutOfBoundsException aa) {
		  System.out.println(aa+" "+"We can only give the values for the size");
		  aa.printStackTrace();
	  }
	  catch(StringIndexOutOfBoundsException se) {
		  System.out.println(se+" "+"Index out of bounds for string");
		  se.printStackTrace();
	  }
  }
}
