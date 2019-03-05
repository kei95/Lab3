package Lab3;

public class Knight extends ChessPiece {

    public Knight(int value){
        super(value);
    }

    @Override
    public String toString() {
        return "Knight: value " + super.getValue();
    }

    @Override
    public String move() {

        return "like an L";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
