package Lab3;

import java.util.Objects;

public class Pawn extends ChessPiece {
    private boolean hasBeenPromoted;
    ChessPiece newPiece;

    public Pawn(int value){
        super(value);
        this.hasBeenPromoted = false;
    }

    public void promote(ChessPiece newPiece){
        if(!this.equals(newPiece) && newPiece.getValue() != 1000 && this.hasBeenPromoted == false ){
            this.setHasBeenPromoted(true);
            this.setValue(newPiece.getValue());
            this.newPiece = newPiece;
            System.out.println("Promoted to " + newPiece);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pawn pawn = (Pawn) o;
        return hasBeenPromoted == pawn.hasBeenPromoted &&
                newPiece.equals(pawn.newPiece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasBeenPromoted, newPiece);
    }


    public boolean isHasBeenPromoted() {
        return hasBeenPromoted;
    }

    public void setHasBeenPromoted(boolean hasBeenPromoted) {
        this.hasBeenPromoted = hasBeenPromoted;
    }


    @Override
    public String toString() {
        return "Pawn: value " + super.getValue();
    }

    @Override
    public String move() {
        return "forward 1";
    }


}
