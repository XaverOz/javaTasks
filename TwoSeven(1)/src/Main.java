
public class Main {
	public static void main(String[] args) {
		StringBuilder temp = new StringBuilder();
		for(int i = 1; i <= 100; i++) {
			temp.setLength(0);
			if(i % 2 == 0) {
				temp.append("Two");
			}
			if(i % 7 == 0) {
				temp.append("Seven");
			}
			if(temp.length() == 0) {
				temp.append(i);
			}
			System.out.println(temp);
		}
	}
}
