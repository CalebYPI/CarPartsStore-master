package za.ac.cput.group3b.repository.Staff.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.group3b.domain.Staff.Staff;
import za.ac.cput.group3b.repository.Staff.StaffRepository;

import java.util.*;

@Repository("InMemory")
public class StaffRepositoryImpl implements StaffRepository {
    private static StaffRepositoryImpl repository = null;
    private Map<String, Staff> employees;

    private StaffRepositoryImpl() { this.employees = new HashMap<>(); }

    private StaffRepository getRepository() {
        if (repository == null) repository = new StaffRepositoryImpl();
        return repository;
    }

    public Staff create(Staff staff) {
        this.employees.put(staff.getStaffId(), staff);
        return this.employees.get(staff.getStaffId());
    }

    public Staff update(Staff staff) {
        this.employees.replace(staff.getStaffId(), staff);
        return this.employees.get(staff.getStaffId());
    }

    public void delete(String staffId) { this.employees.remove(staffId); }

    public Staff read(String staffId) { return this.employees.get(staffId); }

    public Set<Staff> getAll() {
        Collection<Staff> employees = this.employees.values();
        Set<Staff> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }
}
