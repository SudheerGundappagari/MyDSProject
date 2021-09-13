package ds.recursion.exercise;

class EMain {
  public static void main(String[] args) {
    EMain main = new EMain();
    var result = main.decimalToBinary(30);
    System.out.println(result);

  }

  // Question 4 - Decimal to Binary

  public int decimalToBinary(int n) {
    if (n==0) {
      return 0;
    }
    return n%2 + 10*decimalToBinary(n/2);
  }


}
