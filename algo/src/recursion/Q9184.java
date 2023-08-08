package recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q9184 {
	static int[] s;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = new int[3];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<3; i++) {
			s[i] = Integer.parseInt(st.nextToken());
		}
		int a = reverse(s[0], s[1], s[2]);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.format("w(%d, %d, %d) = %d", s[0], s[1], s[2], a));
		bw.close();
	}
	
	// 함수정의 
	static int reverse(int a, int b, int c) {
		/*
		 * 문제
		 * 1. a, b, c 중 한개라도 0보다 작거나 같으면 1을 반환
		 * 2. a, b, c 중 한개라도 20보다 크다면 reverse(20,20,20) 을 반환
		 * 3. a < b < c 를 만족한다면, reverse(a,b,c-1) + reverse(a,b-1,c-1) - reverse(a,b-1,c) 을 반환
		 * 4. 그 외 reverse(a-1,b,c) + reverse(a-1,b-1,c) + reverse(a-1,b,c-1) - reverse(a-1,b-1,c-1)
		 */
		if(a <= 0 || b <= 0 || c <= 0) return 1;
		else if(a > 20 || b > 20 || c > 20) return reverse(20, 20, 20);
		else if(a < b && b < c) return reverse(a, b, c-1) + reverse(a, b-1, c-1) - reverse(a, b-1, c);
		else return reverse(a-1, b, c) + reverse(a-1, b-1, c) + reverse(a-1, b, c-1) - reverse(a-1, b-1, c-1);


		/*
		*  재귀식
		*/
	}
}
