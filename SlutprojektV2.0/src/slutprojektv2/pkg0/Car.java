/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slutprojektv2.pkg0;

/**
 * 
 * @author Arvid Kellström
 */
public class Car {
    private String reg;
    private String model;
    private int year;
    private String name;
    private String date;
    private int millage;
   private String service;

    /**
     * 
     * @param reg license plate number
     * @param model With car manufacturer
     * @param year with year the car was manufactured
     * @param name name of the cars owner 
     * @param date date of the car being entered in the carshop
     * @param millage millage that the car has been driven 
     * @param service what type of service is needed 
     */
   public Car (String reg, String model,int year, String name, String date, int millage, String service){
       this.reg = reg;
       this.millage = millage;
       this.date = date;
       this.service = service;
       this.name = name;
       this.model = model;
       this.year = year;
       
   
   
   }
/**
 * sets the license plate number
 * @param reg license plate number
 */
    public void setReg(String reg) {
        this.reg = reg;
    }
/**
 * sets the car manufacturer
 * @param model entered model of the car 
 */
    public void setModel(String model) {
        this.model = model;
    }
/**
 * sets the year the car was manufactured
 * @param year entered year of the car being manufactured
 */
    public void setYear(int year) {
        this.year = year;
    }
/**
 * sets the name of the car owner 
 * @param name  entered name of the car owner 
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * sets the date of the car being entered to the carshop 
 * @param date generated date
 */
    public void setDate(String date) {
        this.date = date;
    }
/**
 * sets the millage of the car 
 * @param millage genereated millage
 */
    public void setMillage(int millage) {
        this.millage = millage;
    }
/**
 * sets the type of service that is needed 
 * @param service  generated type of service 
 */
    public void setService(String service) {
        this.service = service;
    }
/**
 * 
 * @return a specific reg 
 */
    public String getReg() {
        return reg;
    }
/**
 * 
 * @return a specific Model 
 */
    public String getModel() {
        return model;
    }
/**
 * 
 * @return a specific year
 */
    public int getYear() {
        return year;
    }
/**
 * 
 * @return a specific name
 */
    public String getName() {
        return name;
    }
/**
 * 
 * @return a specific date 
 */
    public String getDate() {
        return date;
    }
/**
 * 
 * @return a specific millage
 */
    public int getMillage() {
        return millage;
    }
/**
 * 
 * @return a specific service 
 */
    public String getService() {
        return service;
    }
   
   
   
}
