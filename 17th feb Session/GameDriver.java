import java.util.*;
public class GameDriver{
    private static String getComputerChoice() {
        int choice = (int)(Math.random()*3);
        return (choice == 0) ? "rock" :( (choice == 1) ? "paper" : "scissor");
    }

    private static String displayWinner(String userChoice, String computerChoice) {
        if(userChoice.equals(computerChoice)) return "It's a tie! U Must Play Again!";

        if((userChoice.equals("rock") && computerChoice.equals("scissor"))  || 
           (userChoice.equals("scissors") && computerChoice.equals("paper")) || 
           (userChoice.equals("paper") && computerChoice.equals("rock")))
            return "You won!\nYour Choice - "+userChoice+"  Computer's Choice - "+computerChoice;
        return "You lost!\nYour Choice - "+userChoice+"  Computer's Choice - "+computerChoice;
    }

    private static boolean isValidChoice(String str){
        return (!str.equals("rock") && !str.equals("paper") && !str.equals("scissor"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter your Choice ");
            String userChoice = scanner.next();
            if(isValidChoice(userChoice))
                System.out.println("Entered Invalid Choice");
            else{
                String computerChoice = getComputerChoice();
                System.out.println(displayWinner(userChoice,computerChoice));
            }
            System.out.println("you want to PlayAgain!\nEnter Y to PlayAgain else Q");
            String choice = scanner.next();
            if(choice.equals("Q")) break;
        }
    

    }
    

    
}