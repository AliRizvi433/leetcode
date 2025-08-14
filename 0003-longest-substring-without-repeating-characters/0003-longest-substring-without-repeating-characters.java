class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if(s.equals(" "))
        // return 1;

        Set<Character> freq = new HashSet<>();
        int maxL = 0;
        int i = 0;
        
        char[] str = s.toCharArray();

        for(int j = 0; j < str.length; j++){

            if(freq.contains(str[j])){
                while(freq.contains(str[j])){
                    freq.remove(str[i]);
                    i++;
                }
            }

            freq.add(str[j]);
            maxL = Math.max(maxL, j - i + 1);
            
        }
        return maxL;
    }
}