class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String prefix = strs[0];  // Start with the first word

        for (int i = 1; i < strs.length; i++) {
            // Shorten prefix until it matches the start of the current string
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";  // No common prefix
                }
            }
        }

        return prefix;
    }
}
