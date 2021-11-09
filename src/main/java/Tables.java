public class Tables {
    public String getSmallMultiplicationTable() {
       StringBuilder stringBuilder = new StringBuilder();
       for (int colIndex = 1; colIndex<6; colIndex++){
           String row ="";
           for (int rowIndex = 1; rowIndex <6; rowIndex++){
               row += String.format( " %d |", rowIndex);
           }
          row += "/n";
           stringBuilder.append(row);
       }
        return stringBuilder.toString();
    }

    public String getLargeMultiplicationTable() {
        return null;
    }

    public String getMultiplicationTable(int tableSize) {
        return null;
    }
}
