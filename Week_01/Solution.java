class Solution {
	
	
	public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums [i - 1] != nums[i]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
	
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j >= 0; j--) {
                if (j > 0) {
                    nums[j] = nums[j -1];
                } else {
                    nums[j]=temp;
                }
            }
        }
    }
}