package Lab3;

public class Rook extends ChessPiece {

    public Rook(int value){
        super(value);

    }

    @Override
    public String toString() {
        return "Rook: value " + super.getValue();
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
