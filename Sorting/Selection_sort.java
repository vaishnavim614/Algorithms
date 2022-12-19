
// Selection Sort

public class Selection_Sort{
    static void sort(int []arry){
        for (int i = 0; i < arry.length; i++) {

            int last = arry.length-i-1;
            int max_index = getmax_index(arry,0,last);
            swap(arry,max_index,last);
        }
    }
    private static void swap(int []arr,int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }

    public static int getmax_index(int[] arry,int start, int end) {
        int max = start;
        for (int i = start; i <=end ; i++) {
            if(arry[max] < arry[i]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

