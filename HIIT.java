package Fitness;

/**
 * Created by Katrina Dutton on 01/12/2020
 * Program providing user with high intensity interval exercises.
 **/
public class HIIT extends UserProfile
{
   int index=0;
   final int MAXEXERCISES=10;
   String[] exercises = new String[MAXEXERCISES];

   public HIIT() {
   } //Default constructor

   public HIIT(UserProfile puser1) {
      super.name = puser1.name;
      super.gender = puser1.gender;
      super.weight = puser1.weight;
      super.height = puser1.height;
      exercises[0]="Jumping jacks";
      exercises[1]="Mountain climbers";
      exercises[2]="Jumping squats";
      exercises[3]="Russian twists";
      exercises[4]="Burpees";
      exercises[5]="Jumping lunges";
      exercises[6]="Press ups";
      exercises[7]="Plank jacks";
      exercises[8]="Star jumps";
      exercises[9]="Butt kickers";
   } //Alternate constructor

   public void printExercises()
   {
      double bmi=calculateBodyMassIndex();
      System.out.println("BMI is: " + df.format(bmi));
      for (index=0; index < MAXEXERCISES; index++) {
         if(super.gender.equals("f"))
         {
            System.out.println(exercises[index] + " 30 seconds");
         }//if
         else {
            System.out.println(exercises[index] + " 40 seconds");
         } //else
      } //for
   } //printExercises
}//class
