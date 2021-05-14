public class GuessBigNum {
	
	public static void main(String[] args) {
		String  arg     = args[0];
		int     win     = 0;
		int     game    = 0;
		double  winRate = 0.0;
		do {
			int a = (int) (100 * Math.random());
			int b = 100 - a;
			int max = Math.max(a,b);
			String l = arg;
			
			if ((l.equals("l") && a == max) || (l.equals("r") && b == max)){
				System.out.println("You choose " + l + " card.");
				System.out.println("Congratulation, You WIN!");
				System.out.println("Left card is " + a);
				System.out.println("Right card is " + b);
				win = win+1;
			} else {	
				System.out.println("You choose " + l + " card.");
				System.out.println("Sorry, You LOSE!");
				System.out.println("Left card is " + a);
				System.out.println("Right card is " + b);
			}
			game = game+1;
			System.out.println("win:"+win);
			System.out.println("game:"+game);
			winRate = 100*(win*1.0)/(game*1.0);
			System.out.println("Win rate : " + Math.round(winRate)+"%");
			
		} while(!arg.equals("x"));
	}
}
