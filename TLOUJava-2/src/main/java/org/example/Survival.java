package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Survival {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<String> survivalBag = new ArrayList<>();
        Integer health = 100;
        String survive = "Kill the infected";
        System.out.println("Uh oh, there's been an outbreak of a 'zombie fungus.' The mutated form of cordyceps fungus has spread and many have been infected!");
        System.out.println("Your job is to survive and collect items to kill those affected");

        while (!survive.equals("give up")){
            System.out.println("What do you want to do? [collect] supplies, [fight] infected, get [health] up, or [give up].");
            System.out.print("> ");
            survive = in.nextLine();
            switch (survive) {
                case "collect":
                    System.out.println("There's [molotov cocktail], [ammunition], [bottles], [shotgun], [health kit], and [bread] to collect. What do you wanna add to your survival bag?");
                    System.out.print("> ");
                    survivalBag.add(in.nextLine());
                    System.out.println("Do you wanna see what's in your bag currently? [yes] or [no]");
                    System.out.print("> ");
                    survive = in.nextLine();
                    if (survive.equals("yes")){
                        System.out.println("Survival Bag:" + survivalBag);
                        System.out.println("Do you want to remove anything from you're bag? [yes] or [no]");
                        System.out.print("> ");
                        survive = in.nextLine();
                        if (survive.equals("yes")){
                            System.out.println("What do you want to remove:" + survivalBag);
                            System.out.print("> ");
                            survivalBag.remove(in.nextLine());
                            continue;
                        }
                    }
                    else{
                        continue;
                    }
                case "fight":
                    System.out.println("You're up against more of the fungus zombies, do you want to attack? [yes] or [no]");
                    System.out.print("> ");
                    survive = in.nextLine();
                    if (survive.equals("yes")){
                        health -= 20;
                        System.out.println("You defeated them but your health went down by 20!");
                        continue;
                    }else{
                        continue;
                    }

                case "health":
                    System.out.println("Current Health:" + health);
                    System.out.println("Looks like you need to get your health up! How do you want to heal: [medical kit] or [food]?");
                    System.out.print("> ");
                    survive = in.nextLine();

                    while (health < 100) {
                        if (survive.equals("medical kit")){
                            health += 10;
                            System.out.println("You're health went up by 10!");
                            break;
                        };
                        if (survive.equals("food")){
                            health += 5;
                            System.out.println("You're health went up by 5!");
                            break;
                        };
                    }
                    if (health == 0) {
                        System.out.print("You're dead");
                    }

                case "give up":
                    break;
                default:
                    System.out.println("Choose one or join the infected.");
                    break;
            }

        }
    }

}