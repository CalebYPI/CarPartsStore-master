package za.ac.cput.group3b.repository.Part.impl;

import za.ac.cput.group3b.domain.Part.Part;
import za.ac.cput.group3b.repository.Part.PartRepository;

import java.util.*;

public class PartRepositoryImpl implements PartRepository {

    private static PartRepositoryImpl repository = null;
    private Map<String, Part> parts;

    private PartRepositoryImpl() { this.parts = new HashMap<>(); }

    public static PartRepository getRepository() {
        if (repository == null) repository = new PartRepositoryImpl();
        return repository;
    }

    public Part create(Part part) {
        this.parts.put(part.getPartId(), part);
        return this.parts.get(part.getPartId());
    }

    public Part update(Part part) {
        this.parts.replace(part.getPartId(), part);
        return this.parts.get(part.getPartId());
    }

    public void delete(String partId) { this.parts.remove(partId); }

    public Part read(String partId) { return this.parts.get(partId); }

    public Set<Part> getAll() {
        Collection<Part> parts = this.parts.values();
        Set<Part> set = new HashSet<>();
        set.addAll(parts);
        return set;
    }
}
