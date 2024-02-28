public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]!=0){
                i+=1;
            }else{
                if(nums[j]!=0){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i+=1;
                }
            }
            j+=1;
        }
    }
}
