package ds.recursion;

class Main {
  public static void main(String[] args) {
    Main recursion = new Main();
    var rec = recursion.fibonacci(2);
    
   System.out.println(rec);
   printFIb(1,1);

  }

  public int fibonacci(int n) {
    if (n<0) {
      return -1;
    }
    if (n==0 || n==1) {
      return n;
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }

public static void printFIb(int a , int b) {
	if(b<50) {
	System.out.println(a+b);
	printFIb(b,a+b);
	}
}

}
