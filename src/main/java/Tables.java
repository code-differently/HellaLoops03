public class Tables {
    public String getSmallMultiplicationTable() {
        String multiplicationTable = "";

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                multiplicationTable += String.format("%3d |", (i * j));
            }
            multiplicationTable += "\n";
        }
        return multiplicationTable;
    }

    public String getLargeMultiplicationTable() {
        return null;
    }
    public String getMultiplicationTable(int tableSize) {
        return null;
    }

}

