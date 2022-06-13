package dominio;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private Integer cuit;
	private List<Empleado> empleados = new ArrayList<Empleado>();
	private String razonSocial;

	public Empresa(Integer cuit, String razonSocial) {
		// this.empleados = new ArrayList<Empleado>();
		this.cuit = cuit;
		this.razonSocial = razonSocial;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setCuit(Integer cuit) {
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

	public Double sueldoTotalAPagarPorLaEmpresa() {
		Double sueldoTotalAPagar = 0.0;
		for (Empleado empleado : empleados) {
			if (empleado instanceof EmpleadoPlantaPermanente) {
				sueldoTotalAPagar += ((EmpleadoPlantaPermanente) empleado).sueldoTotal();
			}

			else if (empleado instanceof EmpleadoPlantaTemporaria) {
				sueldoTotalAPagar += ((EmpleadoPlantaTemporaria) empleado).sueldoTotal();
			}

			else if (empleado instanceof Gerente) {
				sueldoTotalAPagar += ((Gerente) empleado).sueldoTotal();
			}
		}

		return sueldoTotalAPagar;
	}
}
