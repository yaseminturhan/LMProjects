package Panel;

import Models.BookModel;
import Models.UserModel;
import Service.BookService;
import Service.UserService;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class UserPanel extends javax.swing.JFrame {

    
    private UserService userService = new UserService();
    private BookService bookService = new BookService();
    private List<BookModel> libraryBooksList;
    private List<BookModel> userBooksList;
    private String loginUsername;
    private UserModel usermodel;
    
    public UserPanel(String username) {
        initComponents();
        this.loginUsername = username;
        libraryBooksList = bookService.getAll();
        refreshList(libraryBooksList);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        libraryTable = new javax.swing.JTable();
        listBtn = new javax.swing.JButton();
        takeBook = new javax.swing.JButton();
        filterTxt = new javax.swing.JTextField();
        chooseFilter = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myLibraryTable = new javax.swing.JTable();
        returnBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        libraryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Author", "Category", "PublishDate", "Publisher"
            }
        ));
        jScrollPane2.setViewportView(libraryTable);

        listBtn.setText("LIST BOOKS");
        listBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBtnActionPerformed(evt);
            }
        });

        takeBook.setText("TAKE BOOK");
        takeBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeBookActionPerformed(evt);
            }
        });

        filterTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterTxtActionPerformed(evt);
            }
        });

        chooseFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Name", "Author", "Category" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(takeBook, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(listBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chooseFilter, 0, 141, Short.MAX_VALUE)
                            .addComponent(filterTxt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(chooseFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(filterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(listBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(takeBook)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("kütüphane", jPanel1);

        myLibraryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Author", "Category", "PublishDate", "Publisher"
            }
        ));
        jScrollPane1.setViewportView(myLibraryTable);

        returnBtn.setText("RETURN THE BOOK");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(returnBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(returnBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("kullanıcı", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    
    private static final String FILE_NAME = "books.txt";
    
    private void listBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBtnActionPerformed
        
        List<BookModel> books ;
       
        choosing = chooseFilter.getSelectedItem().toString();
        
        if(choosing == "Name"){
            
           libraryBooksList = bookService.getByName(filterTxt.getText());
           
        }
        else if (choosing == "Author"){
            
          libraryBooksList = bookService.getByAuthor(filterTxt.getText());
        }
        else if (choosing=="Category"){
          libraryBooksList = bookService.getByCategory(filterTxt.getText());
        }
        
        else{
            
            libraryBooksList = bookService.getAll();
        }
        
        refreshList(libraryBooksList);
    }//GEN-LAST:event_listBtnActionPerformed

    private void takeBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeBookActionPerformed
        
        TableModel model = libraryTable.getModel();
        int indexs[] = libraryTable.getSelectedRows();
        
        for(int i=0; i<indexs.length; i++){
            String bookId = model.getValueAt(indexs[i], 0).toString();
            BookModel book = bookService.getById(bookId);
            userService.addBookUser(loginUsername, book);
        }
        
        refreshList(libraryBooksList);
  
    }//GEN-LAST:event_takeBookActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        TableModel model = myLibraryTable.getModel();
        int indexs[] = myLibraryTable.getSelectedRows();
        for(int i=0; i<indexs.length; i++){
            String bookId = model.getValueAt(indexs[i], 0).toString();
            libraryBooksList.add(userService.removeBookUser(loginUsername, bookId));
        }
        
        refreshList(libraryBooksList);
    }//GEN-LAST:event_returnBtnActionPerformed
    
    String choosing;
    
    private void filterTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterTxtActionPerformed
        
        
    }//GEN-LAST:event_filterTxtActionPerformed


    
    private void refreshList(List<BookModel> libraryBooksList){
        
        userBooksList = userService.getUserBooks(loginUsername);
        Collections.sort(libraryBooksList);
        Collections.sort(userBooksList);
        String[] tableColumnNames = {"ID", "Name", "Author", "Publish Date", "Category", "Publisher" };
        DefaultTableModel libraryTableModel = (DefaultTableModel)libraryTable.getModel();
        DefaultTableModel userLibraryTableModel = (DefaultTableModel)myLibraryTable.getModel();
        
        libraryTableModel.getDataVector().removeAllElements();
        userLibraryTableModel.getDataVector().removeAllElements();
        for(int i=0; i<userBooksList.size(); i++){
           for(int j=0; j<libraryBooksList.size(); j++){
               if(userBooksList.get(i).getId().equals(libraryBooksList.get(j).getId())){   
                   libraryBooksList.remove(j);
                   break;
               }
           }
        }

        
        libraryTableModel.setColumnIdentifiers(tableColumnNames);
        for(BookModel book : libraryBooksList){ 
            String[] dataRow = {book.getId(), book.getName(), book.getAuthor(), book.getPublishDate(), book.getCategory(), book.getPublisher() };
            libraryTableModel.addRow(dataRow);
        }
        
        
        userLibraryTableModel.setColumnIdentifiers(tableColumnNames);  
        for(BookModel book : userBooksList){         
            String[] dataRow = {book.getId(), book.getName(), book.getAuthor(), book.getPublishDate(), book.getCategory(), book.getPublisher() };
            userLibraryTableModel.addRow(dataRow);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chooseFilter;
    private javax.swing.JTextField filterTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable libraryTable;
    private javax.swing.JButton listBtn;
    private javax.swing.JTable myLibraryTable;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton takeBook;
    // End of variables declaration//GEN-END:variables
}
