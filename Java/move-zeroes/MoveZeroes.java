public void moveZeroes(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
    }