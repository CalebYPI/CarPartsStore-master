package za.ac.cput.group3b.repository.Staff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.group3b.domain.Staff.Staff;

import java.util.Set;

@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {
    Set<Staff> getAll();
}
