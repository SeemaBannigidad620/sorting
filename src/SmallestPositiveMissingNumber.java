public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
        int missingElement = findMissingNumber(arr);
        System.out.println("missing element is " +missingElement);
    }

    private static int findMissingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, arr[i]);
            }else {
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index + 1;
            }
        }

        //case 2
        return  arr.length;
    }

    private static void swap(int[] arr, int i, int startIndex) {
        int temp = arr[i];
        arr[i] = arr[startIndex];
        arr[startIndex] = temp;
    }
}
