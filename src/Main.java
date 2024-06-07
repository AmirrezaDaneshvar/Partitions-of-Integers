import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=scanner.nextInt();
        scanner.close();
        System.out.print("result: ");
        System.out.println(Partition.p(n,n));
    }
}
