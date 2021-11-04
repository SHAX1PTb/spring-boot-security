public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        Integer target = 9;


        twosum(nums, target);


    }

    private static void twosum(int[] nums, Integer target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                System.out.println(nums[i] +","+nums[j]);
            }

        }


    }

}
