package repository;

import entity.BookModel;
import util.DatabaseConnect;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GALEH
 */
public class BookRepositoryImpl implements BookRepository{
     List<BookModel> model = new ArrayList<>();

//     Method menampilkan
    @Override
    public BookModel[] getAll() {
         String sql = "SELECT * FROM book";
         
       
        try(Connection conn = DatabaseConnect.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql)) { 
            
           
            
            while(result.next()) {
                BookModel bm = new BookModel();
                bm.setId(result.getString("id"));
                bm.setName(result.getString("name"));
                bm.setStock(result.getInt("stock"));
                bm.setPrice(result.getInt("price"));
                
                model.add(bm);
            }
            
           
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
       
        return model.toArray(new BookModel[]{});
        
    }

    
//    Method tambah
    @Override
    public Boolean add(BookModel model) {
        
        String sql = "INSERT INTO book (id, name, stock, price) VALUES (?, ?, ?, ?)";
        int result = 0;
        
        try(Connection conn = DatabaseConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, model.getId());
            ps.setString(2, model.getName());
            ps.setInt(3, model.getStock());
            ps.setInt(4, model.getPrice());
            result = ps.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        
         return result > 0;
        
    }

//    method update data
    @Override
    public Boolean update(BookModel model) {
        
        String sql = "UPDATE book SET name = ?, stock = ?, price = ?  WHERE id = ?";
        int result = 0;
        
        try(Connection conn = DatabaseConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, model.getName());
            ps.setInt(2, model.getStock());
            ps.setInt(3, model.getPrice());
            ps.setString(4, model.getId());
            
            result = ps.executeUpdate();
            
        }catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        
        return result > 0;
        
    }

    
//    Method Delete data
    @Override
    public Boolean delete(BookModel model) {
        
        String sql = "DELETE FROM book WHERE id  = ?";
        int result = 0;
        
        try(Connection conn = DatabaseConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, model.getId());
            
            result = ps.executeUpdate();
            
        }catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        
        return result > 0;
    } 
    
}
    
