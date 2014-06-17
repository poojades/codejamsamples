import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class MinimumScalarProduct {

	static MinimumScalarProduct product = new MinimumScalarProduct();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter N");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		ArrayList<Integer> a = new ArrayList<Integer>(n);
		ArrayList<Integer> b = new ArrayList<Integer>(n);
		
		for( int i=0;i<n;i++){
			a.add(in.nextInt());
		}

		for( int i=0;i<n;i++){
			b.add(in.nextInt());
		}

		Collections.sort(a);
		Collections.sort(b,  product.new C());
		
		int sum = 0;
		for(int i = 0;i< n;i++){
			System.out.println(a.get(i) + "  " + b.get(i));
			sum += a.get(i) *  b.get(i);
		}
		System.out.println(sum);
		in.close();
	}

	public class C implements Comparator<Integer>{

		@Override
		public int compare(Integer a, Integer b) {
			
			if(a > b ){
				return -1;
			}if( a < b ) {
				return 1;
			}else {
				return 0;
			}
		}
		
	}
}

