package array.util;

public class ArrayUtil {

    public static int max(int[] nums) {
        if (nums.length == 0)
            return 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int max2(int[] nums) {
        if (nums.length == 0)
            return 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
            max = nums[i] > max ? nums[i] : max;
        return max;
    }

    public static int max3(int[] nums) {
        if (nums.length == 0)
            return 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
            max = Math.max(nums[i], max);
        return max;
    }

    public static int max4(int[] nums) {
        if (nums.length == 0)
            return 0;

        int max = Integer.MIN_VALUE;
        for (int num : nums)
            max = Math.max(num, max);
        return max;
    }

    public static int[] minMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ret[] = { min, max };
        return ret;
    }
}