public class Tables {
    public String getSmallMultiplicationTable() {
        int tableSize = 5;
        String result = "";


        for (int i = 1; i <= tableSize; i++) {

            result += "  \n ";

            for (int j = 1; j <= tableSize; j++) {

                result +=i*j +" |  " ;
            }

            }


    return result;
}

    public String getLargeMultiplicationTable() {

            int tableSize = 10;
            String result = "";


            for (int i = 1; i <= tableSize; i++) {

                result += "  \n ";

                for (int j = 1; j <= tableSize; j++) {

                    result += i * j + " |  ";
                }

            }


            return result;
        }

    public String getMultiplicationTable(int tableSize) {
        String result = " ";

        for (int i = 1; i <= tableSize; i++) {

            result += "  \n  ";

            for (int j = 1; j <= tableSize; j++) {

                result += i * j + "  |   ";
            }

        }


        return result;

    }
}
