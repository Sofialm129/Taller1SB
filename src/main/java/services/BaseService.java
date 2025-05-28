package services;

public interface BaseService <T>{
    T save(T t);
    T update(T t);
    void delete(T t);
    T findById(Integer id);
    Iterable<T> findAll();
}
