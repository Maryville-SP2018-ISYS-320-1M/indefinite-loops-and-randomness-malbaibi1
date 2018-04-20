/*
 ISYS 320
 Name: Mansour Albaibi
 Date: 21-4-2018
*/
import java.util.Scanner;
import java.util.Random;

public class P5_RandomMessageRepeater {

 public static void main(String[] args) {
  String str = getRandomMessage();
  System.out.println(str);
  whileRepeater(str);
  doWhileRepeater(str);
 }
 public static String getRandomMessage()   // method to select one message.
{  Random rand = new Random();
   String str;
   int x = rand.nextInt( 3 ) + 1;
    str = "a" + x;
   if (str.equals("a1"))
     str = "First Message";
   if (str.equals("a2"))
     str = "Second Message";
   if (str.equals("a3"))
     str = "Third Message";
  return str;
}
  public static void whileRepeater(String str)   // method to print message using while.
{  int n=1;
   Scanner in = new Scanner(System.in);
    while(n>=0)
    {System.out.println(str);
      System.out.println("Do you want to hear it again (-1 for no)?");
      n = in.nextInt();
    }
  return;
}
  public static void doWhileRepeater(String str)   // method to print message using do while.
{  int n=1;
   Scanner in = new Scanner(System.in);
    do
    {System.out.println(str);
      System.out.println("Do you want to hear it again (-1 for no)?");
      n = in.nextInt();
    }while(n>=0);
  return;
}
}