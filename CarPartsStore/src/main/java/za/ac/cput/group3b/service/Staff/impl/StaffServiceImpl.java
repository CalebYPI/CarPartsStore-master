package za.ac.cput.group3b.service.Staff.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.group3b.domain.Staff.Staff;
import za.ac.cput.group3b.repository.Staff.StaffRepository;
import za.ac.cput.group3b.service.Staff.StaffService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository repository;

    @Override
    public Staff create(Staff staff) {
        return this.repository.save(staff);
    }

    @Override
    public Staff update(Staff staff) {
        if (repository.existsById(staff.getStaffId()))
            return this.repository.save(staff);
        return null;
    }

    @Override
    public boolean delete(String s) {
        this.repository.deleteById(s);
        if (repository.existsById(s))
            return false;
        else return true;
    }

    @Override
    public Staff read(String s) {
        return this.repository.findById(s).orElseGet(null);
    }

    @Override
    public Set<Staff> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}
