package by.itacademy;

public class StringInterpreter {
    public static String interpret (String input){
        String output = "Unknown data";
        if(input.length()>0) {
            if (input.matches("\\d{7}")) {
                output = "Telephone number";
            } else if (input.matches(".*@.*")) {
                output = "email";
            } else if (input.matches("[A-Z][a-z]*")) {
                output = "Surname";
            }
        }
        return output;
    }
}
