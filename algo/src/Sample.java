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
	
	// 함수정의 
	static void reverse() {
		/*
		*  재귀식
		*/
	}
}
