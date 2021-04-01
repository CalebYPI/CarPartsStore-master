//package za.ac.cput.group3b.repository.Staff;
//
//import org.junit.Assert;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.MethodSorters;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import za.ac.cput.group3b.domain.Staff.Staff;
//import za.ac.cput.group3b.factory.Staff.StaffFactory;
//
//import java.io.IOException;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@FixMethodOrder(MethodSorters.JVM)
//public class StaffRepositoryTest {
//    @Autowired
//    private StaffRepository repository;
//    private String staffId = null;
//
//    @Test
//    public void StaffCreateTest() throws IOException {
//        Staff staff = StaffFactory.getStaff("Bob", "The Builder", "Mechanic");
//        Staff result = repository.create(staff);
//        staffId = result.getStaffId();
//        Assert.assertNotNull(staff);
//    }
//
//    @Test
//    public void SiteStaffTest() throws IOException {
//        Staff staff = repository.read(staffId);
//        Assert.assertNotNull(staff);
//    }
//}
