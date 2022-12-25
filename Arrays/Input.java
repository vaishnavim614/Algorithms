//Array input

public class Input{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        int [] arr = new int[5];
        // Let take some random values
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
        System.out.println(arr[3]);

        // input using for loops
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // We can also use following instead of above for loop to print array elements
        System.out.println(Arrays.toString(arr));
    }
}




