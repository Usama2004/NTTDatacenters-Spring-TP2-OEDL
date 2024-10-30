package com.nttdata.nttdatacenters_spring_t2_OEDL.Servicio;

import org.springframework.stereotype.Service;
import com.nttdata.nttdatacenters_spring_t2_OEDL.Modelo.Producto;

@Service
public interface ProductoService {
	Producto calcularPrecioPVP(Producto producto);
}
