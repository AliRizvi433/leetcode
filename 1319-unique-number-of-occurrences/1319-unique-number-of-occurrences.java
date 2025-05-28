class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hash = new HashMap<>();

        for(int num: arr){
            hash.put(num, hash.getOrDefault(num, 0)+1);
        }

        Set<Integer> seen = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry: hash.entrySet()){
            if(seen.contains(entry.getValue())){
                return false;
            }
            else{
                seen.add(entry.getValue());
            }
        }

        return true;
    }
}