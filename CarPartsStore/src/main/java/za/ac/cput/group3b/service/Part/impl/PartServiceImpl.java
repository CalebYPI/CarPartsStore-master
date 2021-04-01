package za.ac.cput.group3b.service.Part.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.group3b.domain.Part.Part;
import za.ac.cput.group3b.repository.Part.PartRepository;
import za.ac.cput.group3b.service.Part.PartService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PartServiceImpl implements PartService {

    @Autowired
    private PartRepository repository;

    @Override
    public Part create(Part part) {
        return this.repository.save(part);
    }

    @Override
    public Part update(Part part) {
        if (repository.existsById(part.getPartId()))
            return this.repository.save(part);
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
    public Part read(String s) {
        return this.repository.findById(s).orElseGet(null);
    }

    @Override
    public Set<Part> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}
