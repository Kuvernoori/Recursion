import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Введи A: ");
    int A = sc.nextInt();
        System.out.print("Введи B: ");
    int B = sc.nextInt();
        Recursion Recur = new Recursion();
        Recur.recur(A,B);
    }
}