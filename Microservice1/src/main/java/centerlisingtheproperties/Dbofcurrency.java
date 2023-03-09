package centerlisingtheproperties;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Dbofcurrency extends JpaRepository<Currencyfactor,Integer>{

	public List<Currencyfactor> findByForm(String form);

	public List<Currencyfactor> findByToo(String too);

	public List<Currencyfactor> findByFormAndToo(String form, String too);



}
