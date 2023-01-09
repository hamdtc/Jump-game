class Solution {
    //to store all the jumped elements
    HashSet<Integer> set = new HashSet<>();
    
    public boolean canReach(int[] arr, int start) {
     
        //if we already visited no need to go again through same path
        // we dont need to search on out of bound
        if( set.contains(start) || start<0 || start>=arr.length ) return false;
        
        // if we reached element 
         if(arr[start] == 0) return true;
        //if not reach element or we visited once
        set.add(start);
        
        //check on the both direction 
        return canReach(arr,start-arr[start]) || canReach(arr,start+arr[start]);
    }
}