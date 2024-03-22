import java.util.Random;

public class NumberPicker {
	public static void main(String[] args) {
		Random r = new Random(); // se não importar, da erro de compilação. NumberPicker.java:3: error: cannot find symbol
		System.out.println(r.nextInt(10));
	}
}