/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    public Boolean add(BookModel model) {
        
        BookRepository repo = new BookRepositoryImpl();
        var result = repo.add(model);
        
        if(result) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean update(BookModel model) {
        
        BookRepository repo = new BookRepositoryImpl();
        var result = repo.update(model);
        
        if(result) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean delete(BookModel model) {
        
        BookRepository repo = new BookRepositoryImpl();
        var result = repo.delete(model);
        
        if(result) {
            return true;
        } else {
            return false;
        }  
    }
    
}
