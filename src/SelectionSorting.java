
public class SelectionSorting {

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5};
        int[] sortedArray = selection(arr);
        for (int numbers : sortedArray) {
            System.out.println(numbers);
        }
    }

    private static int[] selection(int[] arr) {
        int[] sortedArray = arr.clone(); // Create a copy of the original array

        for (int i = 0; i < arr.length; i++) {
            // find the maximum item and swap it with the correct index
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaximumIndex(sortedArray, 0, lastIndex);

            sortedArray = swap(sortedArray, maxIndex, lastIndex);
        }
        return sortedArray;
    }

    private static int[] swap(int[] arr, int maxIndex, int lastIndex) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
        return arr;
    }

    private static int getMaximumIndex(int[] arr, int firstIndex, int lastIndex){
        int max = firstIndex;
        for(int i = 1; i <= lastIndex; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
