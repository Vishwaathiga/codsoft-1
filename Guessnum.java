import java.util.*;
public class Guessnum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random random = new Random();
int rounds = 0;
int wins = 0;
boolean playagain=true;
System.out.println("WELCOME TO THE GAME - 'GUESS THE NUMBER!'");
while(playagain){
rounds++;
int guessnum = random.nextInt(100) + 1;
int attempts = 0;
int maxattempts = 10;
boolean Corguess = false;
System.out.println("\nRound " + rounds + ": Guess a number between 1 and 100.");
System.out.println("You have " + maxattempts + " attempts.");
while (attempts < maxattempts && !Corguess) {
System.out.print("Guess number: ");
int userguess = sc.nextInt();
attempts++;
if (userguess == guessnum) {
System.out.println("Congratulations genius! You guessed the correct number in " + attempts + " attempts.");
Corguess = true;
wins++;
}
else if (userguess < guessnum) {
System.out.println("Number is low.You are almost,try again!");
} 
else {
System.out.println("Number is high.You are almost,try again!");
}
}
if (!Corguess) {
System.out.println("Sorry, you've used all your attempts. The correct number was " + guessnum + ".");
}
System.out.print(" Do you want to play again?->(yes/no): ");
String playAgainRes = sc.next().toLowerCase();
if (!playAgainRes.equals("yes")) {
playagain = false;
}
}
System.out.println("\nGame Over!");
System.out.println("Total rounds played: " + rounds);
System.out.println("Total rounds won: " + wins);
System.out.println("Thank you for playing!");
sc.close();
}
}