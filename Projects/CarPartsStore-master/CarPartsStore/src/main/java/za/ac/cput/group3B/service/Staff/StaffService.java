package za.ac.cput.group3b.service.Staff;

import za.ac.cput.group3b.domain.Staff.Staff;
import za.ac.cput.group3b.service.IService;

import java.util.Set;

public interface StaffService extends IService<Staff, String> {
    Set<Staff> getAll();
}
