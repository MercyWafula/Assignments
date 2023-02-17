public class CalculateG {
    public static double  multiplication(double x, double y) {
        return x * y;
    }
    public static double square (double x) {
        return x * x;
    }
    public static double summation (double x, double y){
        return x + y;
    }
    public static void outline (String message, double result){
        System.out.println(message + result);
    }
    public static void main(String[] arguments){
        double gravity =-9.81; // Earth's gravity in m/s^2
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity = 0.0 ;
        double initialPosition = 0.0;
        double finalPosition = 0 ;
// Add the formulas for position and velocity
        //x(t)=0.5 * at2 + vit +xi
        finalPosition = gravity * fallingTime * fallingTime + initialVelocity * fallingTime;
        //v(t)=at + vi
        finalVelocity = gravity * fallingTime + initialVelocity;

        System.out.println("The object's position after " + fallingTime + " seconds is "
                + finalPosition + " m.");
        System.out.println("Object position after " + fallingTime + "Seconds " + finalPosition);

        double a = 1.5;
        double b = 9.3;
        double c = multiplication(a, b);
        outline ("multiplication: ", c);
        double d = square(a);
        outline("powering to square: ", d);
        double e = summation(a, b);
        outline("summation: ", e);
    }
}
