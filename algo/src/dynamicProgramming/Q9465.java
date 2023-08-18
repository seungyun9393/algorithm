package dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q9465 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			int[][] S = new int[n+1][2];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int x=1; x<=n; x++) {
				S[x][0] = Integer.parseInt(st.nextToken());
			}
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int x=1; x<=n; x++) {
				S[x][1] = Integer.parseInt(st2.nextToken());
			}
			bw.write(String.valueOf(reverse(n, S)));
			bw.newLine();
		}
		bw.close();
	}
	
	/*
		1. 테이블 정의
			D[i][j] = i번째 까지의 스티커중 합의 최대값, 단 j행 i번째 스티커는 반드시 선택
		2. 점화식 찾기
			D[i][1] = max(D[i-1][2], D[i-2][1]) + S[i][1]
				-> D[i][1] = max(D[i-1][2], D[i-2][2]) + S[i][1]
			D[i][2] = max(D[i-2][2], D[i-1][1]) + S[i][2]
				-> D[i][2] = max(D[i-2][1], D[i-1][1]) + S[i][2]
		3. 초기값 작성
	*/ 
	static int reverse(int n, int[][] S) {
		int[][] D = new int[n+1][2];

		D[0][0] = 0;
		D[0][1] = 0;
		D[1][0] = S[1][0];
		D[1][1] = S[1][1];

		for(int i=2;i<=n;i++) {
			D[i][0] = Math.max(D[i-1][1], D[i-2][1]) + S[i][0];
			D[i][1] = Math.max(D[i-2][0], D[i-1][0]) + S[i][1];
		}
		return Math.max(D[n][0], D[n][1]);
	}
}
