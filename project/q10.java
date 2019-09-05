package project;

public class q10 {
public static void main(String[] args){
		Integer sum=new Integer(2);
		boolean isprime=true;
		for(int i=3;i<2000000;i++){
		for(int j=2;j<Math.sqrt((double)i);j++){
			if(i%j==0){
				isprime=false;
				break;
			}
		}
		if(isprime){
			sum=sum+Math.add(Integer.valueOf(i));
		}
		isprime=true;
		
	        }
		System.out.println(sum);


}}




