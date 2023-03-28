package Service;

import CarException.CarBookingException;
import Common.Constant;
import Model.Driver;
import Repository.DriverRepository;

import java.util.ArrayList;
import java.util.List;

import static Driver.Main.driverList;
import static java.lang.Math.sqrt;

public class BookingService {
    List<Driver>availableDriver;
    public BookingService(){
        this.availableDriver=new ArrayList<>();
    }
    public List<Driver> find_ride(String userName, Integer slat, Integer slong, Integer dlat, Integer dlong) throws CarBookingException {

        DriverRepository driverRepository = new DriverRepository();
        List<Driver> driverList =driverRepository.allDriver();
        for(Driver driver:driverList){
            Integer driver_lat=driver.getLatitude();
            Integer driver_long= driver.getLongitude();
            Double distance= Math.sqrt(Math.pow(driver_lat - slat, 2) + Math.pow(driver_long - slong, 2));
            if(distance<=5){
                availableDriver.add(driver);
            }
        }
        if(availableDriver.isEmpty()){
            System.out.println(Constant.NOT_FOUND);
          /*if you want to see exception the uncomment this line
                 throw new CarBookingException(Constant.NOT_FOUND);
           */
        }
        else{
            System.out.println("--Available Driver---");
            for (Driver d:
                    availableDriver) {
                System.out.println(d.getName());
            }
        }
        return availableDriver;
    }

    public void choose_ride(String userName,String driverName){
        for(Driver driver: availableDriver){
            if(driver.getName().equals(driverName)){
                if(driver.getAvailable()){
                    driverList.get(driver.getId()).setAvailable(false);
                    System.out.println("User:- "+userName+" got a ride."+"Driver Name:- "+driverName);
                }else{
                    System.out.println(Constant.NOT_AVAILABLE);
                    /*if you want to see exception the uncomment this line
                    throw new CarBookingException(Constant.NOT_AVAILABLE);

                     */
                }
            }
        }
    }

}
