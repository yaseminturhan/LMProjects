/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author yaseminturhan
 */


import java.util.List;

public interface interfaces<T> {

	void save(T t,String id);
	void save(T t);
	void update(String id, T t);
	void delete(String id);
	List<T> getAll();
}