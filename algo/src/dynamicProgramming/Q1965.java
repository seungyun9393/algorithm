package dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1965 {
	static int[] D = new int[1005];
	static int[] B = new int[1005];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		Arrays.fill(D, 1);
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<C; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(reverse(C)));
		bw.newLine();
		bw.close();
	}
	
	/*
		1. 테이블 정의
			- D[i] = i번째의 상자까지 있을때 최대로 한번에 넣을수있는 수 
		2. 점화식 찾기
			?? LIS 알고리즘 참고..
		3. 초기값 작성
	*/ 
	static int reverse(int N) {
		int a = 0;
		for(int i=1; i<=N; i++) {
			for(int j=0; j<i; j++) {
				if(B[i] > B[j]) D[i] = Math.max(D[i], D[j] + 1);
			}
			a = Math.max(D[i], a);
		}
		return a;
	}
}
