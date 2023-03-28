package Model;

public class Driver extends Person{
    String name,age,gender, carModel,numberPlate;
    Integer longitude,latitude,id;
    Boolean isAvailable;
    static Integer count=0;



    public Driver(String name, String age, String gender, String carModel, String numberPlate, Integer longitude, Integer latitude) {
        super(name,age,gender);
        this.carModel = carModel;
        this.numberPlate = numberPlate;
        this.longitude = longitude;
        this.latitude = latitude;
        this.isAvailable=true;
        this.id=count++;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public Integer getId() {
        return id;
    }


    public void setAvailable(Boolean available) {
        isAvailable = available;
    }


    public String getCarModel() {
        return carModel;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }
}
