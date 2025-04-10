import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start : ");
        int start = sc.nextInt();
        System.out.println("Enter end");
        int end = sc.nextInt();

        

        for(int num = start; num <= end; num++){
            boolean isPrime = true;
            for(int i = 2; i<=Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }  
            }
            if(isPrime){
                System.out.println(num + " ");
            }
        }
    }
}
