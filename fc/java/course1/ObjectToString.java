package fc.java.course1.part4;

import fc.java.course1.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board board = new Board();
        board.setTitle("hello");
        System.out.println(board.toString());
        System.out.println(board.getTitle());
    }
}
