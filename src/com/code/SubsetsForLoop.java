/*78. Subsets
 * 
 * Given a set of distinct integers, nums, return all possible subsets.

 * Note: The solution set must not contain duplicate subsets.

 * For example,
 * If nums = [1,2,3], a solution is:
 * [[], [1], [2], [1,2],[3], [1,3], [2,3], [1,2,3]]
 */

package com.code;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetsForLoop {
	public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
      
      res.add(new ArrayList<Integer>());
      
      Arrays.sort(nums);
      
      for(int i : nums) {
          ArrayList<ArrayList<Integer>> tmp = new ArrayList<>();
          
          for(ArrayList<Integer> sub : res) {
              ArrayList<Integer> a = new ArrayList<>(sub);
              a.add(i);
              tmp.add(a);
          }
          res.addAll(tmp);
      }
      return res;
  }
}
