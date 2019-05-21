package za.ac.cput.group3b.factory.Staff;

import za.ac.cput.group3b.domain.Staff.Staff;

public class StaffFactory {
    public static Staff getStaff(String staffId, String staffFName, String staffLName, String staffJobTitle) {
    return new Staff.Builder()
            .staffId(staffId)
            .staffFName(staffFName)
            .staffLName(staffLName)
            .staffJobTitle(staffJobTitle)
            .build();
    }
}
