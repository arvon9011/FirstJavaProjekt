/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slutprojektv2.pkg0;


import java.io.IOException;
import javax.swing.JOptionPane;


/**
 * @version 1.0
 * @author Arvid Kellström
 */
public class ProgramStarter {


    static Workshop ws = new Workshop();

/**
 * starts by calling readCar() method from Workshop class. Asks the user if they want to search for a car or enter a car. If "Enter A Car" is pressed then the 
 * user will be asked to enter some information until they decide to print it to a .txt file. If "Search A Car" is pressed the user will be asked to enter a license plate number
 * and later calls the searchCar(search) method from the Workshop class
 * @param args
 * @throws IOException 
 */
    public static void main(String[] args) throws IOException {
        
        ws.readCar();
        int user = 1;
        while (user == 1){
        Object[] options = {"Search A Car", "Enter A Car", "Quit"};
       
        int choice = JOptionPane.showOptionDialog(null,
                "Would You Like To Enter A Car or Search For A Car",
                "Make A Choice",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                null);

        if (choice == 1) {
            int t = 1;
            while (t == 1) {
                UserInput currentCar = new UserInput();
                String model = currentCar.convertModel();
                String reg = currentCar.convertReg();
                int year = currentCar.convertYear();
                String name = currentCar.convertName();
                String date = currentCar.convertDate();
                int millage = currentCar.convertMillage();
                String service = currentCar.convertService(millage);
                String showCar = "Modell:" + " " + model + "\n"
                        + "Regnummer:" + " " + reg + "\n"
                        + "År:" + " " + year + "\n"
                        + "Namn:" + " " + name + "\n"
                        + "Datum:" + " " + date + "\n"
                        + " Bilen har kört:" + " " + millage + " Mil" + "\n"
                        + " Behövd Service:" + " " + service;
                JOptionPane.showMessageDialog(null, showCar);

                ws.addCar(new Car(reg, model, year, name, date, millage, service));

                int dialogButton = JOptionPane.showConfirmDialog(null, "Vill du skriva in en till bil?", "Information", JOptionPane.YES_NO_OPTION);

                if (dialogButton == JOptionPane.YES_OPTION) {
                    t = 1;
                } else {
                    ws.printCar();
                    t = 0;

                    
                    
                }

            }

        } else if (choice == 0) {
            UserInput currentCar = new UserInput();
            String search = currentCar.convertSearch();
            ws.searchCar(search);
            
            

        }
        else if (choice == 2){
            ws.printCar();
            break;
        }
        }
    }
    

}
