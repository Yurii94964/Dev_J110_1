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
        
        Publisher_name_and_city house1 = new Publisher_name_and_city ("Поспект", "Москва");
        Publisher_name_and_city house2 = new Publisher_name_and_city("Питер", "Санкт-Петербург");
        Publisher_name_and_city house3 = new Publisher_name_and_city("БХВ", "Санкт-Петебург");
        Publisher_name_and_city house4 = new Publisher_name_and_city("Диалектика", "Киев");
        
        
        
        
        
        
       
       Book_data[] books = new  Book_data[5];
       books [0] = new  Book_data("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных","Седжвик Роберт, Уэйн Кевин" ,house2 , 2018);
       books [1] = new  Book_data("Разработка требований к программному обеспечению. 3-е издание, дополненное","Вигерс Карл",house3 , 2019 );
       books [2] = new  Book_data("Java. Полное руководство, 10-е издание","Шилдт Герберт ", house4, 2018);
       books [3] = new  Book_data("C/C++. Процедурное программирование", "Полубенцева М.И.",house3, 2017 );
       books [4] = new  Book_data("Конституция РФ",house1,2020);
       Book_data.printAll(books);
       
       for(int i = 0; i < books.length; i++ ){
           if("Санкт-Петебург".equals(books[i].getPublishing_house().getCity()) )
               books[i].getPublishing_house().setCity("Санкт-Петербург");
           
       }
     Book_data.printAll(books);
       
}
     
    
    
    }
    
     
    
    
    
    
   
    
    
    

    
    
       
    
    

