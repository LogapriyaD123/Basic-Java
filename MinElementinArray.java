public class MinElementinArray {
    public static void main(String[] args) {
        int[] arr = {10, 45, 25, 90, 60};
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum = " + min);
    }
}