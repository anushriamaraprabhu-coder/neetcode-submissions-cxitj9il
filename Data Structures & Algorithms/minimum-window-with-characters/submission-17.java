class Solution {
    public String minWindow(String s, String t) {
        int[] trequired = new int[128];
        int[] srequired = new int[128];
        int requireddistinct = 0;
        int formed = 0;
        int start = 0;
        int minlen = Integer.MAX_VALUE;
        int left = 0;

        if (t.isEmpty()) {
            return "";
        }

        for (int right = 0; right < t.length(); right++) {
            char ch = t.charAt(right);
            if (trequired[ch] == 0) {
                requireddistinct++;
            }

            trequired[ch]++;
        }

        // string s

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            srequired[ch]++;

            if (trequired[ch] > 0 && srequired[ch] == trequired[ch]) {
                formed++;
            }

            while (formed == requireddistinct) {
                char leftchar = s.charAt(left);

                if (right - left + 1 < minlen) {
                    minlen = right - left + 1;
                    start = left;
                }

                srequired[leftchar]--;

                if (trequired[leftchar] > 0 && srequired[leftchar] < trequired[leftchar]) {
                    formed--;
                }

                left++;
            }
        }

        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}
