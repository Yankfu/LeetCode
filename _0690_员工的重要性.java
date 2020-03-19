package com.LeetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/10 下午11:23
 * @Version 1.0
 */
public class _0690_员工的重要性 {
	public static void main(String[] args) {

	}
	static Map<Integer,Employee> map;
	public static int getImportance(List<Employee> employees, int id) {
		map = new HashMap<>();
		for (Employee e: employees) map.put(e.id, e);
		return dfs(id);
	}
	public static int dfs(int id){
		Employee employee = map.get(id);
		int ans = employee.importance;
		for (Integer subid: employee.subordinates)
			ans += dfs(subid);
		return ans;
	}
	class Employee {
		// It's the unique id of each node;
		// unique id of this employee
		public int id;
		// the importance value of this employee
		public int importance;
		// the id of direct subordinates
		public List<Integer> subordinates;
	}
}

