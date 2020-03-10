 public boolean containsDuplicate(int[] nums) {
        boolean var = false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                var = true;
                break;
            }
        }

        return var;
    }