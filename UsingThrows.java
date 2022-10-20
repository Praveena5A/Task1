package Exception;

public class UsingThrows {
 public static void main(String[] args) throws ProductNotFoundException{
	 int price=10000;

	 if(price<=10000) {
		 throw new ProductNotFoundException("No products are there");
	 }
	 else {
		 System.out.println("product list");
	 }
	 }
	/* catch(ProductNotFoundException a) {
		 System.out.println(a+" "+"No products available for the condition");
		 a.printStackTrace();
	 }*/
 }

