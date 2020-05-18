/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Models.User;
import java.util.List;

/**
 *
 * @author HP
 */
public interface UserRepository extends CrudRepository<User>{
    
    List<User> getByDepartment(String department);
    User getByUsername(String username);
}
