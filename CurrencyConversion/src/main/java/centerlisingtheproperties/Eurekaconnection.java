package centerlisingtheproperties;
import java.lang.ProcessHandle.Info;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="Multipleinstanse",url="localhost:8209" )
@FeignClient(name="Multipleinstanse")
public interface Eurekaconnection {
	@GetMapping("find/{form}/to/{too}")
	public List<Factor> find(@PathVariable String form,@PathVariable String too);
}