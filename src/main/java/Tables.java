public class Tables {
    public String getSmallMultiplicationTable() {
        StringBuilder smallMultiplication = new StringBuilder();
        for (int colIndex = 1; colIndex < 6; colIndex++) {
            String row = "";
            for (int rowIndex = 1; rowIndex < 6; rowIndex++) {
                int value = rowIndex * colIndex;
                row += String.format("%3d |", value);
            }
            row += "\n";
            StringBuilder.append(row);
        }
        return StringBuilder.toString();
    }







    public String getLargeMultiplicationTable() {
        return null;
    }

    public String getMultiplicationTable(int tableSize) {
        return null;
    }
}
