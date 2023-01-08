class Solution {
    public int jump(int[] nums) {
        int jumps=0;//how many jumps
        int farJump=0; //how much length we can jump from a point
        int curr=0; // the max length we can jump in first point
        
        
        
        for(int i=0;i<nums.length-1;i++){
            
            //max jump
            farJump=Math.max(farJump,i+nums[i]); 
            
            
            //when ever reachs at the max length of perticular i then change curr
            if(i==curr){
                curr=farJump;
                jumps++;
            }
                           
        }
        return jumps;
    }
}