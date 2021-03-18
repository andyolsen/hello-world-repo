package osl.onlineretailer.datalayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import osl.onlineretailer.models.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
public class ProductRepositoryInDatabase implements ProductRepository {

    // This is the "EntityManager" equivalent of @Autowired.
    // it uses the EntityManagerFactory bean implicitly to create an EntityManager object for us.
    @PersistenceContext
    private EntityManager entityManager;

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
