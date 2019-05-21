package za.ac.cput.group3b.service.Staff.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.group3b.domain.Staff.Staff;
import za.ac.cput.group3b.repository.Staff.StaffRepository;
import za.ac.cput.group3b.service.Staff.StaffService;

import java.util.Set;

@Service("ServiceImpl")
public class StaffServiceImpl implements StaffService {

    @Autowired
    @Qualifier("InMemory")
    private StaffRepository repository;

    @Override
    public Staff create(Staff staff) { return repository.create(staff); }

    @Override
    public Staff update(Staff staff) { return repository.update(staff); }

    @Override
    public void delete(String s) { repository.delete(s); }

    @Override
    public Staff read(String s) { return repository.read(s); }

    @Override
    public Set<Staff> getAll() { return repository.getAll(); }
}
