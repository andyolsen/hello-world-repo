package osl.onlineretailer.datalayer;

import org.springframework.stereotype.Repository;
import osl.onlineretailer.models.Product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepositoryInMemory implements ProductRepository {

    private Map<Long, Product> catalog = new HashMap<>();
    private static long nextId = 1;

    public ProductRepositoryInMemory() {
        insertProduct(new Product("Lamborghini Sian", 2.2e6, 3));
        insertProduct(new Product("Bugatti Divo", 4e6, 5));
        insertProduct(new Product("Jaguar I-Pace", 80_000, 10));
    }

    @Override
    public Collection<Product> getAllProducts() {
        return catalog.values();
    }

    @Override
    public Product getProductById(long id) {
        return catalog.get(id);
    }

    @Override
    public Product insertProduct(Product product) {
        // Precondition.
        if (product.getId() != -1) {
            throw new IllegalArgumentException("id for product-to-be-inserted must be -1");
        }
        product.setId(nextId++);
        catalog.put(product.getId(), product);
        return product;
    }

    @Override
    public boolean updateProduct(Product product) {
        long id = product.getId();
        if (!catalog.containsKey(id)) {
            return false;
        }
        else {
            catalog.replace(id, product);
            return true;
        }
    }

    @Override
    public boolean deleteProduct(long id) {
        if (!catalog.containsKey(id)) {
            return false;
        }
        else {
            catalog.remove(id);
            return true;
        }
    }
}
