/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import java.util.Arrays;

/**
 *
 * @author Юрий
 */
public class Book_data   {
    
    private String name;
    private Publisher_name_and_city publishing_house;
    private int year_of_publication;
    private String [] autors;
    

   
    public Book_data(String name, Publisher_name_and_city publisher_name, int year_of_publication) {
        setName(name); 
        setYear_of_publication(year_of_publication);
        setPublisher_name_and_city(publisher_name);
       
        
    }

    public Book_data(String name, String autor,  Publisher_name_and_city   publisher_name, int year_of_publication) {
        
        this(name,publisher_name,year_of_publication );
       setAutor(autor);
        
        
        
    }
 public Book_data(String name, String[] autors, Publisher_name_and_city   publisher_name, int year_of_publication) {
       this(name,publisher_name,year_of_publication );
        setAutors(autors);
        
        
       
    }
  public void print() {
      if(autors != null)
      System.out.println("Название книги: " + name + "; авторы: " + Arrays.toString(autors) + "; издательство: " + getPublishing_house().getPublisher_name() + "; год издания: " + year_of_publication + "; название города: " + getPublishing_house().getCity() + ".");
      else{
          System.out.println("Название книги: " + name  +  "; издательство: " + getPublishing_house().getPublisher_name() + "; год издания: " + year_of_publication + "; название города: " + getPublishing_house().getCity() + "." );
          
      }
    
    
    
    
  }
   public static void printAll(Book_data [] books ){
      
       if(books == null)
           throw new IllegalArgumentException("значение не может быть пустым");
       for(int i = 0; i < books.length; i++ ){
           books [i].print();
       }
   }
    public void setAutor(String autor) {
        if(autor == null)
         throw new IllegalArgumentException("нужно указать автора");
        autors = new String[1];
        autors[0] = autor;
             
   
    }
    public Publisher_name_and_city getPublishing_house() {
        return publishing_house;
    }

    public void setPublisher_name_and_city(Publisher_name_and_city publishing_house) {
        if(publishing_house  == null)
            throw new IllegalArgumentException("издательство не должно быть пустым");
        this.publishing_house = publishing_house;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null)
            throw new IllegalArgumentException("название не должно быть пустым");
        this.name = name;
    }
    
    
   
    public int getYear_of_publication() {
        return year_of_publication;
    }

    public void setYear_of_publication(int year_of_publication) {
        if(year_of_publication <= 0)
            throw new IllegalArgumentException("год издания должен быть строго больше  ноля");
        this.year_of_publication = year_of_publication;
    }

    public String[] getAutors() {
        return autors;
    }

    public void setAutors(String[] autors) {
         if( autors == null)
            throw new IllegalArgumentException("массив не должен содержать пустых ссылок");
        this.autors = autors;
    }
    
    
}
