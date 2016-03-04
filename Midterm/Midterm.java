import java.util.Arrays;
import java.util.HashSet;

public class Midterm {

	/*
	 * (10 points) Given an unsorted array nums, write a function to move all
	 * 0's to the end of it while maintaining the relative order of the non-zero
	 * elements. For example, given nums = [0, 1, 0, 3, 12], after calling your
	 * function, nums should be [1, 3, 12, 0, 0]. The entry is given as follows:
	 * Bonus: If you can do it in-place without making a copy of the array, you
	 * will get extra 5 points as bonus.
	 * 
	 */
	public void moveZeroes(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				for (int j = i; j < nums.length - 1; j++) {
					nums[j] = nums[j + 1];
				}
				nums[nums.length - 1] = 0;
			} else {
				continue;
			}
		}
		//System.out.println(Arrays.toString(nums));
	}

	/*
	 * (10 points) Given two strings s and t, write a function to determine if t
	 * is an anagram of s. For example, s = "anagram", t = "nagaram", return
	 * true. s = "rat", t = "car", return false. Note: You may assume the string
	 * contains only lowercase alphabets. The entry is given as follows:
	 * 
	 */
	public boolean isAnagram(String s, String t) {

		int[] sCount = new int[26];
		int[] tCount = new int[26];

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int letterIndexOfS = c - 'a';
			sCount[letterIndexOfS] += 1;
		}

		for (int j = 0; j < t.length(); j++) {
			char d = t.charAt(j);
			int letterIndexOfT = d - 'a';
			tCount[letterIndexOfT] += 1;
		}

		return Arrays.equals(sCount, tCount);
	}

	/*
	 * Given an unsorted array of integers, find if the array contains any
	 * duplicates. Your function should return true if any value appears at
	 * least twice in the array, and it should return false if every element is
	 * distinct. The entry is given as follows: Bonus: If you can do it in O(N)
	 * time, you will get extra 5 points.
	 * 
	 */
	public boolean containsDuplicate(int[] nums) {

		HashSet<Integer> hsOfNums = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			hsOfNums.add(nums[i]);
		}
		return hsOfNums.size() != nums.length;
	}

	/*
	 * (10 points) Given a column title as appear in an Excel sheet, return its
	 * corresponding column number. For example: A -> 1, B -> 2, ¡­ Z -> 26, AA
	 * -> 27, AB -> 28
	 * 
	 */
	public int titleToNumbers(String title) {

		int columnNumber = 0;
		if (title == null || title.length() == 0) {
			System.out.println("Exception: No Input!");
			return 0;
		} else {
			for (int i = title.length() - 1; i > 0; i--) {
				columnNumber += Math.pow(26, i);
			}
			columnNumber += title.charAt(title.length() - 1) - 'A' + 1;
			return columnNumber;
		}
	}

	/*
	 * Given an unsorted array of integers(no duplicates), count the pairs in
	 * which there are two numbers and they add up to a specific target number.
	 * The array is given as follows: For example: Input: nums={2, 7, 11, 15},
	 * target=9, there is one pair {2,7} so return: 1 Input: nums={2, 7, 11,
	 * 15}, target=10, there is no pair so return 0. Input: nums={1,5,2,4,3,6},
	 * target=7, there is are three pairs {1,6}, {2,5}, {3,4} so return 3. Note:
	 * {1,2} and {2,1} are regarded as the same pair. More-Bonus: If you can do
	 * it in O(N) time, you will get extra 5 points.
	 * 
	 */
	public int twoSum(int[] nums, int target) {

		int count = 0;
		HashSet<Integer> hsOfNums = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hsOfNums.contains(target - nums[i])) {
				count++;
			}
			hsOfNums.add(nums[i]);
		}
		return count;
	}

}
