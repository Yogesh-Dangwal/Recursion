// public class XtothePowerN {
//     public static int power(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         return x * power(x, n - 1);
//     }

//     public static void main(String[] args) {
//         System.out.println(power(2, 5));
//     }
// }

// X to the power N optimized method
public class XtothePowerN {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = power(x, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}