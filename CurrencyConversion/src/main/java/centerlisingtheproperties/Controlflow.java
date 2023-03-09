package centerlisingtheproperties;
//import java.net.http.HttpHeaders;
//import java.net.http.HttpHeaders;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controlflow {
	
	static RestTemplate restTemplate=new RestTemplate();
	@Autowired
	private Eurekaconnection proxy;
	
@GetMapping("convert/{form}/to/{too}/{quantity}") 
public Newcurrency convert(@PathVariable String form,@PathVariable String too,@PathVariable int quantity) {
	List<Factor> currencyConversion =  (List<Factor>) proxy.find(form,too);
System.out.println(currencyConversion);
Factor fy=new Factor();
for(Factor f:currencyConversion) {
	if(f!=null) {
		fy=f;
	}
}
return new Newcurrency(fy.getId(), 
		form, too, quantity, 
		fy.getMultiple(), 
		quantity*(fy.getMultiple()), 
		fy.getPortnum() + " " + "feign");
}

}
