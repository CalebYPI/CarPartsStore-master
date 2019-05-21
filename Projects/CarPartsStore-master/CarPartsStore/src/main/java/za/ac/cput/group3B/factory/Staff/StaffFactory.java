package za.ac.cput.group3b.factory.Staff;

import za.ac.cput.group3b.domain.Staff.Staff;
import za.ac.cput.group3b.util.Misc;

public class StaffFactory {
    public static Staff getStaff(String staffFName, String staffLName, String staffJobTitle) {
    return new Staff.Builder()
            .staffId(Misc.generateId())
            .staffFName(staffFName)
            .staffLName(staffLName)
            .staffJobTitle(staffJobTitle)
            .build();
    }
}
