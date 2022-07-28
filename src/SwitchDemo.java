
public class SwitchDemo {
	public static void main(String[] args) {
		int su = 234;
		// 삼항 연산자
		System.out.println((su%2 ==0)? "짝수" : "홀수");
		
		// if 문
		if(su % 2 == 0) {
			System.out.println("짝수");
		}
			else {
				System.out.println("홀수");
		
		// switch else 문
		//스위치는  char, byte, short, int, enum  만 넣을 수 있다. 가독성이 좋고 속도가 빠르다.
		}
		switch(su % 2) {// true pulse가 아닌 값 완전하게 확신하기 전
			case 0 : System.out.println("짝수");
				break; // break를 사용하지 않으면 다음 케이스로 저절로 넘어가 break를 걸어 판별시켜 주어야 한다.
			case 1 : System.out.println("홀수");
				break; 
			default : // 마지막 else 같은 문
		}
	}
}