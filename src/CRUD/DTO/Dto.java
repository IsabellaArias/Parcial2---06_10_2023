package CRUD.DTO;

import java.io.Serializable;

public class Dto implements Serializable {
    private Integer id;
    private String NameOfTheCenter;
    private String city;
    private String address;

    public Dto(Integer id, String nameOfTheCenter, String city, String address) {
        this.id = id;
        NameOfTheCenter = nameOfTheCenter;
        this.city = city;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfTheCenter() {
        return NameOfTheCenter;
    }

    public void setNameOfTheCenter(String nameOfTheCentre) {
        NameOfTheCenter = nameOfTheCentre;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Mall" +
                "\nId= " + id +
                "\nName Of The Center= " + NameOfTheCenter +
                "\ncity= " + city +
                "\naddress= " + address;
    }
}
