package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dominio.EmpleadoPlantaPermanente;
import dominio.EmpleadoPlantaTemporaria;
import dominio.Empresa;
import dominio.Gerente;

public class TestEmpresa {
	// todos dan verdes por el momento

	@Test
	public void testEmpleadoPlantaTemporaria() {
		EmpleadoPlantaTemporaria empleado = new EmpleadoPlantaTemporaria();
		empleado.setHorasTrabajadas(80);
		empleado.esCasado(true);
		empleado.setHijos(0);
		Double valorEsperado = 16100.00;
		assertEquals(valorEsperado, empleado.getMonto(), 0.0);
	}

	@Test
	public void testEmpleadoPlantaPermanente_noGerente() {
		EmpleadoPlantaPermanente empleado = new EmpleadoPlantaPermanente();
		empleado.setHorasTrabajadas(80);
		empleado.esCasado(true);
		empleado.setHijos(2);
		empleado.setAntiguedad(6);
		Double valorEsperado = 25100.00;
		assertEquals(valorEsperado, empleado.getMonto(), 0.0);

		empleado = new EmpleadoPlantaPermanente();
		empleado.setHorasTrabajadas(160);
		empleado.esCasado(false);
		empleado.setHijos(0);
		empleado.setAntiguedad(4);
		valorEsperado = 48400.00;
		assertEquals(valorEsperado, empleado.getMonto(), 0.0);

	}

	@Test
	public void testEmpleadoPlantaPermanente_Gerente() {
		Gerente empleado = new Gerente();
		empleado.setHorasTrabajadas(160);
		empleado.esCasado(true);
		empleado.setHijos(1);
		empleado.setAntiguedad(10);
		Double valorEsperado = 65800.00;
		assertEquals(valorEsperado, empleado.getMonto(), 0.0);

	}

	@Test
	public void testTotalEsperadoParaEmpresa() {
		Empresa empresa = new Empresa();
		empresa.setCuit("33-4556677-8");
		empresa.setRazonSocial("Nueva Razon Social");

		EmpleadoPlantaTemporaria empleado = new EmpleadoPlantaTemporaria();
		empleado.setHorasTrabajadas(80);
		empleado.esCasado(true);
		empleado.setHijos(0);

		empresa.agregarEmpleado(empleado);

		EmpleadoPlantaPermanente empleado2 = new EmpleadoPlantaPermanente();
		empleado2.setHorasTrabajadas(80);
		empleado2.esCasado(true);
		empleado2.setHijos(2);
		empleado2.setAntiguedad(6);
		empresa.agregarEmpleado(empleado2);

		EmpleadoPlantaPermanente empleado3 = new EmpleadoPlantaPermanente();
		empleado3.setHorasTrabajadas(160);
		empleado3.esCasado(false);
		empleado3.setHijos(0);
		empleado3.setAntiguedad(4);
		empresa.agregarEmpleado(empleado3);

		Gerente empleado4 = new Gerente();
		empleado4.setHorasTrabajadas(160);
		empleado4.esCasado(true);
		empleado4.setHijos(1);
		empleado4.setAntiguedad(10);
		empresa.agregarEmpleado(empleado4);
		Double valorEsperado = 155400.00;
		assertEquals(valorEsperado, empresa.obtenerMontoTotal(), 0.0);

	}
}
