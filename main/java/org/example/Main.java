package org.example;

import org.example.boardGame.Board;
import org.example.boardGame.Position;
import org.example.chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch(12123123123123);
        UI.printBoard(chessMatch.getPieces());
    }
}