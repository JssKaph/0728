//다음과 같은 출력을 할 수 있도록 프로그래밍 하시오

public class Practice3 {
	public static void main(String[] args) {
		int cnt = 0;
		int cnt1 = 1;
		for(int i = 65; i<=90; i++) {
			if(cnt1 % 2 ==0) 
				System.out.print((char)(i+32) + "\t");
			else System.out.print((char)(i) + "\t");	
			cnt++;
			if(cnt % 5 ==0)	{
				System.out.println();
				cnt1++;
			}
		}
	}
}