import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    static String s;
	static int head = 0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(br.readLine());
		
		for(int i=0; i<C; i++) {
			head = 0;
			s = br.readLine();
			
			System.out.println(reverse());
		}
		
	}
	
	static String reverse() {
		
		if(s.charAt(head)!='x'){
			head++;
			return s.charAt(head-1)+"";
		} 
		
		// x이면 4가지 구역으로 쪼개짐
		head++;
		String str[] = new String[4];
		str[0] = reverse(); // 왼쪽상단
		str[1] = reverse(); // 오른쪽상단
		str[2] = reverse(); // 왼쪽하단
		str[3] = reverse(); // 오른쪽하단
		
		return "x"+str[2]+str[3]+str[0]+str[1];
	}
}
