package Fitness;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by Katrina Dutton on 01/12/2020
 * Program to take in details from the user.
 **/
public class UserProfile
{
   Scanner keyboard = new Scanner(System.in);
   DecimalFormat df = new DecimalFormat("0.00");

   final String goals= "GOALS";
   String name, gender, level, fitnessLevel;
   int age, workoutFrequency, height;
   double heightInMetres, weight, bodyMassIndex;

   public UserProfile() {
   } //Default constructor

   public UserProfile(String pname, int page, int pheight, double pweight, String pgender, int pworkoutFrequency, String plevel) {
      name=pname;
      age=page;
      height=pheight;
      weight=pweight;
      gender=pgender;
      workoutFrequency=pworkoutFrequency;
      level=plevel;
   } //Alternate constructor

   public void readAllDetails() {
      System.out.print("Please enter your name: ");
      name=keyboard.next();
      System.out.print("Please enter your age: ");
      age=keyboard.nextInt();
      System.out.print("Please enter your height (in cm): ");
      height=keyboard.nextInt();
      System.out.print("Please enter your weight (in kg): ");
      weight=keyboard.nextDouble();
      System.out.print("Please enter your gender (m/f/o): ");
      gender=keyboard.next();
      System.out.print("How many days do you workout per week (Enter a value between 1 and 7): ");
      workoutFrequency=keyboard.nextInt();
      System.out.print("Are you a beginner, intermediate or advanced (b/i/a): ");
      level=keyboard.next();
   } //printAllDetails

   public double calculateBodyMassIndex() {
      heightInMetres=(double) height/100;
      bodyMassIndex= (weight/ heightInMetres);
      return bodyMassIndex;
   } //calculateBodyMassIndex

   public String calculateFitnessLevel(int pworkoutFrequency) {
      String message;
      if (pworkoutFrequency > 3) {
         message="fit";
      } //if
      else
      {
         message= "unfit";
      } //else
      return message;
   } //calculateFitnessLevel

   public void calculateWorkoutPlan() {
      System.out.println("Do you want to lose weight (y/n): ");
      System.out.println("Do you want to build muscle (y/n): ");
      System.out.println("Do you want to tone up (y/n): ");
   } //calculateWorkoutPlan





}//class
