public class Swap {
	
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		System.out.println("a = " + a);
		int b = Integer.parseInt(args[1]);
		System.out.println("b = " + b);
		int t = 0;
		System.out.println("t = " + t);
		
		t = a;
		System.out.println("t = " + t);
		a = b;
		System.out.println("a = " + a);
		b = t;
		System.out.println("b = " + b);
	}
}
