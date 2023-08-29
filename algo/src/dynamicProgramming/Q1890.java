package dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1890 {
	static int N;
	static int[][] map;
	static Long[][] D;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		D = new Long[N][N];

		for (Long[] row : D) {
            Arrays.fill(row, 0L);
        }

		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		reverse(0, 0);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(D[N][N]));
		bw.close();
	}
	
	/*
		1. 테이블 정의
			D[x][y] = (x, y)에서 끝 점에 도달하는 경로의 수
		2. 점화식 찾기
			D[x][y] = D[x-a][y] + D[x][y-a]
		3. 초기값 작성
	*/ 
	static void reverse(int x, int y) {
		D[0][0] = 1L;

		for(int i=1; i<N; i++) {

		}
	}
}
