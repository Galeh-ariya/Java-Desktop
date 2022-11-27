package service;

import entity.BookModel;

/**
 * @author GALEH
 */
public interface BookService {
    
    BookModel[] getAll();
    
    Boolean add(String id, String name, String stock, String price);
    
    Boolean update(String id, String name, String stock, String price);
    
    Boolean delete(String id);
    
}
