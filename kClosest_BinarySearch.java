// Time Complexity : O(log(n-k)+k)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        if(arr.length == 0 || arr == null)
            return result;
        int low = 0, high = arr.length - k;
        while(low < high) {
            int mid = low + (high - low)/2;
            int distLeft = x - arr[mid];
            int distRight = arr[mid+k] - x;
            if(distLeft > distRight)
                low = mid + 1;
            else
                high = mid;
        }
        for(int i=low; i < low+k; i++)
            result.add(arr[i]);
        return result;
    }
}