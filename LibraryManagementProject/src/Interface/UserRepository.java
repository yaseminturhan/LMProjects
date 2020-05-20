/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Models.UserModel;
import java.util.List;

/**
 *
 * @author HP
 */
public interface UserRepository extends CrudRepository<UserModel>{
    
    UserModel getByDepartment(String department);
    UserModel getByUsername(String username);
}