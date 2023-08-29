package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10162 {
	static int A = 0;
	static int B = 0;
	static int C = 0;

	/*
	 * 문제
	 * 3개의 시간조절용 버튼 A B C가 달린 전자레인지가 있다. 
	 * 각 버튼마다 일정한 시간이 지정되어 있어 해당 버튼을 한번 누를 때마다 그 시간이 동작시간에 더해진다. 
	 * 버튼 A, B, C에 지정된 시간은 각각 5분, 1분, 10초이다.
	 * 냉동음식마다 전자레인지로 요리해야할 시간 T가 초단위로 표시되어 있다. 
	 * 우리는 A, B, C 3개의 버튼을 적절히 눌러서 그 시간의 합이 정확히 T초가 되도록 해야 한다. 
	 * 단 버튼 A, B, C를 누른 횟수의 합은 항상 최소가 되어야 한다. 
	 * 이것을 최소버튼 조작이라고 한다.
	 * 만일 요리시간이 100초라고 하면(T=100) B를 1번, C는 4번 누르면 된다. 
	 * 이와 다르게 C를 10번 눌러도 100초가 되지만 
	 * 이 경우 10번은 최소 횟수가 아니기 때문이 답이 될 수 없다. 
	 * 이 경우 B 1번, C 4번, 총 5번이 최소버튼 조작이다. 
	 * 그리고 T=234와 같이 3개의 버튼으로 시간을 정확히 맞출 수 없는 경우도 있다.
	 * 여러분은 주어진 요리시간 T초를 맞추기 위한 최소버튼 조작 방법을 구하는 프로그램을 작성해야 한다.
	 */

	/*
	 * 명제만들기
	 * 	-> 귀류법을 통해 명제가 참임을 증명
	 * 	-> 구현
	 * 
	 * 명제 : 음식시간을 맞추기위해 B버튼은 4번이하, C버튼은 5번이하로 눌러야함
	 * 증명 : B버튼 5번이상은 -> A버튼 1번으로 대체가능, C버튼 -> 6번 이상은 B버튼 1번으로 대체가능
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		if(T%10 > 0) bw.write(String.valueOf(-1));
		else {
			System.out.println(T/300);
			A = T/300;
			System.out.println((T%300)/60);
			B = (T%300)/60;
			System.out.println(((T%300)%60)/10);
			C = ((T%300)%60)/10;
			bw.write(A+" "+ B+" "+C);
		}
		bw.newLine();
		bw.close();
	}
}
