package project;

public class q6 {

	public static void main(String[] args) {
		int i,j,y,sum1,sum2;
		sum1=0;
		for(i=1;i<=100;i++){
			sum1=sum1+(i*i);
		}
y=0;
for(j=1;j<=100;j++){
	y=y+j;
}sum2=y*y;

int dif;
dif=sum2-sum1;
System.out.println(dif);
	}

}
