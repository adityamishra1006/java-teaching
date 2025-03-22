public class Day5Part1 {
    public static void main(String[] args) {
        String name = "Ayush Singh";
        System.out.println(name);

        int length = name.length();
        System.out.println(length);
        System.out.println(name.length());

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


        // String Concatenation
        int a = 9;
        int b = 5;
        System.out.println(a+b);

        String first_name = "Aditya";
        String last_name = "Mishra";
        String middle_name = "Kumar";

        String result = first_name + " " + middle_name + " " +  last_name;
        System.out.println(result);

        System.out.println(first_name.concat(middle_name.concat(last_name)));
    }
}
