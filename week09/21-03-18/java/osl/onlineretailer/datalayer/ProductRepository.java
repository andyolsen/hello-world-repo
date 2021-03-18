package osl.onlineretailer.datalayer;

import osl.onlineretailer.models.Product;

import java.util.Collection;

public interface ProductRepository {
    // Create, Read, Update, Delete

    Collection<Product> getAllProducts();
    Product getProductById(long id);

    Product insertProduct(Product product);
    boolean updateProduct(Product product);
    boolean deleteProduct(long id);
}
