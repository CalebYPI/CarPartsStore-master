//package za.ac.cput.group3b.repository.Part;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//import za.ac.cput.group3b.domain.Part.Part;
//import za.ac.cput.group3b.factory.Part.PartFactory;
//import za.ac.cput.group3b.repository.Part.impl.PartRepositoryImpl;
//
//import java.util.Set;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class PartRepositoryImplTest {
//
//    private PartRepository repository;
//    private Part part;
//
//    private Part getSavedPart() {
//        Set<Part> savedParts = this.repository.getAll();
//        return savedParts.iterator().next();
//    }
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository = PartRepositoryImpl.getRepository();
//        this.part = PartFactory.getPart("Single Turbo", 1750.00);
//    }
//
//    @Test
//    public void a_create() {
//        Part created = this.repository.create(this.part);
//        System.out.println(created);
//        d_getAll();
//        Assert.assertSame(created, this.part);
//    }
//
//    @Test
//    public void b_read() {
//        Part savedPart = getSavedPart();
//        System.out.println(savedPart.getPartId());
//        Part read = this.repository.read(savedPart.getPartId());
//        System.out.println(read);
//        d_getAll();
//        Assert.assertSame(savedPart, read);
//    }
//
//    @Test
//    public void c_update() {
//        String newPartName = "New Test";
//        Part part = new Part.Builder().copy(getSavedPart()).partName(newPartName).build();
//        System.out.println(part);
//        Part updated = this.repository.update(part);
//        Assert.assertSame(newPartName, updated.getPartName());
//        d_getAll();
//    }
//
//    @Test
//    public void d_getAll() {
//        Set<Part> all = this.repository.getAll();
//        System.out.println(all);
//        Assert.assertSame(1, all.size());
//    }
//
//    @Test
//    public void e_delete() {
//        Part savedPart = getSavedPart();
//        this.repository.delete(savedPart.getPartId());
//        d_getAll();
//    }
//}
