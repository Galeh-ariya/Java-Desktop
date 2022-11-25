package view;

import entity.BookModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repository.BookRepository;
import repository.BookRepositoryImpl;
import service.BookService;
import service.BookServiceImpl;

/**
 *
 * @author GALEH
 */
public class BookView extends javax.swing.JFrame {


    public BookView() {
        initComponents();
        getData();
    }
    
     public void getData() {
        BookRepository repo = new BookRepositoryImpl();
        BookModel[] data = repo.getAll();
        
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("id");
        tb.addColumn("name");
        tb.addColumn("stock");
        tb.addColumn("price");
        jTable1.setModel(tb);
        
        for(var i : data) {
               tb.addRow(new Object[]{
                   i.getId(),
                   i.getName(),
                   i.getStock(),
                   i.getPrice()
               });
        }
        
    }
     
    public void clear() {
        idbook.setText("");
        name.setText("");
        stock.setText("");
        price.setText("");
    }
    
    public void refresh() {
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        tb.setRowCount(0);
        getData();
    }
     
// ============================================================================
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idbook = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        price = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Book Aplication");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("ID Book");

        jLabel3.setText("Name");

        jLabel4.setText("Stock    ");

        jLabel5.setText("Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idbook, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(349, 349, 349))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// ============================================================================
    
//    Tombol Simpan data
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        if(stock.getText().equals("") && price.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Failed Insert Data!");
        } else {
            String id = idbook.getText();
            String nama = name.getText();
            int stok =  Integer.parseInt(stock.getText());
            int harga = Integer.parseInt(price.getText());

            BookModel book = new BookModel();
            book.setId(id);
            book.setName(nama);
            book.setStock(stok);
            book.setPrice(harga);

    //        BookRepository repo = new BookRepositoryImpl();
    //        var result = repo.add(book);
            BookService service = new BookServiceImpl();
            var result = service.add(book);


            if(result == true) {
                JOptionPane.showMessageDialog(null, "Success Insert Data!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed Insert Data!");
            }
        }
        
        refresh();
        
        clear();
    }//GEN-LAST:event_addActionPerformed

    
//   ambil data dari table dengan cara klik (tombol select)
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.rowAtPoint(evt.getPoint());
        
        String id = jTable1.getValueAt(row,0).toString();
        idbook.setText(id);
        
        String nama = jTable1.getValueAt(row, 1).toString();
        name.setText(nama);
        
        String stok = jTable1.getValueAt(row, 2).toString();
        stock.setText(stok);
        
        String harga = jTable1.getValueAt(row, 3).toString();
        price.setText(harga);
    }//GEN-LAST:event_jTable1MouseClicked

//    Method tombol Update
    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        
        if(stock.getText().equals("") && price.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Failed Update data!");
        } else {
            String id = idbook.getText();
            String nama = name.getText();
            int stok =  Integer.parseInt(stock.getText());
            int harga = Integer.parseInt(price.getText());

            BookModel book = new BookModel();
            book.setId(id);
            book.setName(nama);
            book.setStock(stok);
            book.setPrice(harga);

    //        BookRepository repo = new BookRepositoryImpl();
    //        var result = repo.update(book);

            BookService service = new BookServiceImpl();
            var result = service.update(book);

            if(result == true) {
                JOptionPane.showMessageDialog(null, "Success Update Data!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed Update data!");
            }
        }
        
        refresh();
        
        clear();
    }//GEN-LAST:event_updateMouseClicked

//    Tombol Hapus data
    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        String id = idbook.getText();
        
        if(id.equals("")) {
            JOptionPane.showMessageDialog(null, "Failed Delete data!");
        } else {
            BookModel book = new BookModel();
            book.setId(id);

    //        BookRepository repo = new BookRepositoryImpl();
    //        var result = repo.delete(book);
            BookService service = new BookServiceImpl();
            var result = service.delete(book);


            if(result == true) {
                JOptionPane.showMessageDialog(null, "Success Delete Data!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed Delete data!");
            }
        }
        
        refresh();
        
        clear();
    }//GEN-LAST:event_deleteMouseClicked
  
    
        
//    ==========================================================================
     
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JTextField idbook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField stock;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
