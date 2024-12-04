package Arrays;

public class ExponentialSearch {

    public int exponentialSearch(int[] nums, int target){
        int right = nums.length;

        // verifica se o alvo esta no primeiro indice
        if(nums[0] ==target){
            return 0;
        }
        // encontrar o intervalo onde o alvo pode estar
        int left = 1;
        while(left < right && nums[left] <= target){
            left = left * 2;
        }

        return binarySearch(nums, target, left/2, Math.min(left, right));

    }

    private int binarySearch(int[] nums, int target, int left, int right){
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
