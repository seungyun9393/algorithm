package recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q9934 {
	static int[] s;
	static HashMap<Integer, ArrayList<Integer>> answer;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		s = new int[C];
		answer = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<C; i++) {
			s[i] = Integer.parseInt(st.nextToken());
		}
		reverse(s, 1);
		System.out.println(answer);
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// bw.newLine();
		// bw.close();
	}
	
	// 함수정의 func(int[] s, int level) : 배열로된 방문순서 s 를 반으로 나누고, 중앙값은 입력받은 level에 삽입
	static void reverse(int[] s, int level) {
		// 탈출루프 : s의 길이가 1일경우 해당 배열을 입력받은 level 배열에 넣는다.

		System.out.println("level :"+level);
		System.out.println("s :"+Arrays.toString(s));
		if(s.length == 1) {
			ArrayList<Integer> visit = answer.getOrDefault(level, new ArrayList<>());
			visit.add(s[0]);
			answer.put(level, visit);
			return;
		}
		/*
		*  재귀식
		*	1. 입력배열을 반으로나눈뒤, 왼쪽자식을 먼저 순회
		*	2. 왼쪽 순회 후 가운데값을 현재 level 배열에 담는다.
		*	3. 반으로 나눈 나머지 오른쪽 배열을 순회
		*/
		reverse(Arrays.copyOfRange(s, 0, s.length/2), level+1);

		ArrayList<Integer> visit = answer.getOrDefault(level, new ArrayList<>());

		visit.add(s[s.length/2]);
		answer.put(level, visit);

		reverse(Arrays.copyOfRange(s, s.length/2 + 1, s.length), level+1);
	}
}
