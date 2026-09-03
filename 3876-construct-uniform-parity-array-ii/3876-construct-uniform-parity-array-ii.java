class Solution {

    public boolean iseven(int[] arr) {
        for (int i : arr) {
            if (!(i % 2 == 0)) {
                return false;
            }
        }
        return true;
    }

    public boolean isodd(int[] arr) {
        for (int i : arr) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean uniformArray(int[] nums1) {

        if (iseven(nums1) || isodd(nums1)) {
            return true;
        }

        int minOdd = Integer.MAX_VALUE;

        for (int i : nums1) {
            if (i % 2 != 0 && i < minOdd) {
                minOdd = i;
            }
        }
        for (int i : nums1) {
            if (i % 2 == 0 && i <= minOdd) {
                return false;
            }
        }

        return true;
    }
}