/*
 ISYS 320
 Name: Mansour Albaibi
 Date: 21-4-2018 
*/

/*
 How many times do you expect the loop to repeat? Remember that 
 “zero,” “infinity,” and “unknown” are legal answers.
 
 What do you expect the loop to output?
 
 (a)
 Repeats: 10 times
 Expected output:STARTING LOOP TEST 
 1 11 21 31 41 51 61 71 81 91 ENDING LOOP TEST 
 (b)
 Repeats: infinite times
 Expected output: STARTING LOOP TEST
 1
 0
 -1.......
 (c)
 Repeats: infinite times
 Expected output:STARTING LOOP TEST
 250
 250
 250....
 (d)
 Repeats: 5 times 
 Expected output:STARTING LOOP TEST 
 bbbbbabbbbb 
 ENDING LOOP TEST 
   
 */

/*
 Was your prediction correct?
 
 (a)
 (b)
 (c)
 (d)
*/
public class P4_DoLoopPredictions {

 public static void main(String[] args) {
  System.out.println("STARTING LOOP TEST");
  
  
  //d
  String word = "a";
  do{
     word = "b" + word + "b";
  }while( word.length() < 10);
  System.out.println( word );
  
    
  System.out.println("ENDING LOOP TEST");

 }

}