public class Day4_AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;

        // Equal Assign
        int b = a;
        System.out.println(b);

        // Add and Assign
        int c = 5;
        System.out.println(c+=a); //c = c+a => c+=a

        // Subtract and assign
        int d = 5;
        System.out.println(d-=a); // c = c-a => c-=a

        int m = 15;
        System.out.println(m*=d);

        int q = 50;
        System.out.println(q/=a);
    }
}
