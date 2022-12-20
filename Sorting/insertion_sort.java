// Insertion sort

public class insertion_sort {
    static void insert(int[] arry) {
        for (int i = 0; i < arry.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arry[j] < arry[j - 1]) {
                    swap(arry, j, j - 1);
                } else {
                    break;
                }

            }
        }
    }
    private static void swap(int []arr,int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int[] arry={23,12,34,2,15};
        insert(arry);
        System.out.printf(Arrays.toString(arry));
    }
}

