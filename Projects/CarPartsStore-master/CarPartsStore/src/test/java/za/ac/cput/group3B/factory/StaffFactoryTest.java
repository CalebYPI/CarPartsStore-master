package za.ac.cput.group3B.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.group3B.domain.Staff;

import static org.junit.Assert.*;

public class StaffFactoryTest {

    @Test
    public void getStaff() {
        int staffId = 101;
        String staffFName = "Bob";
        String staffLName = "The Builder";
        String staffJobTitle = "Main Mechanic";
        Staff emp1 = StaffFactory.getStaff(staffId, staffFName, staffLName, staffJobTitle);
        System.out.println(emp1);
        Assert.assertNotNull(emp1.getStaffId());
    }
}