
public class RandomDemo {
	public static void main(String[] args) {
		int dice = (int)(Math.random() * 6 + 1); // Maximum 값을 곱하고 minimum 값을 더하고 정수로 변환하여 완성
		System.out.println(dice);
	}
}
