
// Modify the array

public class Modify {
    public static void main(String[] args) {
        //array of objects
        //printing char values
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1]="ee"; // value to modify
        System.out.println(Arrays.toString(str));
    }
}
