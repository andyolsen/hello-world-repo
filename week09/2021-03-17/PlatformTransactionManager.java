package demo.configurationclasses;

public class PlatformTransactionManager {

    private DataSource dataSource;

    public PlatformTransactionManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
