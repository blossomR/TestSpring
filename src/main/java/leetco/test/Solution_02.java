package leetco.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Solution_02 {
    @Test
    public void tester() {
        System.out.println(lengthOfLongestSubstring("pwwkew"));//3 kew/kew
        System.out.println(lengthOfLongestSubstring("abcabcbb"));//3
        System.out.println(lengthOfLongestSubstring("dvdf"));//3
    }


    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int start = 0;
        // 定义一个 map 数据结构存储 (k, v)，其中 key 值为字符，value 值为字符位置 +1，+1 表示从字符位置后一个才开始不重复
        Map<Character, Integer> map = new HashMap<>();
        // 我们定义不重复子串的开始位置为 start，结束位置为 i
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            // 随着 end 不断遍历向后，会遇到与 [start, end] 区间内字符相同的情况，
            // 此时将字符作为 key 值，获取其 value 值，并更新 start，
            // 此时 [start, end] 区间内不存在重复字符
            if (map.containsKey(ch)) {
                start = Math.max(map.get(ch), start);
            }
            // 无论是否更新 start，都会更新其 map 数据结构和结果 maxLen
            maxLen = Math.max(maxLen, end + 1 - start);
            map.put(ch, end + 1);
        }
        return maxLen;
    }
}