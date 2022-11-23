
import entity.BookModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DatabaseConnect;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import repository.BookRepository;
import repository.BookRepositoryImpl;
import view.BookView;

/**
 *
 * @author GALEH
 */
public class MainApp {
    
    public static void main(String[] args) throws SQLException {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookView().setVisible(true);
            }
        });
        
        
//        Test COnnection
        
//        try {
//            Connection conn = DatabaseConnect.getConnection();
//            Statement stm = conn.createStatement();
//            
//            System.out.println("Connection Success");
//            
//            stm.close();
//            conn.close();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
//        }


//          Test Repository
            
//           BookRepository repo = new BookRepositoryImpl();
//           BookModel[] data = repo.getAll();
//           
//           for(var i : data) {
//               System.out.println("Data: " + i.getId());
//           }

        
    }
}
