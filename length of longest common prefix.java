class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
         HashSet<String> pMap = new HashSet<>();
        for(int i : arr1){
            String str=Integer.toString(i);
            String pre ="";
            for(char x : str.toCharArray()){
                pre+=x;
                pMap.add(pre);
                System.out.println(pMap);
            }
        }
            int tot=0;
            for(int j : arr2){
                String str = Integer.toString(j);
                String pre="";
                for(char y : str.toCharArray()){
                    pre+=y;
                    if(pMap.contains(pre)){
                        tot = Math.max(pre.length(),tot);
                    }
                }
            }
            return tot;
        }
    }
