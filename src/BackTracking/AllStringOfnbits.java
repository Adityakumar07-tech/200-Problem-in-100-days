package BackTracking;

public class AllStringOfnbits {
    // pseudo Code
//    GenerateBinary(A, n, k)
//
//if k == n then
//    print A
//    return
//
//    A[k] = 0
//    GenerateBinary(A, n, k + 1)
//
//    A[k] = 1
//    GenerateBinary(A, n, k + 1)

    static void generate(int[] A, int n, int k) {
        if (k == n) {
        for (int bit : A) {
            System.out.print(bit);
        }
        System.out.println();
        return;
    }

    A[k] = 0;
    generate(A, n, k + 1);

    A[k] = 1;
    generate(A, n, k + 1);
}

public static void main(String[] args) {
    int n = 4;
    int[] A = new int[n];

    generate(A, n, 0);
}
}
