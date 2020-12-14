package one;

import java.util.Arrays;
import java.util.Random;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar=new int [10];
		Random r=new Random(); 
		
		//System.out.print(r.nextInt(20)+" "+r.nextInt(70)+" "+r.nextInt(40));
		for(int i=0;i<10;i++) {
			ar[i]=r.nextInt(79);
		}
		
		
		Arrays.sort(ar);   //默认升序排序
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}
