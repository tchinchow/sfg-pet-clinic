package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * CrudService
 */
public interface CrudService<T, ID> {

    T findById(ID id);

    T save(T object);

    void delete(T object);

    Set<T> findAll();
    
}