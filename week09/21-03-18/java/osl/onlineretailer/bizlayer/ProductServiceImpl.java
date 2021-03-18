package osl.onlineretailer.bizlayer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import osl.onlineretailer.models.Product;
import osl.onlineretailer.datalayer.ProductRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    public ProductServiceImpl(@Qualifier("productRepositoryInMemory") ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public double calculateTotalValue() {
        return repository.getAllProducts()
                        .stream()
                        .mapToDouble(p -> p.getPrice() * p.getInStock())
                        .sum();

//        double total = 0.0;
//        for (Product p : repository.getAllProducts()) {
//            double linePrice = p.getPrice() * p.getInStock();
//            total += linePrice;
//        }
//        return total;
    }

    @Override
    public Collection<Product> getLowStockProducts(long threshold) {
        return repository.getAllProducts()
                .stream()
                .filter(p -> p.getInStock() < threshold)
                .collect(Collectors.toList());

//        List<Product> lowStockProducts = new ArrayList<>();
//        for (Product p : repository.getAllProducts()) {
//            if (p.getInStock() < threshold) {
//                lowStockProducts.add(p);
//            }
//        }
//        return lowStockProducts;
    }

    @Override
    public double getAveragePrice() {
        return repository.getAllProducts()
                         .stream()
                         .mapToDouble(p -> p.getPrice())
                         .average()
                         .orElse(0.0);
    }

    @Override
    public void adjustPriceByPercent(long id, double byPercent) {
        Product theProduct = repository.getProductById(id);
        if (theProduct == null) {
            return;
        }
        else {
            theProduct.adjustPriceByPercent(byPercent);
            repository.updateProduct(theProduct);
        }
    }
}
