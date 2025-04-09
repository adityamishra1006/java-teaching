public class Print_Even_Number_from_Two_to_Twenty {
    public static void main(String[] args) {
        // Method 1
        for(int i = 2; i<= 20; i+=2){
            System.out.println(i);
        }

        // Method 2
        for(int i = 1; i<=20; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
