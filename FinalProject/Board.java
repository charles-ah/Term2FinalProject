public class Board{

    private String[][] board;

    public Board(){
	//initialize the board
	board = new String[6][6];
	for(int i = 0; i < 6; i++){
	    for(int j = 0; j < 6; j++){
		board[i][j] = "";
	    }
	}
    }

    public boolean add(int col, String marker){
	//attempt to add the piece to the column specified
	//return true if successful, otherwise false
	String[] column = board[col];
	int i;
	for(i = 0; i < column.length && !(column[i].equals("")); i++);
	if (i >= column.length){
	    return false;
	}else{
	    column[i] = marker;
	    board[col] = column;
	    return true;
	}
    }

    public void remove(int col){
	//to be implemented for the AI, remove the highest piece in the column
    }
    
    public String checkBoard(){
	//check if a player has won or if there is a draw
	//return an empty string if nothing interesting
	//return the marker of the winning player if someone won
	//return "draw" if no one won
	return "";
    }

    public String toString(){
	//return the string representation of the board
	return "";
    }

    public static void main(String[]args){
	Board a = new Board();
    }
}
