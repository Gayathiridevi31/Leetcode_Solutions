class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        per(nums, new ArrayList<>(), result);
        return result;
    }

    private void per(int[] nums, List<Integer> output, List<List<Integer>> result) {
        if (nums.length == 0) {
            result.add(new ArrayList<>(output));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            int chosen = nums[i];
            int[] rem = new int[nums.length - 1];
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    rem[index++] = nums[j];
                }
            }
            output.add(chosen);
            per(rem, output, result);
            output.remove(output.size() - 1);
        }
    }
}