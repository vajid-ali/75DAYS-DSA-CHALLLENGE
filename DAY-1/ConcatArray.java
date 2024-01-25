import java.util.Scanner;

public class ConcatArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array length:");

        int length = sc.nextInt();

        int[] nums = new int[length];

        System.out.println("Enter Array Values:");

        for (int i = 0; i < length; i++) {

            System.out.print("Element " + (i + 1) + ":");

            nums[i] = sc.nextInt();
        }

        // // print array values for checking

        // for (int j = 0; j < nums.length; j++) {
        // System.out.println("Array Values is " + (j + 1) + " : " + nums[j]);
        // }

        // method for Cancatinating Array

        int[] contar = getConcatenation(nums);

        for (int num : contar) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {

            ans[i] = nums[i];

            ans[n + i] = nums[i];

        }
        return ans;
    }
}
