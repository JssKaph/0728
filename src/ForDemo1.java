import java.util.Scanner;

public class ForDemo1 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇 단 ? : ");
//		int dan = sc.nextInt();
//		for(int i=1; i<10; i++) { 
//			System.out.printf("%d x %d = %d\n", dan, i, dan* i);			
//		}	
		
		//별피라미드
//		for문을 두개 쓰면 방향을 두가지를 사용 할 수 있다.
//		for(int i=1; i<6; i++) { // 밑으로 내려가는 반복
//			for(int j=1; j<=i; j++) { // 옆으로 가는 반복, j는 i 만큼만 루프를 돈다, 이때 j가 i보다 커지면 OUT 16번 줄로 빠진다.
//				System.out.printf("★\t");
//			}	
//			System.out.println(); //줄바꿈
//		}
		
		//역피라미브
//		for(int i=5; i>0; i--) { // 5~1
//			for(int j=1; j<=i; j++) { //1줄 5개 프린트  6개에서 j가 i보다 크기때문에 23줄로 out 
//			System.out.printf("★\t");
//			}	
//		System.out.println(); //줄바꿈
//		}
		
		//ABCD 피라미드
//		for(int i = 65; i<91; i++) {  // 65 66 67~~ 카운트
//			for(int j=65; j<=i; j++) { // 65찍고 66에서 맞지 않기 때문에 out
//				System.out.printf("%c\t", j );
//			}
//			System.out.println();
//		}
		
		//구구단
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%dX%d=%d\t", i, j, i*j);
			}
			System.out.println();
		}
	}
}
