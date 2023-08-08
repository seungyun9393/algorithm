package recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2630 {
	static int[][] s;
	static int blue = 0;
	static int white = 0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		s = new int[C][C];
		
		for(int i=0; i<C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<C; j++) {
				s[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		reverse(C, 0, 0);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(blue));
		bw.newLine();
		bw.write(String.valueOf(white));
		bw.close();
	}
	
	// 함수정의 func(s, x, y) : 시작지점이 x,y이며 가로,세로 n크기의 정사각형 배열 안에서 파란색, 하얀색 색종이의 수
	static void reverse(int n, int x, int y) {
		if(n <= 1) {
			if (s[x][y] == 1) {
				blue++;
			} else {
				white++;
			}
			return;
		}
		
		boolean onlyOne = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (s[x+i][y+j] != s[x][y]) {
					onlyOne = false;
				}
			}
		}
		/*
		*  재귀식
		*  가로,세로 n 크기의 정사각형에 모두 같은색이 아닐경우
		*  1사분면 func(2/n, x, y+2/n) 호출
		*  2사분면 func(2/n, x, y) 호출
		*  3사분면 func(2/n, x+2/n, y) 호출
		*  4사분면 func(2/n, x+2/n, y+2/n) 호출
		*/
		if(onlyOne) {
			if (s[x][y] == 1) {
				blue++;
			} else {
				white++;
			}
			return;
		}
		else {
			// 1사분면
			reverse(n/2, x, y+n/2);
			// 2사분면
			reverse(n/2, x, y);
			// 3사분면
			reverse(n/2, x+n/2, y);
			// 4사분면
			reverse(n/2, x+n/2, y+n/2);
		}
	}
}
