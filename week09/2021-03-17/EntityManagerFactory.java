package demo.configurationclasses;

public class EntityManagerFactory {

    private DataSource dataSource;

    public EntityManagerFactory(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
