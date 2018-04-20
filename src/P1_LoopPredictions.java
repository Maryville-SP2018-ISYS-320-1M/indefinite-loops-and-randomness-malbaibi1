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
 Expected output: STARTING LOOP TEST 
1 11 21 31 41 51 61 71 81 91 ENDING LOOP TEST 
 (b)
 Repeats: zero time
 Expected output: STARTING LOOP TEST 
 ENDING LOOP TEST 
 (c)
 Repeats: infinity times
 Expected output: STARTING LOOP TEST
 250
 250
 250....
 (d)
 Repeats: zero time
 Expected output: STARTING LOOP TEST 
 ENDING LOOP TEST 
   
 */

/*
 Was your prediction correct?
 
 (a) Correct
 (b) Correct
 (c) Correct
 (d) Correct
*/
public class P1_LoopPredictions {

 public static void main(String[] args) {
  System.out.println("STARTING LOOP TEST");
  
  
  //d
  String word = "a";
  while( word.length() < 10){
    word = "b" + word + "b";
  }
  
    
  System.out.println("ENDING LOOP TEST");
 }

}