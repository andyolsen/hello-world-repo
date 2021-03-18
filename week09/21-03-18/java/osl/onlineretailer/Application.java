package osl.onlineretailer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import osl.onlineretailer.bizlayer.ProductService;
import osl.onlineretailer.datalayer.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
//
//		ProductService service = ctx.getBean(ProductService.class);
//		service.adjustPriceByPercent(1, 10);
//
//		double totalValue = service.calculateTotalValue();
//		System.out.println(totalValue);
//
//		double averagePrice = service.getAveragePrice();
//		System.out.println(averagePrice);
//
//		ProductRepository repo = ctx.getBean("productRepositoryInMemory", ProductRepository.class);
//		repo.getAllProducts()
//			.stream()
//			.forEach(p -> System.out.println(p));
	}
}
