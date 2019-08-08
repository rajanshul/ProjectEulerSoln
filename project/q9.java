package project;

public class q9 {

	public static void main(String[] args) {
		tripleproduct(1000);
	}
		public static void tripleproduct(int find_sum){
			int a,b,c;
			for(a=0;a<find_sum;a++){
				for(b=0;b<find_sum;b++){
					for(c=0;c<find_sum;c++){
						if(square(a)+square(b)==square(c)&& a+b+c == find_sum){
							System.out.println(a+"  "+b+"  "+c+"  "+a*b*c);
						}
					}
				}
			}
		}
		public static int square(int x){
			return x*x;
		}
		}
		

	


