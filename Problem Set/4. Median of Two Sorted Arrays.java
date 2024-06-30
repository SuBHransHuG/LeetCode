class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n1 = nums1.length;
    int n2 = nums2.length;
    int[] nums3 = new int[n1+n2];
    int i = 0;
    int j = 0;
    int k = 0;
     while(i < n1){   
         nums3[k++] = nums1[i++];   
        }   
        while(j < n2){   
         nums3[k++] = nums2[j++];   
        } 
        Arrays.sort(nums3);
        int n3 = nums3.length;
        double median ;
        if (n3 % 2 == 0) {
            median = ((double) nums3[n3 / 2 - 1] + nums3[n3 / 2]) / 2;
        } else {
            median = nums3[n3 / 2];
        }
        return median;
    }
}
