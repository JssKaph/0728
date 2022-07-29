//다음과 같은 출력을 할 수 있도록 프로그래밍 하시오
import java.util.Scanner;
public class Practice3 {
	public static void main(String[] args) {
//		int cnt = 0;
//		int cnt1 = 1;
//		for(int i = 65; i<=90; i++) {
//			if(cnt1 % 2 == 0) 
//				System.out.print((char)(i+32) + "\t"); // 소문자 출력
//			else System.out.print((char)(i) + "\t");	 // 대문자 출력
//			cnt++;
//			if(cnt % 5 ==0)	{
//				System.out.println();
//				cnt1++;
//			}
//		}
		Scanner sc = new Scanner(System.in);
		Client jimin = new Client(); // class 생성
		System.out.print("이름을 입력 하십시오 : ");
		jimin.name = sc.nextLine();
		System.out.print("나이를 입력 하십시오 : ");
		jimin.age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별을 입력 하십시오(남성 : m, 여성 : f) : ");
		String gender = sc.nextLine(); // 스캐너는 캐릭터 값을 읽지 않는다. ex)jimin.gender
		jimin.gender = gender.charAt(0); // 지민의 젠더에 방금 젠더값의 첫글자를 받아주세요
 		System.out.print("체중을 입력 하십시오 : ");
		jimin.weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("신장을 입력 하십시오 : ");
		jimin.height = sc.nextDouble();
		sc.nextLine();
		double BMI = jimin.weight / ((jimin.height*0.01)*(jimin.height*0.01));
		jimin.BMI = BMI; // 지민 고객의 bmi 할당
		
		if (BMI >= 35)  
			jimin.result = "고도 비만";
		else if (BMI >= 30 && BMI < 35) // 30이상 && 35 미만
			jimin.result = "중도 비만";
		else if (BMI >= 25 && BMI < 30) 
			jimin.result = "경도 비만";
		else if (BMI >=23 && BMI < 25) 
			jimin.result = "과체중";
		else if (BMI >= 18.5 && BMI < 23) 
			jimin.result = "정상";
		else
			jimin.result = "저체중";
		
		System.out.println("<<고객의 검진 결과>>");
		System.out.println("이름 : " + jimin.name);
		System.out.println("나이 : " + jimin.age);
		System.out.print("성별 : ");
		System.out.println((jimin.gender == 'm') ? "남성" : "여성");
		System.out.println("키 : " + jimin.height);
		System.out.println("체중 : " + jimin.weight);
		System.out.println("BMI 지수 : " + jimin.BMI);
		System.out.println("결과 : " + jimin.result);
		System.out.println("결과는 다음과 같습니다. 감사합니다.");
	}
}