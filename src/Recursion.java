public class Recursion {
    public void recur(int A, int B) {
        if (A < B) {
            System.out.print(A + " ");
            recur(A + 1, B);
        }
        else if (A > B) {
            System.out.print(A + " ");
            recur(A - 1, B);
        }
        else {
            System.out.print(A);
        }
    }
}