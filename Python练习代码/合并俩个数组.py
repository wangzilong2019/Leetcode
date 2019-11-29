class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        l1=0
        l2=0
        nums_copy=nums1[:m]
        i=0
        while(l1<m and l2<n):
            if(nums_copy[l1]<nums2[l2]):
                nums1[i]=nums_copy[l1]
                l1+=1
            else:
                nums1[i]=nums2[l2]
                l2+=1
            i+=1
        if(l1<m):
            nums1[i:m+n]=nums_copy[l1:m]
        if(l2<n):
            nums1[i:m+n]=nums2[l2:n]