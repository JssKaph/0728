
public class 성적관리프로그램 {
	public static void main(String[] args) {
		Student jimin = new Student();
		jimin.hakbun = "2022001";
		jimin.name = "한지민";
		jimin.kor = 100;
		jimin.eng = 89;
		jimin.mat = 78;
		jimin.tot = (jimin.kor + jimin.eng + jimin.mat); 
		jimin.avg = jimin.tot / 3.0; // 3.0 을 나눴기 때문에 실수
		jimin.avg = jimin.avg / 10; // 10 으로 나누어도 아직 실수
		
		//switch case문
		switch ((int)jimin.avg) { // switch는 실수가 안됨, (int)를 앞에 붙여 강제적으로 정수 변환
		case 9 : 
			jimin.grade = 'A';			
			break;
		case 8 : 
			jimin.grade = 'B';	
			break;
		case 7 : 
			jimin.grade = 'C';
			break;
		case 6 : 
			jimin.grade = 'D';
			break;
		default : 
			jimin.grade = 'F';
			break;
		}
		System.out.println("성적 : " + jimin.grade);
		
		//if문
		if (jimin.avg >= 9) {
		jimin.grade = 'A';
		} else if (jimin.avg >= 8) {
			jimin.grade = 'B';			
		} else if (jimin.avg >= 7) {
			jimin.grade = 'C';
		} else if (jimin.avg >= 6) {
			jimin.grade = 'D';		 
		} else {
			jimin.grade = 'F';
		}
		System.out.println("성적 : " + jimin.grade);
		
		//다항연산자
		jimin.grade = (jimin.avg >= 9) ? 'A' :
			(jimin.avg >= 8) ? 'B' :
				(jimin.avg >= 7) ? 'C' :
					(jimin.avg >= 6) ? 'D' : 'F';
		System.out.println("성적 : " + jimin.grade);
						
	}
}
