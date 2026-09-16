package learn.algo.bigO;

//Running time is O(n)
// OP : sum = 30 product = 3840
public class SumProduct {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        int[] arr = {2,4,6,8,10};
        for(int i = 0;i < arr.length; i++){
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("sum = "+sum+" product = "+product);
    }
}
