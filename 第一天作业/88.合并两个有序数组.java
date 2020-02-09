/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 *
 * https://leetcode-cn.com/problems/merge-sorted-array/description/
 *
 * algorithms
 * Easy (46.44%)
 * Likes:    408
 * Dislikes: 0
 * Total Accepted:    106.2K
 * Total Submissions: 228.3K
 * Testcase Example:  '[1,2,3,0,0,0]\n3\n[2,5,6]\n3'
 *
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 
 * 说明:
 * 
 * 
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 
 * 
 * 示例:
 * 
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * 
 * 输出: [1,2,2,3,5,6]
 * 
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        for (int i = 0; i < n; i++) { //nums2
            for (int j = 0; j < m; j++) { //nums1
                if (nums1[j]>nums2[i]) { //找到nums1里第一个大于nums2的元素                    
                    moveItem(nums1, j ,m);//从下标j开始后面的元素往后挪一位。
                    nums1[j] = nums2[i]; //将j处的元素替换
                    m++;//nums1 可用长度+1
                    break;
                }else if (j+1 == m) { //对比到末尾都未符合条件
                    nums1[j+1] = nums2[i]; //将数字插入到末尾
                    m++;
                    break;
                } 
            }
        }
    }

    public void moveItem(int[] nums,int index,int length) {
        for (int i = length; i > index; i--) {
            nums[i] = nums[i-1];
        }
    }
}
// @lc code=end

