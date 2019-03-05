package Lab3;

public class Rook extends ChessPiece {

    public Rook(int value){
        super(value);

    }

    @Override
    public String toString() {
        return move();
    }

    @Override
    public String move() {
       return "horizontally or vertically";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
