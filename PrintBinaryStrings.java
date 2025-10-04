//Print all binary strings of size N without consecutive 1's
public class PrintBinaryStrings {
    public static void printBinaryStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Binary strings of size " + n + " without consecutive 1's:");
        printBinaryStrings(n, 0, "");
    }
}
