/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author Юрий
 */
public class Books {
     public static void main(String[] args) {
        
        PublisherNameAndCity house1 = new PublisherNameAndCity ("Проспект", "Москва");
        PublisherNameAndCity house2 = new PublisherNameAndCity("Питер", "Санкт-Петербург");
        PublisherNameAndCity house3 = new PublisherNameAndCity("БХВ", "Санкт-Петебург");
        PublisherNameAndCity house4 = new PublisherNameAndCity("Диалектика", "Киев");
        
        
        
        
        
        
       
       BookData[] books = new  BookData[5];
       books [0] = new  BookData("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных","Седжвик Роберт, Уэйн Кевин" ,house2 , 2018);
       books [1] = new  BookData("Разработка требований к программному обеспечению. 3-е издание, дополненное","Вигерс Карл",house3 , 2019 );
       books [2] = new  BookData("Java. Полное руководство, 10-е издание","Шилдт Герберт ", house4, 2018);
       books [3] = new  BookData("C/C++. Процедурное программирование", "Полубенцева М.И.",house3, 2017 );
       books [4] = new  BookData("Конституция РФ",house1,2020);
       BookData.printAll(books);
       
       for(int i = 0; i < books.length; i++ ){
           if("Санкт-Петебург".equals(books[i].getPublishingHouse().getCity()) )
               books[i].getPublishingHouse().setCity("Санкт-Петербург");
           
       }
     BookData.printAll(books);
       
}
     
    
    
    }
    
     
    
    
    
    
   
    
    
    

    
    
       
    
    

