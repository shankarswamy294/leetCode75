public class MaxConsecutiveOnesIII {
    // 2 pointer approch O(n) sliding window
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int result = 0;
        while(j<nums.length && k>0 && nums[j]!=0){
            if(nums[j]==0){
                k-=1;
            }
            j+=1;
        }
        result = j-i;
        while(j< nums.length){
            if(nums[j]==1){
                j+=1;
            }else if(k==0){
                result = Math.max(j-i,result);
                if(nums[i]==0){
                    k+=1;
                }
                i+=1;
            }else{
                j+=1;
                k-=1;
            }
        }
        return Math.max(j-i,result);
    }


    // 45ms
    public int longestOnesSol2(int[] nums, int k) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            int j=k;
            int l=i;
            int len = 0;
            while(l<nums.length && j>0){
                if(nums[l]==0){
                    len+=1;
                    j-=1;
                }else{
                    len+=1;
                }
                l+=1;
            }
            while(l<nums.length && nums[l]==1){
                len+=1;
                l+=1;
            }
            result = Math.max(result, len);
        }
        return result;
    }
}
