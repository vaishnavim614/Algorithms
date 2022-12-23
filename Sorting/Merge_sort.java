// Merge Sort

public class merge_sort {
    public static void merge_sort_divide(int [] arr,int l, int r){
        if(l<r){
            int mid =(l+r)/2;
            merge_sort_divide(arr,l, mid);
            merge_sort_divide(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    public static void merge(int [] arr,int l, int mid, int r) {
        int merged[] = new int[r - l + 1];
        int n1 = l;
        int n2 = mid + 1;
        int x = 0;
        while (n1 <= mid && n2 <= r) {
            if (arr[n1] <= arr[n2]) {
                merged[x] = arr[n1];
                x++;
                n1++;
            } else {
                merged[x] = arr[n2];
                x++;
                n2++;
            }
        }
        while (n1 <= mid) {
            merged[x] = arr[n1];
            x++;
            n1++;
        }
        while (n2 <= r) {
            merged[x] = arr[n2];
            x++;
            n2++;
        }
        for (int i = 0, j = l; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
    public static void main (String args[]) {
        int arr[] = {12, 50, 23, 80, 9, 30};
        int n = arr.length;
        merge_sort_divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
	 }
}
