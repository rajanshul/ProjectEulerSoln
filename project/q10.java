package project;

import java.util.Arrays;

public class q10 {
	static  int sumof(int n){
		boolean prime []=new boolean[n+1];
	 	Arrays.fill(prime, true);
	for(int p=2;p*p<=n;p++){
		if(prime[p]== true){
		for (int i=p*2;i<=n;i=i+p)
				prime[i]=false;
		}
	}
	int sum=0;
	for(int i=2;i<=n;i++)
		if(prime[i])
			sum=sum+i;
	return sum;
	}


	public static void main(String[] args) {
		int n=2000000;
		System.out.println(sumof(n));
		
}
	}
	

