//link : https://www.geeksforgeeks.org/problems/minimum-indexed-character-1587115620/1


class Solution {
    // Function to find the minimum indexed character.
    public static int minIndexChar(String s1, String s2) {
        Map<Character,Integer> mp= new HashMap<>();
        int low = Integer.MAX_VALUE;
        for(int i=0;i<s1.length();i++){
            char val = s1.charAt(i);
            if(!mp.containsKey(val)){
                mp.put(val,i);
            }
        }
        // for(Map.Entry<Character,Integer> entry : mp.entrySet()){
        // System.out.println(entry.getKey() + " = " + entry.getValue());
        // }
        for(int i=0;i<s2.length();i++){
            char val = s2.charAt(i);
            if (mp.containsKey(val)){
                if(low> mp.get(val)){
                low = mp.get(val);
            }
            }
        }
        if(low == Integer.MAX_VALUE) return -1;
        else return low;
        
    }
}
