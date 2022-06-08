package dominio;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String cuit;
	private List<Empleado> empleados; //= new ArrayList<Empleado>();
	private String razonSocial;
	
	public Empresa() {
		this.empleados = new ArrayList<Empleado>();
	}

	
	public void setCuit(String cuit) {
		this.cuit = cuit;

	}
	
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;

	}
}
