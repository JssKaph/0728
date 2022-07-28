
public class ForDemo {
	public static void main(String[] args) {
//		for(int su =1; su <= 10; su++) { // 시작(초기)|끝(조건)|증가(증감) 세미콜론 기준
//			System.out.print(su + "\t");
//		}
//		for(int su =10; su > 0; su--) { 
//			System.out.print(su + "\t");
//		}
		
//		for(int i = 1; i <= 20; i++) {
//			if (i % 3 == 0)
//			System.out.print(i + "\t");
//		}
		
		//20부터 180까지의 숫자를 출력하되 7의 배수를 출력하며, 한 줄에 5개만 출력 하세요
		int m = 0;
		for(int i = 20; i <= 180; i++) {
			if(i % 7 == 0) {
				System.out.print(i + "\t");
				m++;
				if(m % 5 == 0)  // 동시에 작동 해야 하기 때문에 if문을 같이 묶어 사용 else if 사용 x
					System.out.println();
			}
		}
	}
}
