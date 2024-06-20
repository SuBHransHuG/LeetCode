import java.util.Arrays;

public class minMaxArr {
    public static void main(String[] args) {
        int[] arr = {15,5,43,3,2};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
        System.out.println(arr[0]);
    }
}
