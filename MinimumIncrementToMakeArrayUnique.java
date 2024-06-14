import java.util.Arrays;
public class MinimumIncrementToMakeArrayUnique {

    public static  void  main(String[] args){
        int[] nums = {1,2,2};
        System.out.println(minIncrementForUnique(nums));

    }

    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);

        int count=0;

        for(int i=1; i<nums.length; i++){
            //  1,2,2  step 1-   2 <= 1 -- false ,  count = 0, move to next index
            // step2 - 2<=2 -- true,
            // count =  (index[curent -1] i.e.) 2 - 2 + 1  (index[curent]
            // step 3 - 2 = 2 + 1  (nums[current] == nums[current]+1)

            if (nums[i] <= nums[i - 1]) {
                count += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }
        return count;
    }
}
