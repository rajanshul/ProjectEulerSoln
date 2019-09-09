package project;

public class q_7 {

	public static boolean prime(long n)
{
	boolean f = true;
	if(n%2==0)
		return false;
	for(long i=3;i*i<=n;i=i+2)
	{
		if(n%i==0)
			return false;
	}
	return f;
}
public static  long pro(long l)
{
	long c = 0;
	long res = 0;
	
	for(long x= 1;c<= l;x+=2)
	{
		if(prime(x))
		{
			res = x;
			c++;
			
		}
	}
	return res;
}
public static void main(String[] args) {
	
	long l =10001;
	System.out.println(pro(l-1));
	
        
}}     
