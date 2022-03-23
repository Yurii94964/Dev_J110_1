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
    private String name_of_the_capital;
    private double population_of_the_capital;
    
  
    
    

    public Countries(String name, double area, double population, String name_of_the_capital, double population_of_the_capital) {
        
        this(name, area, population);
        setName_of_the_capital(name_of_the_capital);
        setPopulation_of_the_capital(population_of_the_capital);
        
       
    }

    public Countries(String name,double area, double population) {
        
        setName(name);
        setArea(area);
        setPopulation(population);
       
        
    }
   
    public void print() {
        
        if(name_of_the_capital == null && population_of_the_capital == 0 )
            System.out.println("Название страны " + name + ", площадь " + area  + " млн кв. км., " +
               " население " + population + " млн чел.," + " - " +  ", плотность населения страны " + getCountry_population_density() + " млн чел./млн кв. км.");
        else{
             System.out.println("Название страны " + name + ", площадь " + area + " млн кв. км., " +
                " население " + population + " млн чел., " + " название столицы " + name_of_the_capital +
                ", население столицы " + population_of_the_capital + " млн чел." + ", плотность населения страны " + getCountry_population_density() + " млн чел./млн кв. км." );
        }
    }
    public static void printAll(Countries[] country ){
        country [0].print();
        country [1].print();
        country [2].print();
        country [3].print();
        country [4].print();
        
    }
    public  double getCountry_population_density( ){
        
    return population / area;
            
    } 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null)
            throw new IllegalArgumentException("название не должно быть пустым");
            
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
       if (area < 0) 
            throw new IllegalArgumentException("area не может быть меньше ноля");
        this.area = area;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if (population < 0) 
            throw new IllegalArgumentException("population не может быть меньше ноля");
        this.population = population;
    }

    public String getName_of_the_capital() {
        return name_of_the_capital;
    }

    public void setName_of_the_capital(String name_of_the_capital) {
        
        this.name_of_the_capital = name_of_the_capital;
    }

    public double getPopulation_of_the_capital() {
        return population_of_the_capital;
    }

    public void setPopulation_of_the_capital(double population_of_the_capital) {
      
        this.population_of_the_capital = population_of_the_capital;
    }  
    
}
