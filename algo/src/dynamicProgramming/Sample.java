package dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Sample {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		
		for(int i=0; i<C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<C; j++) {
				//s[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		reverse();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.newLine();
		bw.close();
	}
	
	/*
		DP 작성요령
		1. 테이블 정의
		2. 점화식 찾기
		3. 초기값 작성
	*/ 
	static void reverse() {
	}
}
