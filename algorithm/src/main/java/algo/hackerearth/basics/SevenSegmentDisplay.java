package algo.hackerearth.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Alice got a number written in seven segment format where each segment was created
 * using a matchstick.
 *
 * Example: If Alice gets a number 123 so basically Alice used 2+5+5 = 12 matchsticks
 * for this number.
 *
 * Alice is wondering what is the numerically largest value that she can generate by
 * using at most
 * the matchsticks that she currently possess.Help Alice out by telling her that number.
 *
 * I/P:
 * 2
 * 1
 * 0
 *
 * O/P:
 * 1
 * 111
 *
 * Logic:
 * 1) We first calculate number of matchsticks by summing up matches for each digit using
 * one to one mapping
 * 2) For max number using matches. We see below pattern
 *
 * Matchstick -> Max num
 * 2 -> 1
 * 3 -> 7
 * 4 -> 11
 * 5 -> 71
 * 6 -> 111
 * 7 -> 711
 * 8 -> 1111
 * */

public class SevenSegmentDisplay {

    private static Map<Character,Integer> map = Map.of(
            '0',6,
            '1',2,
            '2',5,
            '3',5,
            '4',4,
            '5',5,
            '6',6,
            '7',3,
            '8',7,
            '9',6
    );

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            String num = br.readLine();
            System.out.println(getMaxFromMatchSticks(getTotalMatchSticks(num)));
        }
    }

    public static String getMaxFromMatchSticks(int matchSticks){
        StringBuilder res = new StringBuilder();
        if((matchSticks & 1) == 1){ //For odd number check if last digit is 1
            matchSticks = matchSticks-3; //consume 3 sticks and make odd to even
            res.append("7");
        }
        int count = matchSticks/2;
        while(count -- > 0)
            res.append("1");
        return res.toString();
    }

    public static int getTotalMatchSticks(String num){
        int sum = 0;
        for(char ch : num.toCharArray()){
            sum += map.getOrDefault(ch,0);
        }
        return sum;
    }
}
