package learn.algo.arrays.slidingWindow;

public class MinWindowSubstr {
    public String minWindow(String s, String t) {

        int[] need = new int[128];
        int[] window = new int[128];

        // Build need map
        for (char ch : t.toCharArray()) {
            need[ch]++;
        }

        // Count distinct required characters
        int required = 0;
        for (int count : need) {
            if (count > 0) {
                required++;
            }
        }

        int formed = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            window[ch]++;
            // Did this character just become satisfied?
            if (need[ch] > 0 && window[ch] == need[ch]) {
                formed++;
            }

            while (formed == required) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window[leftChar]--;

                // Did removing it make the window invalid?

                if (need[leftChar] > 0 &&
                        window[leftChar] < need[leftChar]) {
                    formed--;
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }
}
