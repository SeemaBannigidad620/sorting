public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 4};
        int duplicateNumber = findDuplicateNumber(nums);
        System.out.println("duplicate number is " + duplicateNumber);
    }

    private static int findDuplicateNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        int duplicateNumber = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                duplicateNumber = nums[index];
            }
        }
        return duplicateNumber;
    }

    private static void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}