class FibNumbers {
    public static void main(String[]args) {
  
      int n = 50;
      int firstNumber = 0;
      int secondNumber = 1;
      
      while (firstNumber <= n) {
        System.out.print(firstNumber + ", ");
  
        int nextNumber = firstNumber + secondNumber;
        firstNumber = secondNumber;
        secondNumber = nextNumber;
        System.out.println(args);
        
  
      }
    }
  }