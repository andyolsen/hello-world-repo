package demo.fullstackapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/destinations")
@CrossOrigin
public class DestinationController {

	@Autowired
	private DestinationRepository destinationRepository;

	@Autowired
	private ReviewRepository reviewRepository;

	@GetMapping(produces={"application/json","application/xml"})
	public ResponseEntity<Iterable<Destination>> getDestinations() {
		return ResponseEntity.ok().body(destinationRepository.findAll());
	}

	@GetMapping(
			value="/{id}",
			produces={"application/json","application/xml"})
	public ResponseEntity<Destination> getDestinationById(@PathVariable long id) {
		Optional<Destination> destination = destinationRepository.findById(id);
		if (destination.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok().body(destination.get());
		}
	}

	@PutMapping(
			value="/addReviewForDestination/{destinationId}",
			consumes={"application/json","application/xml"},
			produces={"application/json","application/xml"}
	)
	public ResponseEntity<Void> addReviewForDestination(@PathVariable long destinationId, @RequestBody Review review) {
		Optional<Destination> destination = destinationRepository.findById(destinationId);
		if (destination.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		else {
			review.setDestination(destination.get());
			reviewRepository.save(review);
			return ResponseEntity.ok().build();
		}
	}
}
