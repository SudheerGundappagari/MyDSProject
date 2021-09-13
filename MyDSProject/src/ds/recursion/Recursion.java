package ds.recursion;

class PMain {
  public static void main(String[] args) {
   PMain recursion = new PMain();
    var rec = recursion.factorial(5);
    System.out.println(rec);
  }

  public int factorial(int n) {
    if (n<1) {
      return -1;
    }
    if (n==0 || n==1) {
      return 1;
    }
    return n * factorial(n-1);
  }


}
