package osl.onlineretailer.datalayer;

import org.springframework.stereotype.Repository;
import osl.onlineretailer.models.Product;

import java.util.Collection;

@Repository
public class ProductRepositoryInDatabase implements ProductRepository {

    @Override
    public Collection<Product> getAllProducts() {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public Product getProductById(long id) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public Product insertProduct(Product product) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public boolean updateProduct(Product product) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public boolean deleteProduct(long id) {
        throw new RuntimeException("Not implemented yet");
    }
}
