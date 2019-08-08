package project;

public class q3 {

	public static void main(String args[]) {
		long num=13195;
		for(long i=2;i<=num/i;i++){
			while(num%i==0){
				
				num=num/i;
				System.out .println(num);
				
			}
			System.out.println(i+"");
		}
		if(num>1){
			System.out.println("largest primr factor is"+"  "+num);
			
		}
		
	}
}
