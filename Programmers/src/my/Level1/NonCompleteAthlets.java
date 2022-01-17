package my.Level1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class NonCompleteAthlets {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		NonCompleteAthlets nca = new NonCompleteAthlets();
		String[] a = { "mislav", "stanko", "mislav", "ana" };
		String[] b = { "stanko", "ana", "mislav" };
		System.out.println(nca.solution(a, b));
	}

	public String solution(String[] participant, String[] completion) {
		//완주하지 못한 선수
		String answer = "";

		// 해쉬 맵 사용
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

//		for (int i = 0; i < participant.length; i++) {
//			hm.put(participant[i], hm.containsKey(participant[i]) ? hm.get(participant[i]) + 1 : 1);
//		}
//
//		for (int i = 0; i < completion.length; i++) {
//			if (hm.containsKey(completion[i])) {
//				hm.put(completion[i], hm.get(completion[i]) - 1);
//			}
//		}
		
		for (String player : participant)
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		for (String player : completion)
			hm.put(player, hm.get(player) - 1);

		Iterator<Entry<String, Integer>> iter = hm.entrySet().iterator(); //iterator 사용법 익혀놓기
		while (iter.hasNext()) {
			Entry<String, Integer> e = iter.next();
			if (e.getValue() != 0)
				answer = e.getKey();
		}
		return answer;
	}
}
