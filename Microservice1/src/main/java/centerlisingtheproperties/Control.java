package centerlisingtheproperties;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.cloud.config.environment.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Control {
	 @Autowired
	 private JdbcTemplate temp;
	@Autowired
	private Dbofcurrency pack;
	@Autowired
	private Environment en;
	private static  String Insert=
		 """ 
	SELECT *FROM Currencyfactor WHERE (form =? AND too= ?);""";

	@GetMapping("factor/{from}/to/{to}")
	public Currencyfactor factor(@PathVariable String from,@PathVariable String to) {
		String PropPort=en.getProperty("local.server.port");
		Currencyfactor ob1=new Currencyfactor(11,"ger","ind",18);
		ob1.setPortnum(PropPort);
		pack.save(ob1);
		return ob1;
	}

	@GetMapping("find/{form}/to/{too}")
	public List<Currencyfactor> find(@PathVariable String form,@PathVariable String too) {
		//System.out.println(form);
		// return pack.findByForm(form);
		//return pack.findByToo(too);
		System.out.println( pack.findByFormAndToo(form,too));
		return pack.findByFormAndToo(form,too);
		//return pack.findAll();
	}
}
