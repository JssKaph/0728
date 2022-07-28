import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		// 출생연도를 받아서 띠를 알아봐라
		Scanner sc = new Scanner(System.in);
		System.out.print("출생연도를 입력 해 주세요 : ");
		int year = sc.nextInt();
		
		if(year % 12 == 0) {
			System.out.println("당신은 원숭이 띠 입니다.");
		}
		else if (year % 12 == 1) {
			System.out.println("당신은 닭띠 입니다.");
		}
		else if (year % 12 == 2) {
			System.out.println("당신은 개띠 입니다.");
		}
		else if (year % 12 == 3) {
			System.out.println("당신은 돼지띠 입니다.");
		}
		else if (year % 12 == 4) {
			System.out.println("당신은 쥐띠 입니다.");
		}
		else if (year % 12 == 5) {
			System.out.println("당신은 소띠 입니다.");
		}
		else if (year % 12 == 6) {
			System.out.println("당신은 범띠 입니다.");
		}
		else if (year % 12 == 7) {
			System.out.println("당신은 토끼띠 입니다.");
		}
		else if (year % 12 == 8) {
			System.out.println("당신은 용띠 입니다.");
		}
		else if (year % 12 == 9) {
			System.out.println("당신은 뱀띠 입니다.");
		}
		else if (year % 12 == 10) {
			System.out.println("당신은 말띠 입니다.");
		}
		else
			System.out.println("당신은 양띠 입니다.");
		}
	}

