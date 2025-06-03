//link:  http://geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1


class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
    
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<k;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        res.add(mp.size());
            
            for(int j=k;j<n;j++){
                mp.put(arr[j],mp.getOrDefault(arr[j],0)+1);
                mp.put(arr[j-k],mp.get(arr[j-k])-1);
                
                if(mp.get(arr[j-k])==0){
                    mp.remove(arr[j-k]);
                }
                  res.add(mp.size());
                
            }
          
            
        
        return res;
        
    }
}
