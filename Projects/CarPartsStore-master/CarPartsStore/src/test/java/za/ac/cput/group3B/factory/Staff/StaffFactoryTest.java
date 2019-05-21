package za.ac.cput.group3b.factory.Staff;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.group3b.domain.Staff.Staff;

import static org.junit.Assert.*;

public class StaffFactoryTest {

    private String testId, testFName, testLName, testTitle;

    @Before
    public void setUp() throws Exception {
        this.testId = "testId";
        this.testFName = "testFName";
        this.testLName = "testLName";
        this.testTitle = "testTitle";
    }

    @Test
    public void getStaff() {
        Staff staff = StaffFactory.getStaff(this.testId, this.testFName, this.testLName, this.testTitle);
        Assert.assertNotNull(staff.getStaffId());
        Assert.assertNotNull(staff);
    }
}