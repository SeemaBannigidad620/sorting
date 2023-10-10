public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5};
        int[] sortedArray = bubble(arr);
        for (int numbers : sortedArray) {
            System.out.println(numbers);
        }
    }

    private static int[] bubble(int[] arr) {
        boolean swapped = false;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            //for each step maximum element will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;


                    swapped = true;
                }
            }
            //if you did not swap for the particular value of i , i    t means array is sorted and hence stop the program
            if (!swapped) {
                break;
            }

        }
        return arr;
    }
}