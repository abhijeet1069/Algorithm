package algo.hackerearth.arrays;

public class MonkAndRotation {
    public static int[] rotateArray(int[] arr, int rotations){
        int[] res = new int[arr.length];
        for(int i = 0;i < arr.length; i++){
            res[(i+rotations)%arr.length] = arr[i];
        }
        return res;
    }
}
