/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slutprojektv2.pkg0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 
 * @author Arvid Kellström
 */

public class Workshop {

    File file = new File("car.txt");
    ArrayList<Car> carList = new ArrayList<>();

    public void addCar(Car inCar) {

        carList.add(inCar);

    }
/**
 * Scans a .txt file and inserts the content into an ArrayList
 * @throws FileNotFoundException
 * @throws IOException 
 */
    public void readCar() throws FileNotFoundException, IOException {
       
        BufferedReader br = new BufferedReader(new FileReader(file));
        String read;
        while ((read = br.readLine()) != null) {
            String[] splited = read.split("-");
            carList.add(new Car(splited[0], splited[1], Integer.parseInt(splited[2]), splited[3], splited[4], Integer.parseInt(splited[5]), splited[6]));
        }


    }
/**
 * prints the content of the Arraylist to a .txt file
 * @throws FileNotFoundException 
 */
    public void printCar() throws FileNotFoundException {
        PrintWriter write = new PrintWriter(file);

        for (Car car : carList) {
            String caris = car.getReg()+"-"+car.getModel() + "-" + car.getYear() + "-" + car.getName() + "-" + car.getDate() + "-" + car.getMillage() + "-" + car.getService();
            write.println(caris);
            System.out.println(caris);

        }
        write.close();

    }
    /**
     * Compairs the string that the user entered to the license plate and if they are equal prints the relevent information.
     * @param search The lisenceplate number the user has entered.
     */
    public void searchCar( String search) {
        
        
        for (Car car : carList) {
             if (car.getReg().equals(search)) {
           String showCar = "Modell:" + " " + car.getModel() + "\n"
                        + "Regnummer:" + " " + car.getReg() + "\n"
                        + "År:" + " " + car.getYear() + "\n"
                        + "Namn:" + " " + car.getName() + "\n"
                        + "Datum:" + " " + car.getDate() + "\n"
                        + " Bilen har kört:" + " " + car.getMillage() + " Mil" + "\n"
                        + " Behövd Service:" + " " + car.getService();
                JOptionPane.showMessageDialog(null, showCar);
        }
        else {
                 System.out.println("nope");
             }
             
            
                 

        }
       
    }
}
