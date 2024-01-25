import java.util.Scanner;

public class ConcatArray2 {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        // Creating Scanner class Object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Length :");

        // Read the array length form the ser
        int length = sc.nextInt();

        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int[] concatArray = getConcatenation(nums);

        System.out.print("Concatenated Array: ");
        for (int num : concatArray) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
