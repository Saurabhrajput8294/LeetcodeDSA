import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        // Step 1: Map Roman characters to integer values
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);  map.put('V', 5);
        map.put('X', 10); map.put('L', 50);
        map.put('C', 100);map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        // Step 2: Loop through the string
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            
            // If next numeral is larger, subtract current
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }

        return total;
    }
}
