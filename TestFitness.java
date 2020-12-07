package Fitness;

/**
 * Created by Katrina Dutton on 06/12/2020
 * Program to test the different classes.
 **/
public class TestFitness
{

   public static void main(String[] args)
   {
      UserProfile user1 = new UserProfile("Katie", 22, 170, 63, "f", 5, "a");
      //user1.readAllDetails();
      UpperBody userUpperBody = new UpperBody(user1);
      userUpperBody.printExercises();
      HIIT hiit = new HIIT(user1);
      hiit.printExercises();


   }//main
}//class
