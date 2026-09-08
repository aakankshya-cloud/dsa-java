
class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        while (j < n) {
            for (int i = m; i < m + n; i++) {
                nums1[i] = nums2[j++];

            }
        }
        int l = 0 , r = m ;
        while(l < m + n - 1 && r < m + n -1){
            if(nums1[l] > nums1[r]) {
                int temp = nums1[l];
                nums1[l] = nums1[r];
                nums1[r] = temp;
            }
            l ++;
            r ++;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        for(int i = 0; i < 6;i++){
            System.out.print(nums1[i] + "\t");
        }
    }
}