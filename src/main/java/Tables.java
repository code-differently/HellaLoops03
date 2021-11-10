public class Tables {
    public String getSmallMultiplicationTable() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int colIndex=1; colIndex<6; colIndex++){
            String row ="";
            for(int rowIndex=1; rowIndex < 6; rowIndex++){
                int value = rowIndex *colIndex;
                row += String.format("%3d |", value);
            }
            row+="\n";
            stringBuilder.append(row);
        }
        return stringBuilder.toString();
    }


    public String getLargeMultiplicationTable() {
            StringBuilder stringBuilder = new StringBuilder();
            for(int colIndex=1; colIndex<11; colIndex++){
                String row ="";
                for(int rowIndex=1; rowIndex < 11; rowIndex++){
                    int value = rowIndex *colIndex;
                    row += String.format("%3d |", value);
                }
                row+="\n";
                stringBuilder.append(row);
            }
            return stringBuilder.toString();
        }


    public String getMultiplicationTable(int tableSize) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int colIndex=1; colIndex < 21; colIndex++){
            String row ="";
            for(int rowIndex=1; rowIndex < 21; rowIndex++){
                int value = rowIndex *colIndex;
                row += String.format("%3d |", value);
            }
            row+="\n";
            stringBuilder.append(row);
        }
        return stringBuilder.toString();
    }


    }
