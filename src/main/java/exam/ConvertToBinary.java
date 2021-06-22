package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    static void printBinary(int[] binary, int id)
    {
      for (i=id-1; i>=0; i--)
        System.out.print(binary[i]+ "");
    }
    
    public static void decimalToBinary(int num)
    {
      int[] binary = new int[100];
      int id = 0;
      
      while (num > 0)
      {
        binary[id++] = num % 2;
        num = num / 2;
      }
      
      printBinary(binary, id);
    }
    
    public static void main(String[] args)
	{
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter number- ");  
        int number= sc.nextInt();
		    decimalToBinary(number);
	}
    return "";
  }
}
