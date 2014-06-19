import java.io.IOException;
import java.util.Scanner;

public class StoreCredit {
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		Scanner stdin = new Scanner(System.in);
		int N = Integer.parseInt(stdin.next());
		int[] c = new int[N];
		int [][] arr = new int [N][];

		for(int i=0;i<N;i++){
		
			c[i] = Integer.parseInt(stdin.next());
			int length = Integer.parseInt(stdin.next());
	
			arr[i]= new int [length];
			for(int j=0;j<length;j++){
				arr[i][j] = Integer.parseInt(stdin.next());
			}
		}
		
		for(int i=0;i<N;i++){
			System.out.print("Case #"+(i+1) + ": ");
			findStoreCredit(c[i],arr[i]);
		}
	}

	private static void findStoreCredit(int C, int[] ht){
		for(int key=0;key<ht.length;key++){
			if(ht[key]> C){
				continue;
			}else{
				int remaining = C - ht[key];
				for(int j= key+1;j<ht.length;j++){
					if(ht[j] == remaining){
						System.out.println((key+1) + " " + (j+1));
						break;
					}
				}
			}
		}
	}
}
