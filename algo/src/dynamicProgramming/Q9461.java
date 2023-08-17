package dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q9461 {
	static Long[] P = new Long[101];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<C; i++) {
			bw.write(String.valueOf(reverse(Integer.parseInt(br.readLine()))));
			bw.newLine();
		}
		System.out.println(Arrays.toString(P));
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
	static Long reverse(int N) {
		P[1] = P[2] = P[3] = 1L;
		P[4] = P[5] = 2L;

		if(N <= 5) return P[N];

		for(int i=6; i<N+1; i++) {
			P[i] = P[i-5] + P[i-1];
		}
		return P[N];
	}
}
