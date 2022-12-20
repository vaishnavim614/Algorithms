//Recursive insertion sort

public class recur_inser_sort {
    static void recur_insert_sort(int arr[],int n){
        
        if(n <= 1)
            return;
        
        recur_insert_sort(arr,n-1);
        
        int last = arr[n-1];
        int j=n-2;
        
        while (j>=0 && arr[j]>last){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=last;
    }
    
    public static void main(String[] args) {
        int arr[] = {13,34,42,45};
        recur_insert_sort(arr,arr.length);
        System.out.printf(Arrays.toString(arr));
    }
}

