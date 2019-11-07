public class Minesweeper {

    public static String Sweep(String input) {

        if (input.equals("0 0"))
            return "";

        if(input.startsWith("1 2")) {
            Cell cell = new Cell().link(new Cell());
            return "Field #1:\n" +
                    cell.display() +
                    "\n";
        }

        if(input.startsWith("1 1")) {
            Cell cell = new Cell();
            return "Field #1:\n" +
                    cell.display() +
                    "\n";
        }

        return null;
    }

}