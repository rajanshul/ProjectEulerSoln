package project;
public class q3 {

	public static void main(String args[]) {
		long num=600851475143l;
		for(long i=3;i<=num/2;i+=2){
			while(num%i==0)
			{
					num=num/i;
			}
		}
		if(num>1){
			System.out.println("largest prime factor is"+"  "+num);
			
		}
		
	}
}
