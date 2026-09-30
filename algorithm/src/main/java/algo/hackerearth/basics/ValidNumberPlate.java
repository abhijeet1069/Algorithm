package algo.hackerearth.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidNumberPlate {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String plate = br.readLine();
        if(isValidNumberPlate(plate))
            System.out.println("valid");
        else
            System.out.println("invalid");
    }

    public static boolean isValidNumberPlate(String s){
        boolean valid = true;
        char letter = s.charAt(2);
        if("AEIOUY".indexOf(letter) != -1)
            return false;

        int[] position1 = {0,1};
        int[] position2 = {3,4,5};
        int[] position3 = {7,8};
        valid = isValid(s, position1) && isValid(s, position2) && isValid(s, position3);
        return valid;
    }

    private static boolean isValid(String s, int[] positions) {
        boolean valid = true;
        for(int i = 0; i < positions.length-1; i++){
            int a = s.charAt(positions[i])-'0';
            int b = s.charAt(positions[i+1])-'0';

            if ((a + b) % 2 != 0) {
                valid = false;
                break;
            }
        }
        return valid;
    }


}
