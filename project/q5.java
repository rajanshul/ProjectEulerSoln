package project;

public class q5 {
public static  int p5(){

	int i=2520;
	boolean found=false;
	while (!found){
		i=i+2520;
		boolean isd=true;
		for(int j=11;j<=20;j++){
			if(i%j!=0){
				isd=false;
				break;
			}
		}
		if(isd){
			found=true;
		}
	}
	return i;
	}

	public static void main(String[] args) {
		System.out .println(p5());

	}

}
