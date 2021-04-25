package Array;

public class FindHash {

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,1,2,1,1,5,1}));
    }

    public static boolean canJump(int[] nums) {
        if(nums.length==1)
            return true;
        //int maxsteps = nums[0];
        int reachable = nums[0];
        int n = nums.length;
        for(int i=1; i<n; i++){
            if(i>reachable)
                return false;
            reachable = Math.max(i + nums[i], reachable);
        }
        return true;
    }
}
