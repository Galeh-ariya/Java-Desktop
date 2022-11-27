package service;

import entity.BookModel;
import repository.BookRepository;
import repository.BookRepositoryImpl;

/**
 *
 * @author GALEH
 */
public class BookServiceImpl implements BookService {

    @Override
    public BookModel[] getAll() {
        BookRepository repo = new BookRepositoryImpl();
        BookModel[] result = repo.getAll();
        return result;
    }
    
    

    @Override
    public Boolean add(String id, String name, String stock, String price) {
        
        int stok;
        int harga;
        
        try{
          stok = Integer.parseInt(stock);
          harga = Integer.parseInt(price);  
        } catch(NumberFormatException ex) {
            return false;
        }
        
        
        BookModel model= new BookModel();
        model.setId(id);
        model.setName(name);
        model.setStock(stok);
        model.setPrice(harga);
        
        
        BookRepository repo = new BookRepositoryImpl();
        var result = repo.add(model);
        
        if(result) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean update(String id, String name, String stock, String price) {
        
        int stok;
        int harga;
        
        try{
          stok = Integer.parseInt(stock);
          harga = Integer.parseInt(price);  
        } catch(NumberFormatException ex) {
            return false;
        }
        
        BookModel model= new BookModel();
        model.setId(id);
        model.setName(name);
        model.setStock(stok);
        model.setPrice(harga);
        
        BookRepository repo = new BookRepositoryImpl();
        var result = repo.update(model);
        
        if(result) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean delete(String id) {
        
        BookModel model= new BookModel();
        model.setId(id);
        
        BookRepository repo = new BookRepositoryImpl();
        var result = repo.delete(model);
        
        if(result) {
            return true;
        } else {
            return false;
        }  
    }
    
}
