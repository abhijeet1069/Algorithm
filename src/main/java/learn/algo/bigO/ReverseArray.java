package learn.algo.bigO;

public class ReverseArray {
    // O(n)
    public void reverse(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int other = arr.length-i-1;
            int temp = arr[i];
            arr[i] = arr[other];
            arr[other] = temp;
        }
    }
}
