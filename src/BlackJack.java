import java.util.Scanner;

/**
 * Created by Ten-Seng on 7/20/2015.
 */
public class BlackJack {
    static private Deck _deck = new Deck();
    static private Hand _player, _house;
    static private int wins = 0, losses = 0, draws = 0, total = 0;

    static private void PrintHands()
    {
        System.out.println("\nHouse: ");
        _house.PrintHand();

        System.out.println("\nYou: ");
        _player.PrintHand();
    }

    static public void StartGame()
    {
        char play = 'n', action = 'h';
        Scanner input = new Scanner(System.in);
        //do
        do {
            System.out.println("Welcome to the Cranes Hotel and Casino Blackjack\n");
            _deck.Shuffle();
            _player = _deck.Deal();
            _house = _deck.DealHouse();

            PrintHands();


            do {
                System.out.println("\nWould you like to: ");
                System.out.println("(s) Surrender?");
                System.out.println("(h) Hit?");
                System.out.println("(d) Stand?");
                action = input.nextLine().charAt(0);    //get the first character

                switch(action)
                {
                    case 's':       //surrender.  The player loses.
                        System.out.println("\nYou've surrendered!  Sorry game over.");
                        losses++;
                        break;
                    case 'h':       //hit.  Give the player another card.
                        System.out.println("\nYou've selected hit!");
                        _deck.Hit(_player);
                        PrintHands();
                        break;
                    case 'd':       //stand.  Time to see who won.
                        System.out.println("\nYou've selected stand!");
                        int playerScore = _player.GetHandValue();
                        int houseScore = _house.GetHandValue();
                        _house.RevealHand();
                        PrintHands();
                        while (houseScore < 17)
                        {
                            System.out.println("The house will hit: ");
                            _deck.Hit(_house);
                            houseScore = _house.GetHandValue();
                            PrintHands();
                        }
                        if (playerScore == 21 && houseScore == 21)
                        {
                            System.out.println("You both got Blackjack!  It's a draw!");
                            draws++;
                        }
                        else if (playerScore == 21)
                        {
                            System.out.println("Blackjack!  You win!!!");
                            wins++;
                        }
                        else if (playerScore > 21)
                        {
                            System.out.println("You went over 21.  Sorry you lose!");
                            losses++;
                        }
                        else if (houseScore == 21)
                        {
                            System.out.println("The house got Blackjack!  Sorry you lose!");
                            losses++;
                        }
                        else if (21 - playerScore < 21 - houseScore)
                        {
                            System.out.println("You win!");
                            wins++;
                        }
                        else if (playerScore < 21 && houseScore > 21)
                        {
                            System.out.println("You win!");
                            wins++;
                        }
                        else
                        {
                            System.out.println("You lose!");
                            losses++;
                        }
                        break;
                    default:    //invalid entry.  Run the loop again.
                        System.out.println("\nInvalid entry!  Please try again:");
                        action = 'u';
                        break;
                }

            } while (action == 'h' || action == 'u');
            total = wins + losses + draws;

            // put the hands back in the deck
            _deck.PutBackHand(_player);
            _deck.PutBackHand(_house);


            System.out.format("\nTotal wins: %d.  Total losses: %d.  Total draws: %d.  Total games: %d\n", wins, losses, draws, total);
            System.out.print("Would you like to play again?  (y) Yes or (n) No:");
            play = input.nextLine().charAt(0);
        } while (play == 'y');

        System.out.println("Thank you for playing.  See you next time at the Cranes Hotel and Casino Blackjack!");

    }


}
