package Panel;

import Models.BookModel;
import Models.UserModel;
import Service.BookService;
import Service.UserService;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AdminPage extends javax.swing.JFrame {

    
    private UserService userService = new UserService();
    private BookService bookService = new BookService();
    private List<UserModel> userList;
    private List<BookModel> bookList;

    
    public AdminPage() {
        
        initComponents();
        
        userList =  userService.getAll();
        Collections.sort(userList);
        String[] userColumnNames = {"ID", "Name", "Surname", "Username", "Department" };
        DefaultTableModel userTableModel = (DefaultTableModel)userTable.getModel();
        userTableModel.setColumnIdentifiers(userColumnNames);
            
        for(UserModel user: userList){
            String[] dataRow = {String.valueOf(user.getId()), user.getName(), user.getSurname(), user.getUsername(), user.getDepartment() };
            userTableModel.addRow(dataRow);
        }
        
        bookList = bookService.getAll();
        Collections.sort(bookList);
        String[] bookColumnNames = {"ID", "Name", "Author", "Publish Date", "Category", "Publisher" };
        DefaultTableModel bookTableModel = (DefaultTableModel)bookTable.getModel();
        bookTableModel.setColumnIdentifiers(bookColumnNames);
        
        for(BookModel book: bookList){
            String[] dataRow = {String.valueOf(book.getId()), book.getName(), book.getAuthor(), book.getPublishDate(), book.getCategory(), book.getPublisher() };
            bookTableModel.addRow(dataRow);
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        addUserButton = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        userBooksButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        addBookButton = new javax.swing.JButton();
        editBookButton = new javax.swing.JButton();
        deleteBookButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Username", "Department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(userTable);

        addUserButton.setText("Add User");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        editUserButton.setText("Edit User");
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });

        deleteUserButton.setText("Delete User");
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });

        userBooksButton.setText("User Books");
        userBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBooksButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(deleteUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userBooksButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(addUserButton)
                .addGap(18, 18, 18)
                .addComponent(editUserButton)
                .addGap(18, 18, 18)
                .addComponent(deleteUserButton)
                .addGap(18, 18, 18)
                .addComponent(userBooksButton)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Users", jPanel2);

        addBookButton.setText("Add Book");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        editBookButton.setText("Edit Book");
        editBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBookButtonActionPerformed(evt);
            }
        });

        deleteBookButton.setText("Delete Book");
        deleteBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookButtonActionPerformed(evt);
            }
        });

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Author", "Publish Date", "Catregory", "Publisher"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bookTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(deleteBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(addBookButton)
                .addGap(18, 18, 18)
                .addComponent(editBookButton)
                .addGap(18, 18, 18)
                .addComponent(deleteBookButton)
                .addContainerGap(173, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Library", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBooksButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        int selectedRowIndex = userTable.getSelectedRow();
        String username = model.getValueAt(selectedRowIndex, 3).toString();
        new UserBooksPage(username).setVisible(true);
        dispose();
    }//GEN-LAST:event_userBooksButtonActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        new UserPage().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        int selectedRowIndex = userTable.getSelectedRow();
        UserModel userToUpdate = userService.getById(model.getValueAt(selectedRowIndex, 0).toString());
        System.out.println("gelen "+userToUpdate.getName());
        new UserPage(userToUpdate).setVisible(true);
        dispose();
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        
       DefaultTableModel model = (DefaultTableModel) userTable.getModel();
       int selectedRowIndex = userTable.getSelectedRow();
       userService.delete(model.getValueAt(selectedRowIndex, 0).toString(),model.getValueAt(selectedRowIndex, 3).toString());
       model.removeRow(selectedRowIndex);
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        new BookPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void editBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBookButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
        int selectedRowIndex = bookTable.getSelectedRow();
        BookModel bookToUpdate = bookService.getById(model.getValueAt(selectedRowIndex, 0).toString());
        new BookPage(bookToUpdate).setVisible(true);
        dispose();
    }//GEN-LAST:event_editBookButtonActionPerformed

    private void deleteBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
        int selectedRowIndex = bookTable.getSelectedRow();
        bookService.delete(model.getValueAt(selectedRowIndex, 0).toString());
        model.removeRow(selectedRowIndex);
    }//GEN-LAST:event_deleteBookButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        new LoginPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed
    
    public void setTabIndex(int index){
        
        jTabbedPane1.setSelectedIndex(index);
        setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JButton addUserButton;
    private javax.swing.JTable bookTable;
    private javax.swing.JButton deleteBookButton;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JButton editBookButton;
    private javax.swing.JButton editUserButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton userBooksButton;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
