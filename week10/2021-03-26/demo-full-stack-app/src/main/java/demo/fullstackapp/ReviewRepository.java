package demo.fullstackapp;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository<Review,Long> {
    List<Review> findByDestination(Destination destination);
}
