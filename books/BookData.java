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
public class BookData   {
    
    private String name;
    private PublisherNameAndCity publishingHouse;
    private int yearOfPublication;
    private String [] autors;
    

   
    public BookData(String name, PublisherNameAndCity publisherName, int yearOfPublication) {
        setName(name); 
        setYearOfPublication(yearOfPublication);
        setPublisherNameAndCity(publisherName);
       
        
    }

    public BookData(String name, String autor,  PublisherNameAndCity   publisherName, int yearOfPublication) {
        
        this(name,publisherName,yearOfPublication );
       setAutor(autor);
        
        
        
    }
 public BookData(String name, String[] autors, PublisherNameAndCity   publisherName, int yearOfPublication) {
       this(name,publisherName,yearOfPublication );
        setAutors(autors);
        
        
       
    }
  public void print() {
      if(autors != null)
      System.out.println("Название книги: " + name + "; авторы: " + Arrays.toString(autors) + "; издательство: " + getPublishingHouse().getPublisherName() + "; год издания: " + yearOfPublication + "; название города: " + getPublishingHouse().getCity() + ".");
      else{
          System.out.println("Название книги: " + name  +  "; издательство: " + getPublishingHouse().getPublisherName() + "; год издания: " + yearOfPublication + "; название города: " + getPublishingHouse().getCity() + "." );
          
      }
    
    
    
    
  }
   public static void printAll(BookData [] books ){
      
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
    public PublisherNameAndCity getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublisherNameAndCity(PublisherNameAndCity publishingHouse) {
        if(publishingHouse  == null)
            throw new IllegalArgumentException("издательство не должно быть пустым");
        this.publishingHouse = publishingHouse;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null)
            throw new IllegalArgumentException("название не должно быть пустым");
        this.name = name;
    }
    
    
   
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        if(yearOfPublication <= 0)
            throw new IllegalArgumentException("год издания должен быть строго больше  ноля");
        this.yearOfPublication = yearOfPublication;
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
