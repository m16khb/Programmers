package my.Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class OpenChatRoom {

	public static void main(String[] args) {
		OpenChatRoom ocr = new OpenChatRoom();
		for (String str : ocr.solution(new String[] { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
				"Enter uid1234 Prodo", "Change uid4567 Ryan" })) {
			System.out.println(str + ", ");
		}
	}

	class paragraph {
		String uid;
		String para;

		paragraph(String uid, String para) {
			this.uid = uid;
			this.para = para;
		}
	}

	public String[] solution(String[] record) {
		String[] answer;
		ArrayList<String> recordList = new ArrayList<>(Arrays.asList(record));
		ArrayList<paragraph> result = new ArrayList<>();
		//key 값의 중복을 허용하지 않는 Map을 사용하여 시간복잡도를 최소화 
		HashMap<String, String> uid = new HashMap<>();
		String Enter = "님이 들어왔습니다.";
		String Leave = "님이 나갔습니다.";

		for (int i = 0; i < recordList.size(); i++) {
			String[] temp = recordList.get(i).split(" ");
			if (temp[0].equals("Enter")) {
				result.add(new paragraph(temp[1], Enter));
				uid.put(temp[1], temp[2]);
			} else if (temp[0].equals("Leave")) {
				result.add(new paragraph(temp[1], Leave));
			} else if (temp[0].equals("Change")) {
				uid.put(temp[1], temp[2]);
			}
		}

		answer = new String[result.size()];
		for (int i = 0; i < result.size(); i++) {
			answer[i] = uid.get(result.get(i).uid) + result.get(i).para;
		}

		return answer;
	}
}
