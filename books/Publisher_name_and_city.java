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
public  class Publisher_name_and_city {
    private  String publisher_name;
    private  String city;

    public Publisher_name_and_city(String  publisher_name, String city) {
        setPublisher_name(publisher_name);
        setCity(city);
    }

   


    public String  getPublisher_name() {
        return publisher_name;
    }

    public void setPublisher_name(String  publisher_name) {
        if( publisher_name == null)
            throw new IllegalArgumentException("издательство не должно быть пустым");
        this.publisher_name = publisher_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if( city == null)
            throw new IllegalArgumentException("город не должнен быть пустым");
        this.city = city;
        
        
        
        
}
  
}