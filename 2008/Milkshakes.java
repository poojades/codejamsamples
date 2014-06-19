import java.util.Scanner;


public class Milkshakes {


	public static void main(String[] args) {
		System.out.println("Enter the number of milkshakes : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("Enter no of customers");
		int m = in.nextInt();
		
		int [][] custPref = new int[m][];
		int [] milkshakes = new int [n];
		
		//accept inputs
		for(int i=0;i<m;i++){
			System.out.println("For Cust " + i + "Enter the no of flavors he likes followed by flavor, malted unmalted");
			int t = in.nextInt();
			custPref[i] = new int [t];
			for(int j=0;j<t;j++){
				int flavor = in.nextInt();
				int maltedness = in.nextInt();
				
				if(maltedness == 0){
					custPref[i][flavor] = 0;
				}else{
					custPref[i][flavor] = 1;
				}
			}
		}
		
		//start with milk shakes array as all zeros
		for(int i=0;i<n;i++){
			milkshakes[i]=0;
		}
		
		//go through each customer and check if he is satisfied
		for(int i=0;i<m;i++){
			int t = custPref[i].length;
			boolean satisfied = false;
			for( int j=0;j<t;j++){
				if (milkshakes[j] == custPref[i][j]){
					//customer is satisfied
					satisfied = true;
				}
			}
		}
	}

}
