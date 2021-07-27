package String;

public class ReverseEachword {
	public static void main(String[] args) {
		String str = "the sky is blue";
		System.out.println("The original string is: " + str);
		String strWords[] = str.split("\\s");
		String rev = "";
		for(String sw : strWords) {
		StringBuilder sb = new StringBuilder(sw);
		sb.reverse();
		rev += sb.toString() + " ";
		}
		System.out.println("The modified string is: " + rev.trim());
		}
		}


