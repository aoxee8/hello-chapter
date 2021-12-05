package com.nicky.hello.algo;

/**
 * @Author: gaoxi1534@126.com
 * @CreateTime: 2021-12-05 22:14
 * @Description: 二叉树
 */
public class BinarySearch {

  public static void main(String[] args) {

    int[] nums = new int[]{1, 2, 3, 4, 5, 6};

    int target = 5;

    int val = binarySearch(nums, target);

    System.out.println(val);


  }


  private static int binarySearch(int[] nums, int target) {
    if (nums == null) {
      return -1;
    }

    int left = 0, right = nums.length - 1;

    while (left <= right) {

      //有效防止超过MAX_VALUE
      int mid = left + (right - left) / 2;

      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        right = mid - 1;
      } else if (nums[mid] < target) {
        left = mid + 1;
      }
    }

    return -1;
  }
}
