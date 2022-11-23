package repository;

import entity.BookModel;

/**
 *
 * @author GALEH
 */
public interface BookRepository {
    
    BookModel[] getAll();
    
    Boolean add(BookModel model);
    
    Boolean update(BookModel model);
    
    Boolean delete(BookModel model);
    
}
