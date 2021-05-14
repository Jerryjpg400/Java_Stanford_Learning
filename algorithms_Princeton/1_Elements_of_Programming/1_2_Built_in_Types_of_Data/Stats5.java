/******************************************************************************
 *  Compilation:  javac Stats5.java
 *  Execution:    java Stats5
 *  
 *  Generate and print 5 random values between 0.0 and 1.0, and print
 *  their average value, min value, and max value.
 *
 *  % java Stats5
 *
 *  0.7203537279117841
 *  0.09574435157738448
 *  0.8979741693231866
 *  0.11949032184355113
 *  0.23425519545397544
 *  Average = 0.4135635532219763
 *  Min     = 0.09574435157738448
 *  Max     = 0.8979741693231866
 *
 *  % java Stats5
 *  0.25523821773554134
 *  0.6577131932424987
 *  0.14170223533941984
 *  0.2653444869526621
 *  0.895374957216799
 *  Average = 0.44307461809738424
 *  Min     = 0.14170223533941984
 *  Max     = 0.895374957216799
 *
 ******************************************************************************/
public class Stats5 {

	public static void main(String[] args) {
		double a = Math.random();
		double b = Math.random();
		double c = Math.random();
		double d = Math.random();
		double e = Math.random();
		
		double average = (a+b+c+d+e)/5.0;
		double min 	   = Math.min(a,Math.min(b, Math.min(c, Math.min(d,e))));
		double max     = Math.max(a,Math.max(b, Math.max(c, Math.max(d,e))));
 
 		System.out.println(a);
 		System.out.println(b);
 		System.out.println(c);
 		System.out.println(d);
 		System.out.println(e);
 		System.out.println("Average " + average);
 		System.out.println("Min     " + min);
 		System.out.println("Max     " + max);
	}
}
