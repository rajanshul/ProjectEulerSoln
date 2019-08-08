package project;

public class q_4 {
	static int lp (int n)
	{
		int up= 0;
		for (int i=1;i<=n;i++)
		{
			up=up*10;
			up=up+9;
		}
		int ll=1+up/10;
		int max_p=0;
		for(int i=up;i>=ll;i--)
		{
			for(int j=i;j>=ll;j--)
			{
				int p= i*j;
				if(p < max_p)
					break;
				int num=p;
				int rev=0;
				while(num!=0)
				{
					rev=rev*10+num%10;
					num=num/10;
				}
				if(p==rev && p>max_p)
					max_p = p;
			}
		}
		return max_p;
	}
	

public static void main(String[] args) 
{
		int n=3;
				
	System.out.println(lp(n));	
	}

	
}
