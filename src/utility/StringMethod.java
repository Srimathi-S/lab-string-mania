package utility;

// Type your code
public class StringMethod
{
	String input;
	public String lower(String string)
	{
		if(string.equals(""))return string;
		String lowerCaseString="";
		for(char character:string.toCharArray())
		{
			if(character>='A' && character<='Z')lowerCaseString+=Character.toLowerCase(character);
			else lowerCaseString+=character;
		}
		return lowerCaseString;
	}
	
	public String upper(String string)
	{
		if(string.equals(""))return string;
		String upperCaseString="";
		for(char character:string.toCharArray())
		{
			if(character>='a' && character<='z')upperCaseString+=Character.toUpperCase(character);
			else upperCaseString+=character;
		}
		return upperCaseString;
	}
	
	public String length(String string)
	{
		if(string.equals(""))return ""+0;
		Integer length=((Integer)string.length());
		return length.toString();
	}
	
	public String trim(String string)
	{
		if(string.equals(""))return string;
		int start=0;
		int length=string.length();
		int end=length-1;
		for(start=0;start<length && string.charAt(start)==' ';start++);
		for(end=length-1;end>=0 && string.charAt(end)==' ';end--);
		String trimmedString=string.substring(start, end+1);
		return trimmedString;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String firstCharacter(String string) {
		
		return (""+string.charAt(0));
	}


}