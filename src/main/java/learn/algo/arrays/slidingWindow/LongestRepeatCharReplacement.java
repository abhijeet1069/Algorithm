package learn.algo.arrays.slidingWindow;

public class LongestRepeatCharReplacement {
    public int characterReplacement(String s, int k) {
        int left = 0, maxFreq = 0, answer = 0;
        int[] freqMap = new int[26];

        for(int right = 0; right < s.length(); right++){
            char currentChar = s.charAt(right);
            freqMap[currentChar-'A']++;
            maxFreq = Math.max(maxFreq,freqMap[currentChar-'A']);

            while((right-left+1)-maxFreq > k){
                freqMap[s.charAt(left)-'A']--;
                left++;
            }
            answer = Math.max(answer,(right-left+1));
        }
        return answer;
    }
}
