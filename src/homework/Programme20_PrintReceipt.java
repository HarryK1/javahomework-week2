package homework;

public class Programme20_PrintReceipt {
    public static void main(String[] args) {
        //define the text lines
        String[] lines = {
                "+------------------------+",
                "|                        |",
                "|      CORNER STORE      |",
                "|                        |",
                "|  2015-03-29   04:38PM  |",
                "|                        |",
                "|  Gallons:      10.870  |",
                "| Price/gallon: $ 2.089  |",
                "|                        |",
                "|  Fuel total: $ 22.71   |",
                "|                        |",
                "+------------------------+",


        };

        //Print each line
        for (String line : lines){
            System.out.println(line);
        }
    }
}