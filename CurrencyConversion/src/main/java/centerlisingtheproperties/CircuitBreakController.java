package centerlisingtheproperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakController {
	private Logger logger=LoggerFactory.getLogger(CircuitBreakController.class );
@GetMapping("/breaktest")
@Retry(name="Breakattempt",fallbackMethod="errorresponse")
public String control() {
	logger.info("Sample api call received");
ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/some-dummy-url", 
				String.class);
	return forEntity.getBody();
//	return "Testing ";
}
public String errorresponse(Exception e) {
	return "their is some error";
}
}
