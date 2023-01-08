class Solution {
    
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int last=0; //how far we can jump index
        
        for(int i=0;i<n;++i){
            
            //if our jump doesnt reach at the index we will be at i-1
            if(i>last) return false;
            
            //we jump upto which max of last or from that index
            last=Math.max(i+nums[i],last);
            
            //if reach at end
            if (last>n) return true;
        }
        
        return true;
    }
}