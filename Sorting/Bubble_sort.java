
// BUBBLE SORT

public class bubblesort {
   static void sort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]<arr[j+1]){
                    swap(arr,j,j+1);
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
        int []arr= {12,32,23,10,20};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

