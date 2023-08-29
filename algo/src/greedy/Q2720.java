package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2720 {
	/*
	 * 미국으로 유학간 동혁이는 세탁소를 운영하고 있다. 
	 * 동혁이는 최근에 아르바이트로 고등학생 리암을 채용했다. 동혁이는 리암에게 실망했다.
	 * 리암은 거스름돈을 주는 것을 자꾸 실수한다.
	 * 심지어 $0.5달러를 줘야하는 경우에 거스름돈으로 $5달러를 주는것이다!
	 * 어쩔수 없이 뛰어난 코딩 실력을 발휘해 리암을 도와주는 프로그램을 작성하려고 하지만, 디아블로를 하느라 코딩할 시간이 없어서 이 문제를 읽고 있는 여러분이 대신 해주어야 한다.
	 * 거스름돈의 액수가 주어지면 리암이 줘야할 
	 * 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성하시오. 
	 * 거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다. 
	 * 예를 들어, $1.24를 거슬러 주어야 한다면, 손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.
	 */
	/*
	 * 명제만들기
	 * 	-> 귀류법을 통해 명제가 참임을 증명
	 * 	-> 구현
	 * 
	 * 명제 : 거스름돈을 맞추기위해 다임 동전갯수는 2개이하, 니켈 동전갯수는 1개이하, 페니 동전갯수는 4개이하로 사용해야함.
	 * 귀류법 : 다임 동전을 3개 이상쓸경우 -> 쿼터 동전1개, 니켈동전 1개로 대체가능, 니켈동전 2개이상을 쓸경우 -> 다음동전 1개로 대체가능
	 * 			페니동전 5개 이상을 쓸경우 니켈 동전 1개로 대체가능
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<T; i++) {
			int C = Integer.parseInt(br.readLine());
			int Q,D,N,P = 0;

			Q = C/25;
			D = (C%25)/10;
			N = ((C%25)%10)/5;
			P = (((C%25)%10)%5)%10;
			bw.write(Q+" "+D+" "+N+" "+P);
			bw.newLine();
		}
		bw.close();
	}
}
