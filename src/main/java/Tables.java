public class Tables {
    public String getSmallMultiplicationTable() {

        StringBuilder row = new StringBuilder();

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                int number = i * j;
                row.append(String.format("%5s", number + " |"));
            }

            row.append(System.lineSeparator());
        }

        return row.toString();

    }

    public String getLargeMultiplicationTable() {
        StringBuilder row = new StringBuilder();

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                int number = i * j;
                row.append(String.format("%5s", number + " |"));
            }

            row.append(System.lineSeparator());
        }

        return row.toString();
    }

    public String getMultiplicationTable(int tableSize) {
        StringBuilder row = new StringBuilder();

        for (int i = 1; i <= 20; i++) {

            for (int j = 1; j <= 20; j++) {
                int number = i * j;
                row.append(String.format("%5s", number + " |"));
            }

            row.append(System.lineSeparator());
        }

        return row.toString();
    }
}
