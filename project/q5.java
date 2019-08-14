package project;

public class q5 {
static long find(long x,long y)
	{
		if(x%y!=0)
			return find(y,x%y);
				else
					return y;
			}
		static long lcm(long n){
			long result=1;
			for(int i=1;i<=n;i++){
				result=(result*i)/(find(result,i));
			}
			return result;
		}
	

	public static void main(String[] args) {
		long n=20;
		System.out.println(lcm(n));
	}

}
