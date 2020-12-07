package Fitness;

/**
 * Created by Katrina Dutton on 01/12/2020
 * Program providing user with pilates exercises.
 **/
public class Pilates extends UserProfile
{
   int index=0;
   final int MAXEXERCISES=15;
   String[] exercises = new String[MAXEXERCISES];

   public Pilates() {
   } //Default constructor

   public Pilates(UserProfile puser1) {
      super.name = puser1.name;
      exercises[0]="Leg circles";
      exercises[1]="The one hundred";
      exercises[2]="Single leg stretch";
      exercises[3]="Criss cross";
      exercises[4]="Double leg stretch";
      exercises[5]="Scissor kick";
      exercises[7]="Pendulum";
      exercises[8]="Plank leg lift";
      exercises[9]="Plank rock";
      exercises[10]="Slow mountain climber";
      exercises[11]="Hip dips";
      exercises[12]="Downward facing dog";
      exercises[13]="Cobra";
      exercises[14]="Bow";
   } //Alternate constructor

   public void printExercises() {
      for (index=0; index < MAXEXERCISES; index++) {
         if(super.level.equals("a"))
         {
            System.out.println(exercises[index] + " 40 seconds");
         }//if
         else {
            System.out.println(exercises[index] + " 20 seconds");
         } //else
      } //for
   } //printExercises

}//class
