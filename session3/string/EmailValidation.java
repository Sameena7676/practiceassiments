package string;

	import java.util.regex.Pattern;
	import java.util.*;

public class EmailValidation{
	static class Test
	{
	    public static boolean isValid(String email)
	    {
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
	                            "[a-zA-Z0-9_+&*-]+)*@" +
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                            "A-Z]{2,7}$";
	                              
	        Pattern pat = Pattern.compile(emailRegex);
	        if (email == null)
	            return false;
	        return pat.matcher(email).matches();
	    }
	  
	    public static void main(String[] args)
	    {
	        ArrayList<String> address = new ArrayList<>();
	            
	          address.add("sameenabanu@gmail.com");
	          address.add("sammybanu76@yahoo.com");
	            
	        for(String i : address){
	            if (isValid(i))
	                System.out.println(i + " - Yes");
	            else
	                System.out.println(i + " - No");
	        }
	    }
	}


}