package project;

public class q10 {
public static void main(String[] args){
		Integer sum=new Integer(2);
		boolean isprime=true;
		for(int i=3;i<2000000;i+=2){
		for(int j=3;j<Math.sqrt((double)i);j+=2){
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




