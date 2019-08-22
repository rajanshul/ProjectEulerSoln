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
		if(n%2==0)
			return false;
		for(long i=3;i*i<=n;i=i+2)
		{
			if(n%i==0)
				return false;
		}
		return a;
	}
}




