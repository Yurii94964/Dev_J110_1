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
public  class PublisherNameAndCity {
    private  String publisherName;
    private  String city;

    public PublisherNameAndCity(String  publisherName, String city) {
        setPublisherName(publisherName);
        setCity(city);
    }

   


    public String  getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String  publisherName) {
        if( publisherName == null)
            throw new IllegalArgumentException("издательство не должно быть пустым");
        this.publisherName = publisherName;
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