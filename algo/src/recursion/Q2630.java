package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2630 {
    static String s;
	static int head = 0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(br.readLine());
		
		for(int i=0; i<C; i++) {
			head = 0;
			s = br.readLine();
			
			reverse();
		}
		 
	}
    // 함수정의 func(n, x, y) : 시작지점이 x,y이며 가로,세로 n크기의 정사각형 안에서 파란색, 하얀색 색종이의 수
	
    /*
     *  재귀식
     *  가로,세로 n 크기의 정사각형에 모두 같은색이 아닐경우
     *  1사분면 func(2/n, x, y+2/n) 호출
     *  2사분면 func(2/n, x, y) 호출
     *  3사분면 func(2/n, x+2/n, y) 호출
     *  4사분면 func(2/n, x+2/n, y+2/n) 호출
     */
	static void reverse() {
		
	}
}
