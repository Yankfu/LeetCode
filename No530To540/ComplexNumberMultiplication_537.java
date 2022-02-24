package No530To540;

/**
 * @PROJECT_NAME: LeetCode
 * @PACKAGE_NAME：No530To540
 * @DESCRIPTION: Perhaps, that has been the story of life
 * MOD = 1000000007
 * @AUTHOR: Yankfu
 * @DATE: 2022/2/25 0:31
 */
public class ComplexNumberMultiplication_537 {
    public static String complexNumberMultiply(String num1, String num2) {
        String[] complex1 = num1.split("\\+|i");
        String[] complex2 = num2.split("\\+|i");
        int real1 = Integer.parseInt(complex1[0]);
        int real21 = Integer.valueOf(complex1[0]);
        int imag1 = Integer.parseInt(complex1[1]);
        int real2 = Integer.parseInt(complex2[0]);
        int imag2 = Integer.parseInt(complex2[1]);
        return String.format("%d+%di", real1 * real2 - imag1 * imag2, real1 * imag2 + imag1 * real2);
    }
}
