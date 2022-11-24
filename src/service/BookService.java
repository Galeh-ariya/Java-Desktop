/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.BookModel;

/**
 * @author GALEH
 */
public interface BookService {
    
    Boolean add(BookModel model);
    
    Boolean update(BookModel model);
    
    Boolean delete(BookModel model);
    
}
