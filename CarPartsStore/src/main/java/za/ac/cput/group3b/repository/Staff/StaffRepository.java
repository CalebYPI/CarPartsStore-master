package za.ac.cput.group3b.repository.Staff;

import za.ac.cput.group3b.domain.Staff.Staff;
import za.ac.cput.group3b.repository.IRepository;

import java.util.Set;

public interface StaffRepository extends IRepository<Staff, String> {
    Set<Staff> getAll();
}
