package project;

public class q10 {
int num=2000000;
        long sum = 0;
        for (int i = 3; i <=num; i+=2){
            if(isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Sum: " + (sum +2));
    }
    public static boolean isPrime(int n) {
    	
        for (int i = 3;i<=Math.sqrt(n); i+=2){
            if (n % i == 0) 
            return false;            
        }
        return true;
    }
}



