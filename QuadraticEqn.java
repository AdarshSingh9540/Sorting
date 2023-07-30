public class QuadraticEqn {
    public static void main(String[] args) {
        double a =1,b=-7,c=10;
        double x1,x2;

        double d = b*b-4*a*c;
        if(d>0){
            System.out.println("Two real and distict root are:");
             x1 =(double) (-b+Math.sqrt(b*b -(4*a*c)))/2*a;
          x2 = (double) (-b-Math.sqrt(b*b -(4*a*c)))/2*a;
            System.out.format("root1 = %.2f and root2 = %.2f", x1, x2);
        } else if (d==0) {
            System.out.println("Two Equal and real root");
           x1 = x2 = (b*b/(4*a*c));
            System.out.format("root1 = %.2f", x1);

        }
        else{
            System.out.println("Imaginary roots");
        }

    }
}
