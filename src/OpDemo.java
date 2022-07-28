import java.util.Scanner;
import java.util.GregorianCalendar;
public class OpDemo {
	public static void main(String[] args) {
		// 나머지 연산자
//		System.out.println(5/2); // 정수만 취한다, 답 2
//		System.out.println(5%2 ); // 나머지 남은 몫
		
		// 이동 연산자
//		System.out.println(32767<<5); // 32767 * 2^5 (곱하기 개념)
//		System.out.println(32767>>5); // 32767 / 2^5 (나누기 개념)
//		System.out.println(-32767 >> 5); // -32767 / 2^5 (음수가 나옴)
//		System.out.println(-32767 >>> 5); // -32767 / 2^5 *-1, (양수가 나옴)

//		System.out.println(true && true); // &&를 두개 쓰면 앞에서 거짓이면 뒤에서도 거짓이라고 판단 하기 때문에 b를 ++b 안함, & 하나를 쓰면 앞에 결과는 상관없이 ++b를 수행함

		// 		&와 &&의 차이 예제, ||도 마찬가지
//		int a = 5; int b = 10; int x = 15;
//		if(a > x && ++b < x) {
//			System.out.println("참");
//		}
//		else {
//				System.out.println("거짓");
//		}

		//		System.out.println("b = " +b);
//		if(4>5) {
//			System.out.println("참");
//		}
//		else {
//			System.out.println("거짓");
//		}
		//삼항연산자 ?:
//		System.out.println((4>5) ? "참" : "거짓"); // 조건이 맞다면 ? 다음을 실행하고 아니라면 : 다음을 실행한다, if문 보다 훨씬 빠르다.		
//		Scanner  sc = new Scanner(System.in);
//		System.out.print("정수 하나를 입력하세요 : ");
//		int su = sc.nextInt();		
//		if(su%2==0) System.out.println("짝수입니다.");
//		else System.out.println("홀수입니다.");
//		System.out.println((su%2==0)? "짝수입니다." : "홀수입니다.");
		
//		Scanner  sc = new Scanner(System.in);
//		System.out.print("년도를 입력하세요 : ");
//		int year = sc.nextInt();
//		if((year%400==0) || (year % 4 == 0 && year % 100 !=0)) { 
////		400으로 나눠서 0으로 떨어지면 윤년이고, (||두개 사용하여서 앞에만 성립해도 출력) 4로 나눠서 0이 나오고 100으로 나눠서 0으로 떨어지지 않을때 
//			System.out.println("당신이 입력하신 " + year + "은 윤년입니다.");
//		}
//		else System.out.println("당신이 입력하신 " + year + "은 윤년이 아닙니다.");
		
//		System.out.print("당신이 입력하신 " + year + "는");
//		System.out.println((year%400==0) || (year % 4 == 0 && year % 100 !=0)? " 윤년입니다." : " 윤년이 아닙니다.");
		
//		GregorianCalendar gc = new GregorianCalendar();
//		boolean flag = gc.isLeapYear(year); 
//		System.out.println("당신이 입력하신 " + year + "년도는 " + ((flag) ? "윤년입니다." : "윤년이 아닙니다."));	
		
//		//할당연산자
//		int age = 26;
//		age++; //age = age + 1
//		age = age + 5;
//		//복합연산자
//		age += 5; 
		
	//	double = (ture) ? 2022 : 3.14; // 조건이 true 이나, 3.14 때문에 자동형변환이 되어 2022가 double로 변경됨 따라서 int가 아닌 double 사용
	}
}
