package bean;

import entities.Product;
import java.util.List;

public interface IProduct {
    List<Product> findAll();

    Product findOne(String id);

    List<Product> findByName(String name);
    
   
    
}
