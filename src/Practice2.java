
public class Practice2 {
	public static void main(String[] args) {
		int dice = (int)(Math.random() * 10 + 1);
		switch(dice) {
			case 1 :
				System.out.println("Banana");
			break;
			case 2 :
				System.out.println("Orange");
			break;
			case 3 :
				System.out.println("Peach");
			case 4 :
				System.out.println("Apple");
			case 5 :
				System.out.println("Plums");
			break;
			case 6 :
				System.out.println("Pineapple");
			break;
			case 7 :
			break;
			default :
				System.out.println("Nuts");
		}
		System.out.println("dice = " + dice);
	}
}
