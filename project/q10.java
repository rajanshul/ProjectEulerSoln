package project;

public class q10 {
public static void main(String[] args){
		long sum =2;
		for(int i=3;i<2000000;i++){
			if(prime(i))
			{
				sum=sum+i;
			}
		}System.out.println(sum);
	
}
	static boolean prime(int n)
	{
		boolean a=true;
		for(long i=3;i<=Math.sqrt(n);i=i+2)
		{
			if(n%i==0)
			{
				a=false;
				break;
		        }
		}
		return a;
	
}




