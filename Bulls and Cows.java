//CODE LINK:https://leetcode.com/problems/bulls-and-cows/description/
class Solution {
    public String getHint(String secret, String guess) { 
        int bull = 0;
        int cow = 0;
        int[] sec = new int[10];
        int[] gues = new int[10];

        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bull++;
            }
            else{
                sec[secret.charAt(i) -'0']++;
                gues[guess.charAt(i) -'0']++;
            }
        }
            for(int i=0;i<10;i++){
                cow+= Math.min(sec[i],gues[i]);
            }
        
        return bull+"A"+cow+"B";

    }
}
