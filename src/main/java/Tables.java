public class Tables {
    public String getSmallMultiplicationTable() {
        StringBuilder response = new StringBuilder();
        //adds to the end of an existing string instead of recreating a new one, response += response

        for (int i = 1; i <=5; i++){
          //  response += i + " | " + (i*2) + " | " +(i*3) + " | " + (i*4) + " | " + (i*5) + " | ";
            for(int j = 1; j <=5; j++) {

                response.append(String.format("%5s", (i*j) + " |")); //format (for 5 spaces, formula)
            }
            response.append("\n");
        }
        return response.toString();
    }

    public String getLargeMultiplicationTable() {
        //changed end expression to 10 or last position on each row
        StringBuilder response = new StringBuilder();
        for (int i = 1; i <=10; i++){
            for(int j = 1; j <=10; j++) {

                response.append(String.format("%5s", (i*j) + " |"));
            }
            response.append("\n");
        }
        return response.toString();
    }

    public String getMultiplicationTable(int tableSize) {
        StringBuilder response = new StringBuilder();
        for (int i = 1; i <=20; i++){
            for(int j = 1; j <=20; j++) {

                response.append(String.format("%5s", (i*j) + " |"));
            }
            response.append("\n");
        }
        return response.toString();
    }
}
