package dominio;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String cuit;
	private List<Empleado> empleados = new ArrayList<Empleado>();
	private String razonSocial;

	/*public Empresa() {
		this.empleados = new ArrayList<Empleado>();
	}*/

	public void setCuit(String cuit) {
		this.cuit = cuit;

	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;

	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);

	}

	public Double obtenerMontoTotal() {
		Double total = 0.0;
		for (Empleado empleado : this.empleados) {
			total += empleado.getMonto();
		}

		return total;
	}
}
