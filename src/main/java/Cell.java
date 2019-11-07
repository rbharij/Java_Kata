public class Cell {
    private Cell anotherCell;

    public Cell link(Cell cell) {
        anotherCell = cell;
        return this;
    }

    public String toString() {
        return "0";
    }

    public String display() {
        if(anotherCell == null)
            return "0";

        return this.toString() + anotherCell.toString();

    }
}
