package centerlisingtheproperties;

public class Newcurrency {private int id; 
private String form;
private String too;
private int multiple;
private String portnum ;
private int quantity;
private int totalamount;

public Newcurrency(int id,String form, String too, int multiple,int quantity, int totalamount,String portnum) {
	// TODO Auto-generated constructor stub
  this.id=id;
	 this.form=form;
	 this.too=too;
	 this.multiple=multiple;
	 this.portnum=portnum;
	 this.totalamount=  totalamount;
	 this.quantity=quantity;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getTotalamount() {
	return totalamount;
}
public void setTotalamount(int totalamount) {
	this.totalamount = totalamount;
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
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void setToo(String too) {
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

}
