package Models;

import java.util.List;

/**
 *
 * @author HP
 */
public class UserModel {
    
    private int id;
    private String name;
    private String surname;
    private String username;
    private String password;
    private String department;
    private Boolean isAdmin;
    private List<Book> books;

    public UserModel(int id, String name, String surname, String username, String password, String department, Boolean isAdmin, List<Book> books) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.department = department;
        this.isAdmin = isAdmin;
        this.books = books;
    }
    
    

    public UserModel() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    
    
    
    
    
}