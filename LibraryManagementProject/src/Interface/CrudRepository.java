/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;

/**
 *
 * @author HP
 */
public interface CrudRepository<T> {
    
    void save(T t);
    void save(T t, String id);
    void update(String id, T t);
    void delete(String id);
    List<T> getAll();
    T getById(String id);
    
}
