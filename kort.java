/* This program detrimies if you are more like kamala or trump, i have no political afilliations */
import java.util.Scanner;

public class kort {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      
      int kPoint = 0;
      int tPoint = 0;
      int threshold = 15;
      
      while (kPoint <= threshold && tPoint <= threshold) {
        System.out.println("Do you think the 2020 election was rigged?"); 
        String q1 = scnr.next();
        if (q1.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++;
        }

        System.out.println("Do you think Hatians eat dogs");
        String q2 = scnr.next();
        if (q2.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++; 
        }

        System.out.println("Do you like girls?");
        String q3 = scnr.next();
        if (q3.equalsIgnoreCase("Yes"))  
            tPoint++;
        else {
        tPoint++;
        }

        System.out.println("Are you non challant?");
        String q4 = scnr.next();
        if (q4.equalsIgnoreCase("Yes")) 
            tPoint--;
        else {
        kPoint--;
        }
        

        System.out.println("Do people mispronounce your name?");
        String q5 = scnr.next();
        if (q5.equalsIgnoreCase("Yes")) 
            kPoint++;
        else {
        tPoint++;
        }

        System.out.println("Are you a puppet for the lizzard people (Aka illuminati)?");
        String q6 = scnr.next();
        if (q6.equalsIgnoreCase("Yes")) 
            kPoint++; 
        else {
        tPoint++;
        }

        System.out.println("Are you racist?");
        String q7 = scnr.next();
        if (q7.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++;
        }

        System.out.println("Do you  call twitter X?");
        String q8 = scnr.next();
        if (q8.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++;
        }

        System.out.println("Do you support gays?");
        String q9 = scnr.next();
        if (q9.equalsIgnoreCase("Yes")) 
            kPoint++;
        else {
        tPoint++;
        }
        System.out.println("Are you republican");
        String q13 = scnr.next();
        if (q13.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++;
        }

        System.out.println("Do you love your guns?");
        String q14 = scnr.next();
        if (q14.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++;
        }

        System.out.println("Have you been shot at this year?");
        String q15 = scnr.next();
        if (q15.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;

     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
                
        }
        

        

        System.out.println("Were you undemocratically nominated by your polictal party?");
        String q16 = scnr.next();
        if (q16.equalsIgnoreCase("Yes")) 
            kPoint++;
        else {
        tPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Do you love your country?");
        String q17 = scnr.next();
        if (q17.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Do you love your country no matter what?");

        String q18 = scnr.next();
        if (q18.equalsIgnoreCase("Yes"))  {
            kPoint--;
            tPoint--;
        }
            if (kPoint > 15) {
                System.out.println("You're KAMALA");
                System.out.println("Filthy anti American!");
                break;
         }
            else if (tPoint > 15){
                    System.out.println("You are TRUMP!");
                    System.out.println("You love your country no matter what!");
                    break;
            }

        System.out.println("Do you back the blue");
        String q19 = scnr.next();
        if (q19.equalsIgnoreCase("Yes")) {
            kPoint++;
            tPoint++;
        }

            if (kPoint > 15) {
                System.out.println("You're KAMALA");
                System.out.println("Filthy anti American!");
                break;
         }
            else if (tPoint > 15){
                    System.out.println("You are TRUMP!");
                    System.out.println("You love your country no matter what!");
                    break;
            }

        System.out.println("Do you support BLM?");
        String q20 = scnr.next();
        if (q20.equalsIgnoreCase("Yes")) 
            kPoint++;
        else {
        tPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Are you a treehugger?");
        String q21 = scnr.next();
        if (q21.equalsIgnoreCase("Yes")) 
            kPoint++;
        else {
        tPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }


        System.out.println("Do you own a ford F150");
        String q22 = scnr.next();
        if (q22.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Are you a communist?");
        String q23 = scnr.next();
        if (q23.equalsIgnoreCase("Yes")) 
            kPoint++;
        else {
        tPoint++;
        }

        System.out.println("Are you a proud christian?");
        String q24 = scnr.next();
        if (q24.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++;
        }

        System.out.println("Filthy liberal?");
        String q25 = scnr.next();
        if (q25.equalsIgnoreCase("Yes")) 
            kPoint++;
        else {
        tPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Do you think the government should have more power?");
        String q26 = scnr.next();
        if (q26.equalsIgnoreCase("Yes")) 
            kPoint++;
        else {
        tPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Are you a snowflake?!");
        String q27 = scnr.next();
        if (q27.equalsIgnoreCase("Yes")) 
            kPoint++;
        else {
        tPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Do you think black people should vote?");
        String q28 = scnr.next();
        if (q28.equalsIgnoreCase("Yes")) 
            kPoint++;
        else {
        tPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Do you think labor unions should not exsist");
        String q29 = scnr.next();
        if (q29.equalsIgnoreCase("Yes")) 
            kPoint++;
        else {
        tPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Do you think America is too soft on crime?");
        String q30 = scnr.next();
        if (q30.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++;
        }
        

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Belive the world is flat?");
        String q31 = scnr.next();
        if (q31.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Do you use galaxy gas?");
        String q32 = scnr.next();
        if (q32.equalsIgnoreCase("Yes"))  {
            kPoint++;
            tPoint++;
        }

            if (kPoint > 15) {
                System.out.println("You're KAMALA");
                System.out.println("Filthy anti American!");
                break;
         }
            else if (tPoint > 15){
                    System.out.println("You are TRUMP!");
                    System.out.println("You love your country no matter what!");
                    break;
            }
       

        System.out.println("Do you feel you're mistreated for the type of person you are?");
        String q33 = scnr.next();
        if (q33.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Do you watch talk tauh?");
        String q34 = scnr.next();
        if (q34.equalsIgnoreCase("Yes")) 
            tPoint++;
        else {
        kPoint++;
        }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Did you listen to the brat album");
        String q35 = scnr.next();
        if (q35.equalsIgnoreCase("Yes")) 
            kPoint++;
        else {
        tPoint++;
    }

        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }

        System.out.println("Do you want junkies on our street?");
        String q36 = scnr.next();
        if (q36.equalsIgnoreCase("Yes")) 
            kPoint++;
        else {
        tPoint++;
        }
        if (kPoint > 15) {
            System.out.println("You're KAMALA");
            System.out.println("Filthy anti American!");
            break;
     }
        else if (tPoint > 15){
                System.out.println("You are TRUMP!");
                System.out.println("You love your country no matter what!");
                break;
        }
    
    }
    scnr.close();

     }

     
     }
     
    
      

      
      


   