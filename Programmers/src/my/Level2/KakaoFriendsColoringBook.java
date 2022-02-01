package my.Level2;

public class KakaoFriendsColoringBook {

	public static void main(String[] args) {
		KakaoFriendsColoringBook kfcb = new KakaoFriendsColoringBook();
//		int[] answer = kfcb.solution(6, 4, new int[][] { { 1, 1, 1, 0 }, { 1, 2, 2, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 },
//				{ 0, 0, 0, 3 }, { 0, 0, 0, 3 } });
		int[] answer = kfcb.solution(3, 3, new int[][] { { 0,1,0 }, { 1,1,0 }, { 0,0,0 }});
		for (int i : answer) {
			System.out.print(i + " ");
		}
	}

	public int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		
		int[] xy = null;
		do {
			xy = position(picture);
			if(xy == null)
				break;
			int[][] map = DFS(picture, new int[m][n], xy[0], xy[1], picture[xy[0]][xy[1]]);
			int size = mapSize(map);
			if(maxSizeOfOneArea < size) {
				maxSizeOfOneArea = size;
			}
			picture = deletePicture(picture, map);
			numberOfArea ++;
		} while (true);
		
		int[] answer = new int[2];

		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}

	public int[][] DFS(int[][] picture, int[][] map, int m, int n, int color) {
		map[m][n] = color;
		if (m - 1 >= 0 && picture[m - 1][n] == color && map[m - 1][n] == 0)
			DFS(picture, map, m - 1, n, color);
		if (n - 1 >= 0 && picture[m][n - 1] == color && map[m][n - 1] == 0)
			DFS(picture, map, m, n - 1, color);
		if (m + 1 < map.length && picture[m + 1][n] == color && map[m + 1][n] == 0)
			DFS(picture, map, m + 1, n, color);
		if (n + 1 < map[0].length && picture[m][n + 1] == color && map[m][n + 1] == 0)
			DFS(picture, map, m, n + 1, color);

		return map;
	}

	public int[][] deletePicture(int[][] picture, int[][] map) {
		for (int i = 0; i < picture.length; i++) {
			for (int j = 0; j < picture[0].length; j++) {
				if ((picture[i][j] & map[i][j]) != 0) {
					picture[i][j] = 0;
				}
			}
		}
		return picture;
	}

	public int[] position(int[][] picture) {
		int[] xy = null;
		boolean flag = false;
		for (int i = 0; i < picture.length; i++) {
			for (int j = 0; j < picture[0].length; j++) {
				if (picture[i][j] != 0) {
					xy = new int[] { i, j };
					flag = true;
					break;
				}
			}
			if(flag)
				break;
		}
		return xy;
	}
	
	public int mapSize(int[][] map) {
		int size = 0;
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] != 0) {
					size++;
				}
			}
		}
		
		return size;
	}
}
