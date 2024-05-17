import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class CreationStory {
    public  static void main(String[]args){
        Scanner myObject = new Scanner(System.in);
        while(true) {
            System.out.println("The creation story according Genesis as recorded began this way : ");
            System.out.println("Do you want to know what happened on the first day?  Y / N \n");
            String reply1 = myObject.nextLine();
            if (reply1.equals("y")) {
                System.out.println(" In Genesis 1:1-3 : God created the Heavens and Earth and the earth was without\n" +
                        " form and void and darkness was upon the surface of the deep.\n " +
                        "And said said let there be light and there was light ");
            } else {
                System.out.println("Well, that`s fine.\n");

            }
            System.out.print("* Can we continue? Yes/ NO \n");
            String reply2 = myObject.nextLine();
            if (reply2.equals("yes")) {
                System.out.println("So God made the firmament(sky) and divided the waters which were\n" +
                        " under the firmament from the waters which were above the firmament: \n" +
                        "and it was so.And the evening and the morning were the second day \n" +
                        ". Ref. [Genesis 1:7-8]\n");
            } else {
                System.out.print("oh really !!\n");
            }


            System.out.print("* What do you think happened on the third day? \n" +
                    "A. God gathered the waters and created dry lands which he commanded to brought forth plants Ref.[Genesis 1:9-13] \n" +
                    "B. God created cars.  Ref.[Genesis 1:9-13]\n" +
                    "C. God cooked indomie for Adam and Eve. Ref.[Genesis 1:9-13]\n");
            String reply3 = myObject.nextLine();
            if (reply3.equals("A")) {
                System.out.print("You are right\n");
            } else if (reply3.equals("B")) {
                System.out.print("No, not right!!\n");
            } else {
                System.out.println("Nope, go find out\n ");
            }
            System.out.println("* DAY 4 : Enter four to proceed :");
            int OnDay_4 = myObject.nextInt();

            System.out.println(" So after God had created the dried grounds , He then with his mighty powers commanded\n " +
                    "and the sun,moon and stars came to being . And this happened on the fourth day Ref.[Genesis 1:14-20]\n");

            System.out.println("* DAY 5 : press 5: :\n");
            int OnDay_5 = myObject.nextInt();

            System.out.println("God created  birds ,flies , fish and other living creatures \n" +
                    "that moves in the waters Ref.[Genesis 1:20-22]");

            System.out.println("* DAY 6 : press 6: \n");
            int OnDay_6 = myObject.nextInt();
            System.out.println("And on the 6th day , God created man in His own likelihood \n" +
                               "to take dominion over the things of the universe. Ref.[Genesis 1:26-27]");

            System.out.println("* DAY 7 : press 7: \n");
            int OnDay_7 = myObject.nextInt();
            System.out.println("And on the 7th day which happened to be the last day according to the narrative \n" +
                               " of creation, God rested from all His work and sanctified and made it Holy.\n " +
                               ".Ref.[Genesis 2:2-3]\n\n");

            System.out.println("END OF THE STORY!!!\n\n");



            System.out.println(" /\\_/\\");
            System.out.println(" ( o.o )");
            System.out.println(" >  ^ <");
            System.out.println("  || ||");
            System.out.println("  || ||");
            System.out.println("0000 00000");
            System.out.println("**** *****\n\n");


             break;

        }




    }
}

