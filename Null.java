package Exception;

public class Null {
public static void main(String[] args) {
	try{
		String name=null;
	
	System.out.println(name.length());
	}catch(NullPointerException e) {
		System.out.println(e+" "+"we can not find length for null");
		e.printStackTrace();
	}
}
}
