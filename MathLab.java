package edu.monmouth.MathOperations;

public class MathLab {
    public static void main(String args[]) {
	MathOps mathOps = new MathOps();
		
	System.out.println("Triangle area: " + mathOps.triangleArea(40, 50));
		
	System.out.println("Circle area: " + mathOps.circleArea(22));
		
	System.out.println("Circle circumference: " + mathOps.circleCircumference(22));
		
	System.out.println("Powers of 2: \n" + mathOps.powersOfTwo());
	
	}

}
