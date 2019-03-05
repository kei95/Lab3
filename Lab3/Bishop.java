package Lab3;

public class Bishop extends ChessPiece{

    public Bishop(int value){
        super(value);
    }

    @Override
    public String toString() {
        return "Bishop: value " + super.getValue();
    }

    @Override
    public String move() {
        return "diagonally";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
