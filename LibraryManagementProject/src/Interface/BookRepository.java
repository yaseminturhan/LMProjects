/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Models.Book;
import java.util.List;

/**
 *
 * @author HP
 */
public interface BookRepository extends CrudRepository<Book>{
    
    Book getById(String id);
    List<Book> getByCategory(String category);
    List<Book> getByPublisher(String publisher);
    List<Book> getByAuthor(String author);
    
}
