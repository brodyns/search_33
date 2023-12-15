public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < nums[end]){
                if(nums[mid] < target && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(nums[start] <= target && target < nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
