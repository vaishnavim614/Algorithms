//Quick Sort

public class quick_sort {
    public static int partition(int arr[],int start,int end){
        int pivot=arr[end];
        int i=start-1;

        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[end]=temp;
        return i; //pivot index
    }
    public static void quicksort(int arr[],int start,int end){
        if(start<end){
            int pidx= partition(arr,start,end);
            quicksort(arr,start,pidx-1);
            quicksort(arr,pidx,end);
        }
    }
    public static void main (String args[]) {
        int[] arr={10,50,20,9,2,15};
        int n= arr.length;
        quicksort(arr,0,n-1);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

