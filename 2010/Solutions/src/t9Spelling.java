import java.util.HashMap;
import java.util.Scanner;


public class t9Spelling {
	static t9Spelling spelling = new t9Spelling();
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<Character,TypeALetter> map = populateHashMap();
		System.out.println("Input a string");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		printT9Representation(str,map);
		in.close();
	}

	/**
	 * This function inputs a t9 representation of a string
	 * @param str
	 * @param map
	 */
	private static void printT9Representation(String str,HashMap<Character,TypeALetter> map) {
		char [] arr = str.toCharArray();
		int prevDigit = -1;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++){
			TypeALetter object = map.get(arr[i]);

			for(int j=0;j<object.mFrequency;j++){
				if(prevDigit == object.mDigit){
					prevDigit = -1;
					sb.append(' ');
				}
				sb.append(object.mDigit);
			}
			prevDigit = object.mDigit;
		}

		System.out.println(sb.toString());
	}

	/**
	 * This class encapsulates the representation for a letter in T9 Dictionary
	 * @author PDesai
	 *
	 */
	class TypeALetter{
		int mDigit;
		int mFrequency;

		public TypeALetter(int digit, int frequency){
			mDigit = digit;
			mFrequency = frequency;
		}
	}

	/**
	 * This method populates the hashmap for character and letter combinations
	 * Eg: if a is typed as key 2 with 1 press, it is stored as HashMap<'1',object(2,1)>
	 * @return
	 */
	private static HashMap<Character,TypeALetter> populateHashMap(){
		HashMap<Character,TypeALetter> map = new HashMap<Character,TypeALetter>();

		TypeALetter object = spelling.new TypeALetter(1, 1);
		map.put('1',object);

		object = spelling.new TypeALetter(2,1);
		map.put('a',object);
		object = spelling.new TypeALetter(2, 2);
		map.put('b',object);
		object = spelling.new TypeALetter(2, 3);
		map.put('c',object);
		object = spelling.new TypeALetter(2, 4);
		map.put('2',object);

		object = spelling.new TypeALetter(3,1);
		map.put('d',object);
		object = spelling.new TypeALetter(3, 2);
		map.put('e',object);
		object = spelling.new TypeALetter(3, 3);
		map.put('f',object);
		object = spelling.new TypeALetter(3, 4);
		map.put('3',object);

		object = spelling.new TypeALetter(4,1);
		map.put('g',object);
		object = spelling.new TypeALetter(4, 2);
		map.put('h',object);
		object = spelling.new TypeALetter(4, 3);
		map.put('i',object);
		object = spelling.new TypeALetter(4, 4);
		map.put('4',object);

		object = spelling.new TypeALetter(5,1);
		map.put('j',object);
		object = spelling.new TypeALetter(5, 2);
		map.put('k',object);
		object = spelling.new TypeALetter(5, 3);
		map.put('l',object);
		object = spelling.new TypeALetter(5, 4);
		map.put('5',object);

		object = spelling.new TypeALetter(6,1);
		map.put('m',object);
		object = spelling.new TypeALetter(6, 2);
		map.put('n',object);
		object = spelling.new TypeALetter(6, 3);
		map.put('o',object);
		object = spelling.new TypeALetter(6, 4);
		map.put('6',object);

		object = spelling.new TypeALetter(7,1);
		map.put('p',object);
		object = spelling.new TypeALetter(7, 2);
		map.put('q',object);
		object = spelling.new TypeALetter(7, 3);
		map.put('r',object);
		object = spelling.new TypeALetter(7, 4);
		map.put('s',object);
		object = spelling.new TypeALetter(7, 5);
		map.put('7',object);

		object = spelling.new TypeALetter(8, 2);
		map.put('t',object);
		object = spelling.new TypeALetter(8, 3);
		map.put('u',object);
		object = spelling.new TypeALetter(8, 4);
		map.put('v',object);

		object = spelling.new TypeALetter(9,1);
		map.put('w',object);
		object = spelling.new TypeALetter(9, 2);
		map.put('x',object);
		object = spelling.new TypeALetter(9, 3);
		map.put('y',object);
		object = spelling.new TypeALetter(9, 4);
		map.put('z',object);
		object = spelling.new TypeALetter(9, 5);
		map.put('5',object);

		object = spelling.new TypeALetter(0, 1);
		map.put(' ',object);

		object = spelling.new TypeALetter(0, 2);
		map.put('0',object);
		return map;
	}
}
