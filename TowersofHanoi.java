// Brian McMonigle
// 2/24/23
// CIS 145


import java.util.Scanner;
// This will show us the names of the numbered pegs that will later show the moves 
// needed in order to be solved.
public class TowersofHanoi {
   public static final String SOURCE_PEG = "ONE";
   public static final String TARGET_PEG = "TWO";
   public static final String SPARE_PEG = "THREE";

//with this, we will be given the power of how many discs we want in the puzzle
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter number of discs:");
      int numberOfDiscs = scanner.nextInt();
      solveTowersOfHanoi(numberOfDiscs, SOURCE_PEG, TARGET_PEG, SPARE_PEG);
      scanner.close();
   }
   // This will solve towers of hanoi puzzle using recursion in the least moves possible
   // Note the change roles of pegs internally
   private static void solveTowersOfHanoi(int numberOfDiscs, String sourcePeg,
   String targetPeg, String sparePeg) {
      if (numberOfDiscs == 1) {
         System.out.println(sourcePeg + " => " + targetPeg);
      } else {
         solveTowersOfHanoi(numberOfDiscs - 1, sourcePeg, sparePeg,
         targetPeg);
         System.out.println(sourcePeg + " => " + targetPeg);
         solveTowersOfHanoi(numberOfDiscs - 1, sparePeg, targetPeg,
         sourcePeg);
      }
   }
}
