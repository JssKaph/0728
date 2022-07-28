import java.util.Scanner;

public class SwichDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 어떤 계절을 좋아하시나요? (spring / summer / fall / winter) : ");
		String season = sc.nextLine();
		
		//삼항연산자
		String flowers = (season.equals("spring"))? "진달래, 개나리" : 
									(season.equals("summer")) ? "장미, 아카시아" :
										(season.equals("fall")) ? "코스모스, 백합" :
											(season.equals("winter")) ? "동백, 매화" : "잘못 입력 하셨습니다.";
		System.out.println(flowers);
		
		//if문
		if(season.equals("spring")) { // season이 알고 있는 번지의 값이 spring과 일치합니까?
			System.out.println("진달래, 개나리");
		}else if(season.equals("summer")) {
			System.out.println("장미, 아카시아");
		}else if(season.equals("fall")) {
			System.out.println("코스모스, 백합");
		}else if(season.equals("winter")) {
			System.out.println("동백, 매화");
		}
		else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		//switch case문
		switch(season){ //괄호 안에 변수
			case "spring" :
				System.out.println("진달래, 개나리");  
			break;
			case "summer" :
				System.out.println("장미, 아카시아");
				break;
			case "fall" :
				System.out.println("코스모스, 백합");
				break;
			case "winter" :
				System.out.println("동백, 매화");
				break;
			default : 
				System.out.println("잘못 입력 하셨습니다.");	
		}
	}
}
