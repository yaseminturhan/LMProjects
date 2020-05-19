/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import ClassImplemantation.FileProcess;
import Interface.BookRepository;
import Models.Book;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class BookService extends FileProcess implements BookRepository{
    
    private static final String FILE_NAME = "books.txt";
    
    @Override
    public Book getById(String id) {
        String line = super.readLineById(FILE_NAME, id);
        return toBook(line);        
    }

    @Override
    public List<Book> getByCategory(String category) {
        List<String> lines = super.readLinesByCategory(FILE_NAME, category);
        return allToBook(lines);
    }

    @Override
    public List<Book> getByPublisher(String publisher) {
        List<String> lines = super.readLinesByPublisher(FILE_NAME, publisher);
        return allToBook(lines);
    }

    @Override
    public List<Book> getByAuthor(String author) {
        List<String> lines = super.readLinesByAuthor(FILE_NAME, author);
        return allToBook(lines);
    }

    @Override
    public void save(Book book) {
        String lines = book.getId() + "___" + book.getName() + "___" + book.getAuthor() + "___" + book.getPublishDate() + "___" + book.getCategory() + "___" + book.getPublisher();
        super.writeFile(FILE_NAME,lines);
    }

    @Override
    public void save(Book book, String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(String id, Book book) {
        String line = super.readLineById(FILE_NAME, id);
        Book bookToUpdate = toBook(line);
        bookToUpdate.setAuthor(book.getAuthor());
        bookToUpdate.setCategory(book.getCategory());
        bookToUpdate.setName(book.getName());
        bookToUpdate.setPublishDate(book.getPublishDate());
        bookToUpdate.setPublisher(book.getPublisher());
        save(bookToUpdate);
    }

    @Override
    public void delete(String id) {
        super.deleteLine(FILE_NAME, id);
    }

    @Override
    public List<Book> getAll() {
        
        List<String> lines = super.readLines(FILE_NAME);   
        return allToBook(lines);
    }
    
    
    private Book toBook(String line){
        String[] datas = line.split("___");
        return new Book(
                datas[0],
                datas[1],
                datas[2],
                datas[3],
                datas[4],
                datas[5]
        ); 
        
    }
    
    private List<Book> allToBook(List<String> lines){
        List<Book> books = new ArrayList<>();
        for(String line : lines){
            String[] datas = line.split("___");
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
}
