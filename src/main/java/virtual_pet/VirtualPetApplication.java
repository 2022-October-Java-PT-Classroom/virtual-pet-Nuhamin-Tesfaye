package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet myPet = new VirtualPet(2,2,2,2);
        Scanner input = new Scanner(System.in);
        System.out.println("The pet status in the initial");
        System.out.println("Hunger is: " + myPet.getHunger());
        System.out.println("Thirst is: " + myPet.getThirst());
        System.out.println("DevelopReaction:" + myPet.getplayPet());
        System.out.println("tiredness is:" + myPet.getcleanPet());
        System.out.println("what do yo want to do for the pet");
        System.out.println("please select 1. To feed the pet");
        System.out.println("please select 2. To give clean water for pet");
        System.out.println("please select 3. To play with pet");
        System.out.println("please select 4. To clean the pet");
        int userSelect = input.nextInt();
        while(userSelect != 5){
            if(userSelect == 1){
                myPet.tick();
                myPet.feedPet();
                System.out.println("Hunger is: " + myPet.getHunger());
                System.out.println("thirst is :" + myPet.getThirst());
                System.out.println("developReaction:" + myPet.getplayPet());
                System.out.println("tiredness is:" + myPet.getcleanPet());
            }
           else if(userSelect==2){
               myPet.tick();
               myPet.waterPet();
               System.out.println("Hunger is: " + myPet.getHunger());
               System.out.println("thirst is : "+ myPet.getThirst());
               System.out.println("developReaction:" + myPet.getplayPet());
                System.out.println("tiredness is:" + myPet.getcleanPet());
            }
           else if(userSelect==3) {
                myPet.tick();
                myPet.playPet();
                System.out.println("Hunger is: " + myPet.getHunger());
                System.out.println(" thirst is :" + myPet.getThirst());
                System.out.println(" developReaction:" + myPet.getplayPet());
                System.out.println("tiredness is:" + myPet.getcleanPet());
            }
            else if(userSelect==4) {
                myPet.tick();
                myPet.cleanPet();
                System.out.println("Hunger is: " + myPet.getHunger());
                System.out.println("thirst is :" + myPet.getThirst());
                System.out.println("developReaction:" + myPet.getplayPet());
                System.out.println("tiredness is:" + myPet.getcleanPet());
            }
            System.out.println("please select 1 choice");
            System.out.println("please select 2 choice");
            System.out.println("please select 3 choice");
            System.out.println("please select 4 choice");
            userSelect = input.nextInt();
        }
    }

}
