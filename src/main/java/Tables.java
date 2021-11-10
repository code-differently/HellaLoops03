public class Tables {
    public String getSmallMultiplicationTable() {
        StringBuilder smallMultiTable = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                smallMultiTable.append(i * j + "  |  ");
                }smallMultiTable.append(System.lineSeparator());
        }return smallMultiTable.toString();
    }


    public String getLargeMultiplicationTable(){
    StringBuilder smallMultiTable = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
        for (int j = 1; j <= 10; j++) {
            smallMultiTable.append(i * j + "  |  ");
        }smallMultiTable.append(System.lineSeparator());
    }return smallMultiTable.toString();
}

    public String getMultiplicationTable(int tableSize) {
        StringBuilder smallMultiTable = new StringBuilder();
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                smallMultiTable.append(i * j + "  |  ");
            }smallMultiTable.append(System.lineSeparator());
        }return smallMultiTable.toString();
    }

}
