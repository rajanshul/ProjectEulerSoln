package project;

public class q_4 {
		int max_p=0;
			for(int i=1000;i>=100;i--)
			{
				for(int j=1000;j>=100;j--)
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
			System.out.println( max_p);
	}

	

