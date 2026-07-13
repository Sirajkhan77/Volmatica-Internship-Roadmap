package Week2.Day1;

// Purely self solution, BruitForce O(n^2)

public class Leetcode496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i=0; i<nums1.length; i++){
            int current = nums1[i];
            int greater = -1;
            boolean found = false;
            for (int j=0; j<nums2.length; j++){
                if (current == nums2[j]) found = true;
                if(found && nums2[j]>current){
                    greater = nums2[j];
                    break;
                }
            }
            ans[i]=greater;
            greater =-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Leetcode496 leetcode496 = new Leetcode496();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] result = leetcode496.nextGreaterElement(nums1, nums2);
        System.out.print("Next Greater Elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
