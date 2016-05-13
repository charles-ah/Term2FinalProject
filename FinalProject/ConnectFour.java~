import java.util.*;
public class ConnectFour{

    private Board board;

    public ConnectFour(){
	//initalize the game
	board  = new Board();
	
    }


	//loop until we have recieved a proper input
	//possible inputs are found inside the array
    public static String getUserInput(String[] possibleInputs)
    {
	String ret = "";
	Scanner s = new Scanner(System.in);
	int i =0;
	if(s.next()=="exit")
	    {
		return "Player forfeits";
	    }
	while(s.hasNext())
	    {
		ret = s.next(possibleInputs[i]);
		i++;
	    }
	if(ret=="")
	    {
		System.out.println("Not a valid input fool");
		
	    } 
	else
	    {
		return ret;
	    }

    }
    

	//this is the main game engine
	//call getUserInput to figure who goes first
	//call getUserInput to figure out the marker for player 1
	//call getUserInput to figure out the marker for player 2
	//main while loop, loop while not gameover
	//display board
	//call getUserInput to recieve user move
	//check if valid move and update board
	//if valid move call getUserInput for second player
	//otherwise repeat until move is valid
    public static void main(String[]args)
    {
	String[] possibleInputs = {"1","2","3","4"}; 
	if(true)//Math.random()*2==0)
	    {
		System.out.println("You start!");
		String input  = getUserInput(possibleInputs);
	    }
	else
	    {
		System.out.println("Computer starts!");
	    }
    }
}
