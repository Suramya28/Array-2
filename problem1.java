
//time- O(N)
//space- O(1)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
      
        
        for(int i=0; i<nums.length; i++){
            
            int newIdx= Math.abs(nums[i])-1;
            
            if(nums[newIdx]>0)
                
            nums[newIdx]*=-1;
            
            
        }
        
          List<Integer> result= new ArrayList<>();
        
        for(int i=1; i<=nums.length; i++){
            
            if(nums[i-1]> 0)
                result.add(i);
                
        }
        
        return result;
        

    }
}
