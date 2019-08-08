package project;

public class q2 {

	public static void main(String[] args) {
		int sum=0;
		int f1=0;
		int f2=1;
		do{
			if(f2%2==0){
			sum= sum +f2;
			}
		    
			int temp=f1+f2;
			f1=f2;
			f2=temp;
			} while (f2 < 4000000);
		System.out.println(sum);
			
			
	}

	}
