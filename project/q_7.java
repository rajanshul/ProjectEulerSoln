package project;

public class q_7 {

	public static void main(String[] args) {
		int primeno=0;
		int count=0;
		for( int num=2;num<10000000;num++){
			boolean pn=true;		
			for (int j=2;j<num;j++){
			if(num%j==0){
				pn=false;
			break;
			}}
			if(pn){
				primeno=num;
			count++;}
			if(count==10001){
				break;
			}
			}
System.out.println(primeno);
	}}
