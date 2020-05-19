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
import ClassImplemantation.Global;
import ClassImplemantation.User;
import java.util.ArrayList;
import java.util.Random;
import ClassImplemantation.TakeInformation;
import Models.Book;
import java.util.Date;

/**
 *
 * @author HP
 */

/**
 *
 * @author HP
 */
public class UserService extends FileProcess implements UserRepository{
    
    private static final String USERS_FILE = "users.txt";


     public UserModel getByDepartment(String department) {
        String line = super.readLineById(USERS_FILE, department);
        return toUser(line);
    }
    

    @Override
    public void save(UserModel t) {
        
    }

    @Override
    public void save(UserModel t, String id) {
                t.setId(Integer.parseInt(id));
		super.writeFile(USERS_FILE, t.toString());
    }

    @Override
    public void update(String id, UserModel t) {
        String temp =id;
	delete(id);
	this.save(t,temp); 
    }

    @Override
    public void delete(String id) {
        super.deleteLine(USERS_FILE, id); 
    }
    
    private List<Book> allToBook(List<String> lines){
        List<Book> books = new ArrayList<>();
        for(String line : lines){
            String[] datas = line.split("_");
            Book book = new Book(
                    datas[0],
                    datas[1],
                    datas[2],
                    datas[3],
                    datas[4],
                    datas[5]
            );        
            books.add(book);
        }
        return books;
    }

    @Override
    public List<UserModel> getAll() {
        List<String> lines = super.readLines(USERS_FILE);
        return allToUser(lines);
    }
    
    private List<UserModel> allToUser(List<String> lines){
        
        List<UserModel> users = new ArrayList<>();
        for(String line: lines){
            String[] datas = line.split("_");
            List<String> userBooks = super.readLines(datas[3]+".txt");
            UserModel user = new UserModel(
                Integer.valueOf(datas[0]),
                datas[1],
                datas[2],
                datas[3],
                datas[4],
                datas[5],
                Boolean.valueOf(datas[6]),
                allToBook(userBooks)
            );
        }
        
        return users;
       
       
    }
    
    private UserModel toUser(String line){
        //datas[3] kullanıcı adı olan dosyayı bulmak için
        String[] datas = line.split("_");
        List<String> userBooks = super.readLines(datas[3]+".txt");
        
        return new UserModel(
                Integer.valueOf(datas[0]),
                datas[1],
                datas[2],
                datas[3],
                datas[4],
                datas[5],
                Boolean.valueOf(datas[6]),
                allToBook(userBooks)
        );
        
    }
    
    private Book toBook(String line){
        String[] datas = line.split("_");
        return new Book(
                datas[0],
                datas[1],
                datas[2],
                datas[3],
                datas[4],
                datas[5]
        ); 
        
    }
    


    @Override
    public UserModel getById(String id) {
        String line = super.readLineById(USERS_FILE, id);
        return toUser(line);
    }

    @Override
    public UserModel getByUsername(String username) {
        String line = super.readLineById(USERS_FILE, username);
        return toUser(line);
    }
    
    
 
    
    

    
}