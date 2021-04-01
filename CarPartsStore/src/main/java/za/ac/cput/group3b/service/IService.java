package za.ac.cput.group3b.service;

public interface IService<T, ID> {
    T create(T type);
    T update(T type);
    boolean delete(ID id);
    T read(ID id);
}
