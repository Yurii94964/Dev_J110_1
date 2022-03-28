/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countries;

/**
 *
 * @author Юрий
 */
public class Countries {
    private String name;
    private double area;
    private double population;
    private String nameOfTheCapital;
    private double populationOfTheCapital;
    
  
    
    

    public Countries(String name, double area, double population, String nameOfTheCapital, double populationOfTheCapital) {
        
        this(name, area, population);
        setNameOfTheCapital(nameOfTheCapital);
        setPopulationOfTheCapital(populationOfTheCapital);
        
       
    }

    public Countries(String name,double area, double population) {
        
        setName(name);
        setArea(area);
        setPopulation(population);
       
        
    }
   
    public void print() {
        
        if(nameOfTheCapital == null && populationOfTheCapital == 0 )
            System.out.println("Название страны " + name + ", площадь " + area  + " млн кв. км., " +
               " население " + population + " млн чел.," + " - " +  ", плотность населения страны " + getCountryPopulationDensity() + " млн чел./млн кв. км.");
        else{
             System.out.println("Название страны " + name + ", площадь " + area + " млн кв. км., " +
                " население " + population + " млн чел., " + " название столицы " + nameOfTheCapital +
                ", население столицы " + populationOfTheCapital + " млн чел." + ", плотность населения страны " + getCountryPopulationDensity() + " млн чел./млн кв. км." );
        }
    }
    public static void printAll(Countries[] country ){
        country [0].print();
        country [1].print();
        country [2].print();
        country [3].print();
        country [4].print();
        
    }
    public  double getCountryPopulationDensity( ){
        
    return population / area;
            
    } 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name.trim().isEmpty())
            throw new IllegalArgumentException("название не должно быть пустым");
        else if (name == null)
             throw new IllegalArgumentException("название не должно быть null");
        this.name = name;
        
        
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
       if (area <= 0) 
            throw new IllegalArgumentException("area не может быть меньше или равна нулю");
        this.area = area;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if (population <= 0) 
            throw new IllegalArgumentException("population не может быть меньше или равно нулю");
        this.population = population;
    }

    public String getNameOfTheCapital() {
        return nameOfTheCapital;
    }

    public void setNameOfTheCapital(String nameOfTheCapital) {
        
        this.nameOfTheCapital = nameOfTheCapital;
    }

    public double getPopulationOfTheCapital() {
        return populationOfTheCapital;
    }

    public void setPopulationOfTheCapital(double populationOfTheCapital) {
      
        this.populationOfTheCapital = populationOfTheCapital;
    }  
    
}
