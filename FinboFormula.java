public class FinboFormula {
    public static void main(String[] args) {
//       for(int i=0;i<11;i++){
//           System.out.println(fiibonacci(i));
//       }
        System.out.println(fiibonacci(500));
    }
    static long fiibonacci(int n){

      return  (long) (Math.pow(((1+Math.sqrt(5))/2),n)/ Math.sqrt(5));
    }
}
