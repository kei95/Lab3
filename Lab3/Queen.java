package Lab3;

public class Queen extends ChessPiece {

    public Queen(int value){
        super(value);
    }

    @Override
    public String toString() {
        return move();
    }

    @Override
    public String move() {
        return "like a bishop or a rook";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
