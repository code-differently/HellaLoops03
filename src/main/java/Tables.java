public class Tables {
    public String getSmallMultiplicationTable() {
        String smallMultiplicationTable = "";

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                smallMultiplicationTable += String.format("%3d |", (i * j));
            }
            smallMultiplicationTable += "\n";
        }
        return smallMultiplicationTable;
    }

    public String getLargeMultiplicationTable() {
        String largeMultiplicationTable = "";

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

                largeMultiplicationTable += String.format("%3d |", (i * j));
            }
            largeMultiplicationTable += "\n";
        }
        return largeMultiplicationTable;
    }

    public String getMultiplicationTable(int tableSize) {
        String largeMultiplicationTable = "";

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {

                largeMultiplicationTable += String.format("%3d |", (i * j));
            }
            largeMultiplicationTable += "\n";
        }
        return largeMultiplicationTable;
    }

}

