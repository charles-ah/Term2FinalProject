import java.util.*;

public class Board{

    private String[][] board;
    private String[][] boardT;  //board tranposed
    private static final int size = 6;
    private static int emptyTilesCount = size * size;

    public Board(){
	//initialize the board
	board = new String[size][size];
	boardT = new String[size][size];
	for(int i = 0; i < size; i++){
	    for(int j = 0; j < size; j++){
		board[i][j] = " ";
		boardT[i][j] = " ";
	    }
	}
    }

    public boolean add(int col, String marker){
	//attempt to add the piece to the column specified
	//return true if successful, otherwise false
	String[] column = board[col];
	int i;
	for(i = 0; i < column.length && !(column[i].equals(" ")); i++);
	if (i >= column.length){
	    return false;
	}else{
	    column[i] = marker;
	    board[col] = column;
	    boardT[i][col] = marker;
	    emptyTilesCount--;
	    return true;
	}
    }

    public void remove(int col){
	//to be implemented for the AI, remove the highest piece in the column
	String[] column = board[col];
	int i;
	for(i = size - 1; i >= 0 && column[i].equals(" "); i--);
	if (i >= 0){
	    column[i] = " ";
	    board[col] = column;
	    boardT[i][col] = " ";
	    emptyTilesCount++;
	}
    }

    private String[][] tranposeArray(){
	String[][] copy = new String[size][size];
	for(int i = 0; i < size; i++){
	    for(int j = 0; j < size; j++){
		copy[j][i] = board[i][j];
	    }
	}
	return copy;
    }
    public String checkBoard(int col){
	//check if a player has won or if there is a draw
	//return an empty string if nothing interesting
	//return the marker of the winning player if someone won
	//return "draw" if no one won
	String[] column = board[col];
	int i;
	for(i = size - 1; i >= 0 && column[i].equals(" "); i--);
	System.out.println("" + i);
	int count = 0;
	for(int j = i; j < size && column[i].equals(column[j]); j++, count++);
	if (count == 4){
	    return column[i];
	}
	count = 0;
	for(int j = i; j > -1 && column[i].equals(column[j]); j--, count++);
	if (count == 4){
	    return column[i];
	}
	String[] row = boardT[i];
	count = 0;
	for(int j = i; j < size && row[col].equals(row[j]); j++, count++);
	if (count == 4){
	    return row[col];
	}
	count = 0;
	for(int j = i; j > -1 && row[col].equals(row[j]); j--, count++);
	if (count == 4){
	    return row[col];
	}
	if (emptyTilesCount == 0){
	    return "draw";
	}
	return "";
    }

    public String toString(){
	//return the string representation of the board
        for(int i = size - 1; i >= 0; i--){
	    System.out.println(Arrays.toString(boardT[i]));
	}
	String[][] copy = tranposeArray();
	String ans = "|";
	for(int i = size - 1; i >= 0; i--){
	    for(int j = 0; j < size; j++){
		ans += copy[i][j];
		ans += "|";
	    }
	    ans += "\n";
	    if (i > 0){
		ans += "|";
	    }
	}
	return ans;
    }
}
