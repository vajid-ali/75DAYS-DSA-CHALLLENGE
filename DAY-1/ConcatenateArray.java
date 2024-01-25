public class ConcatenateArray {

    // Method to concatenate the array
    public static int[] getConcatenation(int[] nums) {
        // Get the length of the input array
        int n = nums.length;

        // Create a new array to store the concatenated result
        int[] ans = new int[2 * n];

        // Copy the elements of nums array to ans
        for (int i = 0; i < n; i++) {
            // Copy the element at index i from nums to ans at the same index
            ans[i] = nums[i];

            // Copy the same element at index i from nums to ans at the position i + n
            ans[i + n] = nums[i];
        }

        // Return the concatenated array
        return ans;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Example input array
        int[] nums = { 1, 2, 3 };

        // Get the concatenated array
        int[] concatenatedArray = getConcatenation(nums);

        // Print the concatenated array
        System.out.print("Concatenated Array: ");
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
    }
}
