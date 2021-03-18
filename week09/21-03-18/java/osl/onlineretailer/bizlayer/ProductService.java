package osl.onlineretailer.bizlayer;

import osl.onlineretailer.models.Product;

import java.util.Collection;

public interface ProductService {
    double calculateTotalValue();
    Collection<Product> getLowStockProducts(long threshold);
    double getAveragePrice();
    void adjustPriceByPercent(long id, double byPercent);
}
