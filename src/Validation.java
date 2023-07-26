
public class Validation {

	public void validationAge(int age) throws CustomEx{
	
		if(age<=18)
		{
			throw new CustomEx("Age is not valid and Age Should be greater than 18");
		
		}
		else
		{
			System.out.println("Age is valid");
		}
	}
}
