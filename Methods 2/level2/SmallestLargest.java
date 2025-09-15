import java.util.Scanner;
public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
    }
    public static int[] findSmallestAndLargest(int x, int y, int z) {
        int smallest = Math.min(x, Math.min(y, z));
        int largest = Math.max(x, Math.max(y, z));
        return new int[]{smallest, largest};
    }
}