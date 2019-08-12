package project;

public class q9 {
		
	public static void main(String[] args) {
		int a=0,b=0,c=0,ml=1;
		for(a=1;a<1000/3;a++){
			for(b=a+1;b<1000/2;b++){
				c=1000-a-b;
				if(a*a+b*b==c*c){
					ml=a*b*c;
					System.out.println(""+a+"*"+b+"*"+c+"="+ml);
				}
			}
		}

	}
}


