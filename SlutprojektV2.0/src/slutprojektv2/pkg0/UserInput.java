/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slutprojektv2.pkg0;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author Arvid Kellström
 */
public class UserInput {
     public String convertName() {

        String name = showInputDialog("Skriv in ett namn");

        String[] names = name.split(" ");
        String firstName = names[0];
        String lastName = names[1];
        String firstNameFLetter = firstName.substring(0, 1);
        String firstNameRemainder = firstName.substring(1);
        String lastNameFLetter = lastName.substring(0, 1);
        String lastNameRemainder = lastName.substring(1);
        name = firstNameFLetter.toUpperCase() + firstNameRemainder.toLowerCase() + " " + lastNameFLetter.toUpperCase() + lastNameRemainder.toLowerCase();

        return name;

    }
/**
 * asks the user to enter a year and returns it
 * @return year that is entered 
 */
    public int convertYear() {
        int year = Integer.parseInt(showInputDialog("Skriv in ett år"));

        return year;

    }
/**
 * asks the user to enter a reg and convert that reg so it is correct. Exemple converts "abc123" to "ABC123"
 * @return a converted version of String reg
 */
    public String convertReg() {
        String reg = showInputDialog("Skriv in reg");

        String fhalf = reg.substring(0, 1) + reg.substring(1, 2) + reg.substring(2, 3);
        String numbers = reg.substring(3, 4) + reg.substring(4, 5);
        String last = reg.substring(5, 6);
        if (fhalf.matches("[a-zA-Z]+") == true && numbers.matches("[0-9]+") == true && last.matches("[a-zA-Z0-9]*") == true) {
            reg = fhalf.toUpperCase() + numbers + last.toUpperCase();
        }
        return reg;
    }
/**
 * asks the user to enter a Model and convert that Model so it is correct. Exemple converts "volVo" to "Volvo"
 * @return a converted version of String model
 */
    public String convertModel() {
        String model = showInputDialog("Skriv in modell");

        String fLetter = model.substring(0, 1);
        String remainder = model.substring(1);
        model = fLetter.toUpperCase() + remainder.toLowerCase();
        return model;

    }
/**
 * Generates a random Date 
 * @return the random Date
 */
    public  String convertDate() {
        Format f = new SimpleDateFormat("yyyy/dd/MM");
        String date = f.format(new Date());
        return date;

    }
/**
 * Generates a random millage between 1500 and 45000
 * @return the random millage
 */
    public int convertMillage() {
        int millage;
        int min = 1500;
        int max = 45000;
        int num = (int) (Math.random() * ((max - min) + 1)) + min;

        millage = num;

        return millage;

    }
/**
 * pick one of three diffrent Strings depending the what the millage is and returns it. 
 * @param millage the randomly generated millage between 1500 and 4500
 * @return that String service
 */
    public String convertService(int millage) {
        String service;
        String serviceAlternertive;

        if (millage > 500 && millage < 8000) {
            serviceAlternertive = "Liten Service";
        } else if (millage > 8001 && millage < 20000) {
            serviceAlternertive = "Medium Service";
        } else {

            serviceAlternertive = "Stor Service";

        }

        service = serviceAlternertive;

        return service;
    }
/**
 * asks the user to enter a licens plate that the user wants to search and convert that license plate so it is correct. Exemple converts "abc123" to "ABC123"
 * @return a converted version of String search
 */
    public String convertSearch() {
        String search = showInputDialog("Skriv in ett reg att söka");

        String fhalf = search.substring(0, 1) + search.substring(1, 2) + search.substring(2, 3);
        String numbers = search.substring(3, 4) + search.substring(4, 5);
        String last = search.substring(5, 6);
        if (fhalf.matches("[a-zA-Z]+") == true && numbers.matches("[0-9]+") == true && last.matches("[a-zA-Z0-9]*") == true) {
            search = fhalf.toUpperCase() + numbers + last.toUpperCase();

        }
        return search;
    }
}
