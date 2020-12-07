package Fitness;

/**
 * Created by Katrina Dutton on 01/12/2020
 * Program providing user with upper body exercises.
 **/
public class UpperBody extends UserProfile
{
   int index=0;
   final int MAXEXERCISES=10;
   String[] exercises = new String[MAXEXERCISES];

   public UpperBody() {
   } //Default constructor

   public UpperBody(UserProfile puser1) {
      super.name=puser1.name;
      super.gender=puser1.gender;
      exercises[0]="Tricep dips";
      exercises[1]="Bicep curls";
      exercises[2]="Upright row";
      exercises[3]="Press ups";
      exercises[4]="Pull aparts";
      exercises[5]="Incline press ups";
      exercises[6]="Tricep extensions";
      exercises[7]="Walk outs with press ups";
      exercises[8]="Lat pullover";
      exercises[9]="Lateral raise";
   } //Alternate constructor

   public void printExercises()
   {
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
