package Lab3;

import java.util.Objects;

public abstract class ChessPiece {
    private int value;


    public ChessPiece (int value){
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public abstract String move();

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // references

        if (o == null || getClass() != o.getClass()) return false;
        // class names

        ChessPiece that = (ChessPiece) o;

        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

