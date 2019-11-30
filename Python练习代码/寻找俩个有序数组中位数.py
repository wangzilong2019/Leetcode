from typing import List
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        l1=len(nums1)
        l2=len(nums2)
        nums1.extend(nums2)
        nums1.sort()
        if (l1+l2) & 1:
            return nums1[(l1+l2-1)>>1]
        else:
            return (mums1[(l1+l2-1)>>1]+nums1[(l1+l2)>>1])/2