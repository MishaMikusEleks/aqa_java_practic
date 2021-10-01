package practice.hibernate.model;

public class Address {
//    `id` int(11) NOT NULL AUTO_INCREMENT,
    private Long id;
//                           `county` varchar(45) DEFAULT NULL,
    private String county;
//                           `city` varchar(45) DEFAULT NULL,
    private String city;
//                           `street` varchar(45) DEFAULT NULL,
    private String street;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
