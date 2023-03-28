package Repository;

import Model.Driver;
import Model.User;

import java.util.ArrayList;
import java.util.List;
import static Driver.Main.driverList;

public class DriverRepository
{

    public void add_driver(Driver driver){
        driverList.add(driver);
    }

    public List<Driver> allDriver(){
        return driverList;
    }
}
