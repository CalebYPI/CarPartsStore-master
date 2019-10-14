package za.ac.cput.group3b.controller.Staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.group3b.domain.Staff.Staff;
import za.ac.cput.group3b.service.Staff.StaffService;

import java.util.Set;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    @Qualifier("ServiceImpl")
    private StaffService service;

    @PostMapping("/create")
    @ResponseBody
    public Staff create(Staff staff) { return service.create(staff); }

    @PostMapping("/update")
    @ResponseBody
    public Staff update(Staff staff) { return service.update(staff); }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) { service.delete(id); }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Staff read(@PathVariable String id) { return service.read(id); }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Staff> getAll() { return service.getAll(); }
}
