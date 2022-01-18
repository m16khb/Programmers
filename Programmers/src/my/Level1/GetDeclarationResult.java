package my.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GetDeclarationResult {
	// 신고 결과 받기
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = {};
		answer = new int[id_list.length];
		Set<String> tmp = new LinkedHashSet<String>(Arrays.asList(report));
		report = tmp.toArray(String[]::new);

		Map<String, Integer> result = new LinkedHashMap<>();

		for (int i = 0; i < id_list.length; i++) {
			result.put(id_list[i], 0);
		}

		Map<String, ArrayList<String>> reportMap = new HashMap<>();

		for (String str : report) {
			String[] temp = str.split(" ");
			String reporter = temp[0];
			String target = temp[1];
			if (reportMap.containsKey(target)) {
				reportMap.get(target).add(reporter);
			} else {
				ArrayList<String> reporters = new ArrayList<String>();
				reporters.add(reporter);
				reportMap.put(target, reporters);
			}
		}

		for (String key : reportMap.keySet()) {
			if (reportMap.get(key).size() >= k) {
				for (String name : reportMap.get(key)) {
					result.put(name, result.get(name) + 1);
				}
			}
		}
		
		
		int i = 0;
		for(Entry<String, Integer> e : result.entrySet()) {
			answer[i] = e.getValue();
			i++;
		}

		return answer;
	}
}
