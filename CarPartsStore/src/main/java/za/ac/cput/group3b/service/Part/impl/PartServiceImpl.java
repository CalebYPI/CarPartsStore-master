package za.ac.cput.group3b.service.Part.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.group3b.domain.Part.Part;
import za.ac.cput.group3b.repository.Part.PartRepository;
import za.ac.cput.group3b.repository.Part.impl.PartRepositoryImpl;
import za.ac.cput.group3b.service.Part.PartService;

import java.util.Set;

@Service("ServiceImpl")
public class PartServiceImpl implements PartService {

    @Autowired
    @Qualifier("InMemory")
    private PartRepository repository;

    private PartServiceImpl() { this.repository = PartRepositoryImpl.getRepository(); }

    @Override
    public Part create(Part part) { return this.repository.create(part); }

    @Override
    public Part update(Part part) { return this.repository.update(part); }

    @Override
    public void delete(String s) { this.repository.delete(s); }

    @Override
    public Part read(String s) {return this.read(s); }

    @Override
    public Set<Part> getAll() { return this.repository.getAll(); }
}
