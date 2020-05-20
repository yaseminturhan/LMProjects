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


     /*public UserModel getByDepartment(String department) {
        String line = super.readLineById(USERS_FILE, department);
        return toUser(line);
    }
    */

    @Override
    public void save(UserModel t) {
        String lines = t.getId() + "___" + t.getName() + "___" + t.getSurname()+ "___" + t.getUsername()+ "___" + t.getPassword()+ "___" + t.getDepartment()+ "___" + t.getIsAdmin();
        super.writeFile(USERS_FILE,lines);
    }

    @Override
    public void save(UserModel t, String id) {
                
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
    
    public ArrayList<String> readLines(String fileName) {
		ArrayList<String> lines = new ArrayList<>();
		try {
			BufferedReader bufferedReader = new BufferedReader(this.getFileReader(USERS_FILE));
			String line;
			while((line = bufferedReader.readLine()) != null) {
				lines.add(line);
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
    
    	private FileReader getFileReader(String fileName) throws IOException {
		File file = new File(fileName);
		if(!file.exists()) {
			file.createNewFile();
		}
		return new FileReader(file.getAbsoluteFile());
	}
        
        
    
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
           
            UserModel user = new UserModel(
                Integer.valueOf(datas[0]),
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
                Boolean.valueOf(datas[6])
                
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

    /*@Override
    public UserModel getByUsername(String username) {
        String line = super.readLineById(USERS_FILE, username);
        return toUser(line);
    }*/

    
    
    
 
    
    

    
}