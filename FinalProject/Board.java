public class Board{

    private String[] board;

    public Board(){
	//initialize the board
    }

    public boolean add(int col, String marker){
	//attempt to add the piece to the column specified
	//return true if successful, otherwise false
    }

    public void remove(int col){
	//to be implemented for the AI, remove the highest piece in the column
    }
    
    public String checkBoard(){
	//check if a player has won or if there is a draw
	//return an empty string if nothing interesting
	//return the marker of the winning player if someone won
	//return "draw" if no one won
    }

    public String toString(){
	//return the string representation of the board
    }
}
