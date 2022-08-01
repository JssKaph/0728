import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		//년과 월을 입력하면 그 날의 마지막 날
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력 해 주세요 : ");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.print("월을 입력 해 주세요 : ");
		int month = sc.nextInt();
		sc.nextLine();
	
		if(month == 2) //2월이라면
		{
			if(year % 400 ==0 || (year % 4 ==0 && year / 100 != 0)) // 윤년이라면
			{ 
				System.out.println("마지막 날은 29일 입니다.");
			}
			else  // 윤년이 아니라면
			{
				System.out.println("마지막 날은 28일 입니다."); 
			}
		}
		else if(month !=2) // 2월이 아니라면
		{ 
			if (month ==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) 
			{
				System.out.println("마지막 날은 31일 입니다.");
			}
			else 
			{
				System.out.println("마지막 날은 30일 입니다.");
			}
		}
	}
}
