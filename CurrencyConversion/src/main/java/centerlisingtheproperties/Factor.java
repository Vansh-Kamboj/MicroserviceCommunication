package centerlisingtheproperties;

public class Factor {

	private int id; 
	 private String form;
	 private String too;
	 private int multiple;
	 private String portnum ;
	 
	public Factor(int id,String form, String too, int multiple) {
		// TODO Auto-generated constructor stub
	   this.id=id;
		 this.form=form;
		 this.too=too;
		 this.multiple=multiple;

	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getToo() {
		return too;
	}
	public void setTo(String too) {
		this.too = too;
	}
	public int getMultiple() {
		return multiple;
	}
	public void setMultiple(int multiple) {
		this.multiple = multiple;
	}
	public String getPortnum() {
		return portnum;
	}
	public void setPortnum(String portnum) {
		this.portnum = portnum;
	}
	public Factor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setToo(String too) {
		this.too = too;
	}
	 
	}

