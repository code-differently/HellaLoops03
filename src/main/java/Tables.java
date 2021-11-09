public class Tables {
    public String getSmallMultiplicationTable() {
        StringBuilder multiTable = new StringBuilder();


        for (int colum = 1; colum< 5; colum++) {

            multiTable.append(num);
            for (int row = 0; row < 6; row++) {
                int counter= row * colum;
                String num = String.format(" %d |",counter ++  );
            }
        }
            return multiTable .toString();
        }





    public String getLargeMultiplicationTable() {

        return null;
    }

    public String getMultiplicationTable(int tableSize) {
        return null;
    }
}


