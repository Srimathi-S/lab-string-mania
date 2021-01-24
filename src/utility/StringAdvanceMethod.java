package utility;

// Type your code
public class StringAdvanceMethod
{
	String input1;
	String input2;
	public String getInput1() {
		return input1;
	}
	public void setInput1(String input1) {
		this.input1 = input1;
	}
	public String getInput2() {
		return input2;
	}
	public void setInput2(String input2) {
		this.input2 = input2;
	}
	public String concat(String string1, String string2) {
		return string1+string2;
	}
	public String split(String string1, String string2) {
		String split[]=string1.split(string2);
		String splittedString=split[0];
		int splittedLength=split.length;
		for(int i=1;i<splittedLength;i++)
			{
			splittedString=concat(splittedString,"  ");
			splittedString=concat(splittedString,split[i]);
			}
		return splittedString;
	}
	public String indexOf(String string1, String string2) {
		int index=string1.indexOf(string2);
		return String.valueOf(index);
	}
}