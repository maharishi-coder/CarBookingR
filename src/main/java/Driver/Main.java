package Driver;

import CarException.CarBookingException;
import Model.User;
import Repository.DriverRepository;
import Repository.UserRepository;

import Model.Driver;
import Service.BookingService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<User> userList = new ArrayList<>();
    public static List<Driver> driverList = new ArrayList<>();

    public static void main(String[] args) throws CarBookingException {


        User user1 = new User("Abhishek", "M", "23");
        User user2 = new User("Rahul", "M", "29");
        User user3 = new User("Nandini", "F", "22");

        UserRepository userRepository = new UserRepository();
        DriverRepository driverRepository = new DriverRepository();
        userRepository.add_user(user1);
        userRepository.add_user(user2);
        userRepository.add_user(user3);

        Driver driver1 = new Driver("Driver1", "M", "22", "Swift", "KA-01-12345", 0, 0);
        Driver driver2 = new Driver("Driver2", "M", "29", "Swift", "KA-01-12345", 11, 10);
        Driver driver3 = new Driver("Driver3", "M", "24", "Swift", "KA-01-12345", 0, 0);

        driverRepository.add_driver(driver1);
        driverRepository.add_driver(driver2);
        driverRepository.add_driver(driver3);

        BookingService bookingService1 = new BookingService();
        List<Driver> avalivale_driver_list = bookingService1.find_ride("Abhishek", 0, 0, 20, 1);
        if (!avalivale_driver_list.isEmpty()) {
            bookingService1.choose_ride("Abhishek", "Driver1");
        }


        BookingService bookingService2 = new BookingService();
        avalivale_driver_list=bookingService2.find_ride("Rahul", 10, 0, 15, 3);
        if (!avalivale_driver_list.isEmpty()) {
            bookingService1.choose_ride("Rahul", "Driver1");
        }


        BookingService bookingService3 = new BookingService();
        avalivale_driver_list=bookingService3.find_ride("Nandini", 0, 0, 20, 4);
        if (!avalivale_driver_list.isEmpty()) {
            bookingService1.choose_ride("Nandini", "Driver1");
        }


    }
}