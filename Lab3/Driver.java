package Lab3;

public class Driver {
    public static void main(String[] args) {
        King king = new King(1000);
        Queen queen = new Queen(9);
        Rook rook = new Rook(5);
        Bishop bishop = new Bishop(3);
        Knight knight = new Knight(2);
        Pawn pawn = new Pawn(1);

        System.out.println(pawn);
        System.out.println(king.move());

        pawn.promote(rook);
        pawn.promote(queen);
        System.out.println(pawn.getValue());

    }
}
