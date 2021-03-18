package osl.onlineretailer.datalayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SeedDb {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@PostConstruct
	public void init() {
		jdbcTemplate.update("insert into PRODUCTS (description, price, in_stock) values (?, ?, ?)", new Object[]{"Sian", 2.2e6, 9});
        jdbcTemplate.update("insert into PRODUCTS (description, price, in_stock) values (?, ?, ?)", new Object[]{"Divo", 4.2e6, 1});
        jdbcTemplate.update("insert into PRODUCTS (description, price, in_stock) values (?, ?, ?)", new Object[]{"Porsche", 800_000, 18});
    }
}
