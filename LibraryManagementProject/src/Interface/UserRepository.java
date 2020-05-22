package Interface;

import Models.BookModel;
import Models.UserModel;
import java.util.List;


public interface UserRepository extends CrudRepository<UserModel>{
    
    UserModel getByUsername(String username);
    void addBookUser(String username, BookModel book);
    List<BookModel> getUserBooks(String username);
    BookModel removeBookUser(String username, String bookId);
    
    
    
}