/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import Interface.UserRepository;
import Interface.BookRepository;
import Models.UserModel;
import java.util.List;
import ClassImplemantation.FileProcess;
import java.util.ArrayList;
import java.util.Random;
import Models.Book;
import java.util.Date;
import Service.UserService;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.nio.file.Files.lines;
/**
 *
 * @author HP
 */

/**
 *
 * @author HP
 */
public class UserService extends FileProcess implements UserRepository{
    
    private static final String USERS_FILE = "userdeneme.txt";
    private BookService bookService = new BookService();
    
     /*public UserModel getByDepartment(String department) {
        String line = super.readLineById(USERS_FILE, department);
        return toUser(line);
    }
    */

    @Override
    public void save(UserModel t) {
        int id = super.getLastId(USERS_FILE);
        t.setId(String.valueOf(id));
        super.writeFile(USERS_FILE,t.toString());
        super.writeFile(t.getUsername()+".txt", "");
    }

    @Override
    public void save(UserModel t, String id) {
        t.setId(id);
        super.writeFile(USERS_FILE,t.toString());
    }
    
    

    @Override
    public void update(String id, UserModel t) {
        String line = super.readLineById(USERS_FILE, id);
        UserModel userupdate = toUser(line);
        userupdate.setId(t.getId());
        userupdate.setName(t.getName());
        userupdate.setSurname(t.getSurname());
        userupdate.setUsername(t.getUsername());
        userupdate.setPassword(t.getPassword());
        userupdate.setIsAdmin(t.getIsAdmin());
        save(userupdate);
    }
    
    
    public void delete(String id) {
        super.deleteLine(USERS_FILE, id); 
    }
    
    
    

    @Override
    public List<UserModel> getAll() {
        List<String> lines = super.readLines(USERS_FILE);
        return allToUser(lines);
    }
    
    private List<UserModel> allToUser(List<String> lines){
        
        List<UserModel> users = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        System.out.println(lines.size());
        if(lines.size() == 0){
            return users;
        }else{
            for(String line: lines){
                String[] datas = line.split("___");
                UserModel user = new UserModel(
                    datas[0],
                    datas[1],
                    datas[2],
                    datas[3],
                    datas[4],
                    datas[5],
                    Boolean.valueOf(datas[6])
                );
                users.add(user);
            }
            return users;
        }
        
       
       
    }
    
    private UserModel toUser(String line){
        //datas[3] kullanıcı adı olan dosyayı bulmak için
        String[] datas = line.split("___");
        List<String> userBooks = super.readLines(datas[3]+".txt");
        List<Book> books = new ArrayList<>();
        
        return new UserModel(
                datas[0],
                datas[1],
                datas[2],
                datas[3],
                datas[4],
                datas[5],
                Boolean.valueOf(datas[6])  
        );
        
    }
    
   


    @Override
    public UserModel getById(String id) {
        String line = super.readLineById(USERS_FILE, id);
        return toUser(line);
    }

    /*@Override
    public UserModel getByUsername(String username) {
        String line = super.readLineById(USERS_FILE, username);
        return toUser(line);
    }*/

    @Override
    public void addBookUser(String username,Book book) {
        String fileName = username+".txt";
        super.writeFile(fileName, book.toString());
        
    }

    @Override
    public List<Book> getUserBooks(String username) {
        return bookService.allToBook(super.readLines(username+".txt"));
    }

    
    
    
 
    
    

    
}