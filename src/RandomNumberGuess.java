import java.util.Scanner;
import java.util.Random;
public class RandomNumberGuess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        int chance = 5;

        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 100");
        int myNumber = getRandomNumber(1, 101);

        for(int i = 1; i<6; i++){
            System.out.println("Take a guess.");
            System.out.println("Chances Remaining " + chance);
            int yourGuess = sc.nextInt();
            chance--;

            if(yourGuess == myNumber){
                System.out.println("Congratulations!! You guessed correctly!");
                if( chance == 5){
                    System.out.println("Your Score: 100");
                }
                else if(chance == 4){
                    System.out.println("Your Score: 80");
                }
                else if(chance == 3){
                    System.out.println("Your Score: 60");
                }
                else if(chance == 2){
                    System.out.println("Your Score: 40");
                }
                else{
                    System.out.println("Your Score: 20");
                }
                break;
            }
            else if(yourGuess < myNumber){
                System.out.println("Your guess is too low!");
            }
            else{
                System.out.println("Your guess is too high!");
            }
            if (i >= 5){
                System.out.println();
                System.out.println("You loose!");
                System.out.println("Nope. The number I was thinking of was " + myNumber + "!");
            }
        }
    }

    public static int getRandomNumber(int min, int max){
        Random random = new Random();
        return random.ints(min,max).findFirst().getAsInt();
    }


}
