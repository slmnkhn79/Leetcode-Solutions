package leetcode.categorywisequestions.bitmanipulation;

import java.util.HashMap;

public class SingleNumber {
		public int singleNumber(int nums []) {
			HashMap<Integer,Integer> map = new HashMap<>();
			int frequency;
			int result = 0;
			
			for(Integer i : nums) {
				frequency = map.getOrDefault(i, 0);
				if(frequency ==0) {
					map.put(i, 1);
				}
				if(frequency==1)
				{
					map.put(i, 2);
				}
				
			}
			
			for (Integer i : map.keySet()) {
				if(map.get(i)==1)
					result =i;
			}
			return result;
			
		}
}
