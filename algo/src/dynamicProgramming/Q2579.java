package dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2579 {
	static int[][] D = new int[305][3];
	static int[] score  = new int[305];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());

		for(int i=1; i<=C; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(reverse(C)));
		bw.close();
	}
	
	/*
		1. 테이블 정의
			- D[i][j] = j개의 계단을 연속해서 밟고, i번째 계단으로 올라올때 최대 점수, i는 무조건 밟음
		2. 점화식 찾기
			- D[i][1] = max(D[i-2][1], D[i-2][2]) + score[i]
			- D[i][2] = D[i-1][1] + score[i]
		3. 초기값 작성
	*/ 
	static int reverse(int N) {
		D[1][1] = score[1];
		D[1][2] = 0;
		D[2][1] = score[2];
		D[2][2] = score[1] + score[2];

		for(int i=3;i<=N;i++) {
			D[i][1] = Math.max(D[i-2][1], D[i-2][2]) + score[i];
			D[i][2] = D[i-1][1] + score[i];
		}
		return Math.max(D[N][1], D[N][2]);
	}
}
