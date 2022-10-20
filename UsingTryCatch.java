package Exception;

public class UsingTryCatch {
	public static void main(String[] args) {
		int age=12;
		try {
		if(age<=18) {
			throw new InvalidAgeException("Invalid age");
		}
		else {
			System.out.println("Qualified for voting");
		}
	}
		catch(InvalidAgeException a) {
			System.out.println(a+" "+"Invalid age for voting");
					a.printStackTrace();
		}
	}

}
