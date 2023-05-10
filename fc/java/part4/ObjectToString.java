package fc.java.part4;

import fc.java.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board board = new Board();
        board.setTitle("hello");
        System.out.println(board.toString());
        System.out.println(board.getTitle());
    }
}
