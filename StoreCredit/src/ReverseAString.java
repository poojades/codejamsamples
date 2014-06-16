
public class ReverseAString {

	
	public static void main(String args[]){
		String str = "football";
		str = reverseString(str);
		String [] stringArray = str.split("\\s");
		System.out.println(str);
		StringBuilder sb = new StringBuilder();
		for(int j=0;j<stringArray.length;j++){
			sb.append(reverseString(stringArray[j]));
			sb.append(" ");
		}	
		System.out.println(sb.toString());
	}

	private static String reverseString(String str) {
	
		int length = 0;
		if(str == null || (length = str.length()) == 0){
			return str;
		}
		
		char [] strArray = str.toCharArray();
		for(int i = 0;i<length/2;i++){
			char ch = strArray[i];
			strArray[i] = strArray[length-i-1];
			strArray[length-i-1] = ch;
		}
	
		return String.valueOf(strArray);
	}
}
