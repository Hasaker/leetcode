package complete.ab;

public class nFindFirstAndLastPositionOfElementInSortedArray {
    
    /**
     * 34. Find First and Last Position of Element in Sorted Array
     */
    private int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            int mid = (start + end) / 2;
            
            if (nums[mid] == target) {
                int front = mid;
                int tail = mid;
                while (front > -1 && nums[front] == target) front--;
                while (tail < nums.length && nums[tail] == target) tail++;
                return new int[] {front + 1, tail - 1};
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        if (nums.length == 1 && nums[0] == target)
            return new int[] {0, 0};
        else
            return new int[] {-1, -1};
    }
}
