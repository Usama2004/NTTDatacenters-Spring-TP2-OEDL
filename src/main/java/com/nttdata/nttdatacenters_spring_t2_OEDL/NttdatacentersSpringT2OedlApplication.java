package com.nttdata.nttdatacenters_spring_t2_OEDL;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.nttdata.nttdatacenters_spring_t2_OEDL.Modelo.Pedido;
import com.nttdata.nttdatacenters_spring_t2_OEDL.Modelo.Producto;
import com.nttdata.nttdatacenters_spring_t2_OEDL.Servicio.ProductoService;
import com.nttdata.nttdatacenters_spring_t2_OEDL.Servicio.ProductoServiceIslasImpl;
import com.nttdata.nttdatacenters_spring_t2_OEDL.Servicio.ProductoServicePeninsulaImpl;

@SpringBootApplication
public class NttdatacentersSpringT2OedlApplication implements CommandLineRunner {

	@Autowired
	private ProductoServicePeninsulaImpl productoServicePeninsula;
	@Autowired
	private ProductoServiceIslasImpl productoServiceIslas;
	@Autowired
	@Qualifier("productoServiceIslasImpl")
	private ProductoService productoService;

	public static void main(String[] args) {
		SpringApplication.run(NttdatacentersSpringT2OedlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Crear un pedido de ejemplo
		Pedido pedido = new Pedido();
		pedido.setEsIslas(false); // Cambiar a true para Ceuta, Melilla o Canarias

		// Crear productos de ejemplo
		Producto producto1 = new Producto();
		producto1.setPrecioSinImpuestos(100);

		Producto producto2 = new Producto();
		producto2.setPrecioSinImpuestos(200);

		pedido.setProductos(List.of(producto1, producto2));

		// Seleccionar el servicio adecuado
		productoService = pedido.isEsIslas() ? productoServiceIslas : productoServicePeninsula;

		// Calcular precios PVP
		double total = 0;
		for (Producto producto : pedido.getProductos()) {
			productoService.calcularPrecioPVP(producto);
			total += producto.getPrecioPVP();
		}

		// Mostrar el total del pedido
		System.out.println("El total del pedido es: " + total);
	}
}
