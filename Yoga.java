package Fitness;

/**
 * Created by Katrina Dutton on 01/12/2020
 * Program providing user with yoga poses.
 **/
public class Yoga extends UserProfile
{
   int index=0;
   final int MAXEXERCISES=10;
   String[] poses = new String[MAXEXERCISES];

   public Yoga() {
   } //Default constructor

   public Yoga(UserProfile puser1) {
      super.name = puser1.name;
      poses[0]="Bridge pose";
      poses[1]="Cat pose";
      poses[2]="Downward facing dog";
      poses[3]="Cobra";
      poses[4]="Chair pose";
      poses[5]="Child's pose";
      poses[6]="Tree pose";
      poses[7]="Warrior I";
      poses[8]="Warrior II";
      poses[9]="Mountain pose";
   } //Alternate constructor

   public void printExercises() {
      for (index=0; index < MAXEXERCISES; index++) {
         if(super.level.equals("a"))
         {
            System.out.println(poses[index] + " 40 seconds");
         }//if
         else {
            System.out.println(poses[index] + " 20 seconds");
         } //else
      } //for
   } //printExercises


}//class
