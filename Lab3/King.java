package Lab3;

public class King extends ChessPiece {

    King(int value){
        super(value);
    }

    @Override
    public String toString() {
        return move();
    }

    @Override
    public String move() {
        return "one square";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
