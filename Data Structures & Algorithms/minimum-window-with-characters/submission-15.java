class Solution {
    public String minWindow(String s, String t) {
        int[] required = new int[128];
        int requireddistinct = 0;
        int[] trequired = new int[128];
        int minlen = Integer.MAX_VALUE;
        int start = 0;
        int left = 0;
        int formed = 0;

        for (int right = 0; right < t.length(); right++) {
            char ch = t.charAt(right);

            if (trequired[ch] == 0) {
                requireddistinct++;
            }

            trequired[ch]++;
        }

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            required[ch]++;

            if (required[ch] > 0 && required[ch] == trequired[ch]) {
                formed++;
            }

            while (formed == requireddistinct) {
                int currentlen = right - left + 1;
                if (currentlen < minlen) {
                    minlen = currentlen;
                    start = left;
                }

                char leftchar = s.charAt(left);

                required[leftchar]--;

                if (trequired[leftchar] > 0 && required[leftchar] < trequired[leftchar]) {
                    formed--;
                }

                left++;
            }
        }

        return (minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen));
    }
}
