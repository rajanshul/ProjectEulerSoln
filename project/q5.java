package project;

public class q5 {
public static  int p5(){
	int i,j;
   for( i=2521;;i++){
for( j=1;j<=20;j++){
if(i%j==0)
continue;
else 
break;
}
if(j==21)
break;}
		 
return i;
	}
public static void main(String[] args) {
		System.out .println(p5());

	}

}
