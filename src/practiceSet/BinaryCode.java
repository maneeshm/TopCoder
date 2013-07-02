package practiceSet;

public class BinaryCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] outputString = new BinaryCode().decode("12221112222221112221111111112221111");
		
		System.out.println("output 1 " + outputString[0]);
		System.out.println("output 2 " + outputString[1]);
	}

	private String [] decode(String string) {
		
		char charString[] = string.toCharArray();
		String output = "";
		int prev = 0, curr = 0, next = 0;
		for(int i = 0; i < string.length(); i++){
			output = output + curr;
			next = charString[i]-'0' - prev - curr;
			prev = curr;
			curr = next;
			
			if ((curr > 1) || (curr < 0) ){
				output = "NONE";
				break;
			}
		}
		String outString[] = new String[2];
		outString[0] = output;
		output="";
		
		prev = 0; curr = 1; next = 0;
		for(int i = 0; i < string.length(); i++){
			output = output + curr;
			next = charString[i]-'0' - prev - curr;
			prev = curr;
			curr = next;
			
			if ((curr > 1) || (curr < 0) ){
				output = "NONE";
				break;
			}
		}
		outString[1] = output;
		return outString;
	}

}
