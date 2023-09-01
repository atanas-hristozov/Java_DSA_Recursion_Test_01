public class Main {
    public static void main(String[] args) {
        printNumbers(3);
    }

    private static void printNumbers(int n) {
        System.out.println("This is the stars of recursive call " + n);
        if(n == 0) {
            System.out.println("This is the bottom of the recursion!");
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
        System.out.println("This is recursivePrintCall " + n + " End");
    }
}