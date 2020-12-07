package Fitness;

/**
 * Created by Katrina Dutton on 01/12/2020
 * Program providing user with lower body exercises.
 **/
public class LowerBody extends UserProfile
{
   int index=0;
   final int MAXEXERCISES=10;
   String[] exercises = new String[MAXEXERCISES];

   public LowerBody() {
   } //Default constructor

   public LowerBody(UserProfile puser1) {
      super.name = puser1.name;
      super.gender = puser1.gender;
      exercises[0]="Wide squat";
      exercises[1]="Crab walks";
      exercises[2]="Bulgarian split squat";
      exercises[3]="Lunges";
      exercises[4]="Good morning";
      exercises[5]="Hip thruster";
      exercises[6]="Single leg curl";
      exercises[7]="Calf raises";
      exercises[8]="Donkey kicks";
      exercises[9]="Deadlift";
   } //Alternate constructor

   public void printExercises() {
      for (index=0; index < MAXEXERCISES; index++) {
         if(super.gender.equals("f"))
         {
            System.out.println(exercises[index] + " 15 reps");
         }//if
         else {
            System.out.println(exercises[index] + " 20 reps");
         } //else
      } //for
   } //printExercises
}//class
