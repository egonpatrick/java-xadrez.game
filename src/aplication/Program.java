package aplication;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch chematch = new ChessMatch();
		
		UI.printBoard(chematch.getPieces());
		

	}

}
