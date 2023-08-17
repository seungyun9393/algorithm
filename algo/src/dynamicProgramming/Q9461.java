package dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9461 {
	static int[] P = new int[105];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<C; i++) {
			bw.write(String.valueOf(reverse(Integer.parseInt(br.readLine()))));
			bw.newLine();
		}
		bw.close();
	}
	
	/*
		DP 작성요령
		1. 테이블 정의
			- P[i] = i번째 정삼각형의 변의 길이
		2. 점화식 찾기
			- P[i] = P[i-5] + P[i-1]
		3. 초기값 작성
	*/ 
	static int reverse(int N) {
		P[0] = P[1] = P[2] = 1;
		P[3] = P[4] = 2;
		
		for(int i=5; i<=N; i++) {
			P[i] = P[i-5] + P[i-1];
		}
		return P[N-1];
	}
}
