package za.ac.cput.group3b.repository.Part;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.group3b.domain.Part.Part;

import java.util.Set;

@Repository
public interface PartRepository extends JpaRepository<Part, String> {
    Set<Part> getAll();
}
