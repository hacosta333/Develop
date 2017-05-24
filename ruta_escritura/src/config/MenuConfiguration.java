package config;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("configuration")

public class MenuConfiguration {
	@XStreamImplicit(itemFieldName="opcion")	
	private List options  = new ArrayList();

	public List getOptions() {
		return options;
	}

	public void setOptions(List options) {
		this.options = options;
	}
	
}
