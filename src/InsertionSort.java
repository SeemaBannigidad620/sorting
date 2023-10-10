public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5};
        int[] sortedArray = Insertion(arr);
        for (int numbers : sortedArray) {
            System.out.println(numbers);
        }
    }

    private static int[] Insertion(int[] arr) {

        for(int i=0; i< arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]< arr[j-1]){
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int secondElement, int firstElement) {
        int temp = arr[secondElement];
        arr[secondElement] = arr[firstElement];
        arr[firstElement] = temp;

    }
}
