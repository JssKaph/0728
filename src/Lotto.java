
public class Lotto {
	public static void main(String[] args) {
		int lo1, lo2, lo3, lo4, lo5, lo6;
		do {
			lo1 = (int)(Math.random() * 45 + 1);
			lo2 = (int)(Math.random() * 45 + 1);
			lo3 = (int)(Math.random() * 45 + 1);
			lo4 = (int)(Math.random() * 45 + 1);
			lo5 = (int)(Math.random() * 45 + 1);
			lo6 = (int)(Math.random() * 45 + 1);
		} while (lo1==lo2||lo1==lo3||lo1==lo4||lo1==lo5||lo1==lo6||
				lo2==lo3||lo2==lo4||lo2==lo5||lo2==lo6||lo3==lo4||
				lo3==lo5||lo3==lo6||lo4==lo5||lo4==lo6||lo5==lo6); 
		System.out.printf("1 = %d , 2 = %d , 3 = %d , 4 = %d , 5 = %d , 6 = %d ", lo1, lo2, lo3, lo4, lo5, lo6);
		
	}
}
