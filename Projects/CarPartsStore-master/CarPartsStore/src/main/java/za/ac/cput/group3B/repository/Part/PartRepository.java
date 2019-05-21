package za.ac.cput.group3b.repository.Part;

import za.ac.cput.group3b.domain.Part.Part;
import za.ac.cput.group3b.repository.IRepository;

import java.util.Set;

public interface PartRepository extends IRepository<Part, String> {
    Set<Part> getAll();
}
