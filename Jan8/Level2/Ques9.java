package Jan8.Level2;

/*Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
Hint =>
The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
Create a Method to find the Computer Choice using the Math.random
Create a Method to find the winner between the user and the computer
Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
Create a Method to display the results of every game and also display the average and percentage wins
In the main take user input for the number of games and call methods to display results
*/

import java.util.*;

public class Ques9 {
    static String computerChoice() {
        int n=(int)(Math.random()*3);
        if(n==0) return "Rock";
        if(n==1) return "Paper";
        return "Scissors";
    }
    static String findWinner(String user,String comp){
        if(user.equalsIgnoreCase(comp)) return "Draw";
        if((user.equalsIgnoreCase("Rock") && comp.equalsIgnoreCase("Scissors")) || (user.equalsIgnoreCase("Paper") && comp.equalsIgnoreCase("Rock")) || (user.equalsIgnoreCase("Scissors") && comp.equalsIgnoreCase("Paper"))) return "User";
        return "Computer";
    }
    static void display(int games,int userWin,int compWin){
        double userPer=(userWin*100.0)/games;
        double compPer=(compWin*100.0)/games;
        System.out.println("\nPlayer\tWins\tPercentage");
        System.out.println("--------------------------");
        System.out.println("User\t"+userWin+"\t"+userPer+"%");
        System.out.println("Computer "+compWin+"\t"+compPer+"%");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games=sc.nextInt();
        sc.nextLine();
        int userWin=0,compWin=0;
        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("---------------------------------------");
        for(int i=1;i<=games;i++){
            System.out.print("Enter choice (Rock/Paper/Scissors): ");
            String user=sc.nextLine();
            String comp=computerChoice();
            String winner = findWinner(user,comp);
            if(winner.equals("User")) userWin++;
            else if(winner.equals("Computer")) compWin++;
            System.out.println(i+"\t"+user+"\t"+comp+"\t\t"+winner);
        }
        display(games,userWin,compWin);
    }
}
