package config;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import config.MenuConfigurationItem;


@XStreamAlias("opcion")

public class MenuConfigurationItem {

	@XStreamAlias("order")	
	private int order; 
 
	@XStreamAlias("nombre")	
	private String nombre; 
	
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}

	public String getName() {
		return nombre;
	}
	public void setName(String name) {
		this.nombre = name;
	}
	
}
