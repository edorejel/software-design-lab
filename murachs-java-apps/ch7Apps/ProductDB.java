package murachsJavaProg.ch7Apps;
/*
* This class is supposed to function as a database. Normally, you would use other software for your programming and data storage needs. Other software could be MySQL.
*
*/
public class ProductDB {
	public static Product getProduct(String productCode) {

		//create the Product object
		Product p = new Product();

		p.setCode(productCode);
		if (productCode.equalsIgnoreCase("java")) {

			p.setDescription("Murach's Beginning Java");
			p.setPrice(49.50);
		}
		else if (productCode.equalsIgnoreCase("jsps")) {

			p.setDescription(("Murach's Java Servlets and JSP"));
			p.setPrice(49.50);
		}
		else if (productCode.equalsIgnoreCase("mcb2")) {

			p.setDescription(("Murach's Java Servlets and JSP"));
			p.setPrice(59.50);
		}
		else {
			p.setDescription("Unknown");
		}
		return p;
	}

}
