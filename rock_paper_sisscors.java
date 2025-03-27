import java.util.Random;
import java.util.Scanner;
unum Choice { ROCK, PAPER, SCISSORS }
Public class Main
{
    public static void main(String[] args) }
    while (true)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter rock, paper, or scissors (or 'exit' to quit):");
        String userInput = scanner.nextLine().toUpperCase();
        if (userInput == "EXIT") break; //stop game

        Choice userChoice = Choice.valueOf(userInput): //convert a random to a value of enum
        System.out.println("computer choice: " + computerChoice);

        if(userChoice == computerChoice)
        {
            System.out.println("It's a tie!");

        }
        else if ((userChoice == Choice.ROCK && computerChoice == Choice.SCISSORS) ||
                (userChoice == Choice.PAPER && computerChoice == Choice.ROCK) ||
                (userChoice == Choice.SCISSORS && computerChoice == Choice.PAPER) 
                {
                    System.out.println("You win");
                                }
                            
                                else
                                {
                                    System.out.println("You lose!");


                                }
                                int comchoice = random.nextInt(bound...3); // rock:0, paper:1, scissors:2

                                HashMap<String, Integer> = new HashMap<String, Integer>();
                                convertChoices.put("ROCK",: 0);
                                convertChoices.put("PAPER", :0);
                                convertChoices.put("SCISSORS", :0);

                                int uChoice = convertChoices.get.(userInput);
                                                                {

                                }
                                
                            }                
    
                        }
                    }
