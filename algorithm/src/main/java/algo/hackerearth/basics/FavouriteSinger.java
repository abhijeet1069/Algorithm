package algo.hackerearth.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.StringTokenizer;

public class FavouriteSinger {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        long[] songs = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            songs[i] = Long.parseLong(st.nextToken());
        System.out.println(findFavoriteSinger(songs));
    }

    public static Integer findFavoriteSinger(long[] songs){
        HashMap<Long,Integer> map = new HashMap<>();
        long max = Long.MIN_VALUE;
        for (long song : songs) {
            map.put(song, map.getOrDefault(song, 0) + 1);
            max = Math.max(max, map.get(song));
        }
        int res = 0;
        for(long val : map.values()){
            if(max == val)
                res++;
        }
        return res;
    }
}
