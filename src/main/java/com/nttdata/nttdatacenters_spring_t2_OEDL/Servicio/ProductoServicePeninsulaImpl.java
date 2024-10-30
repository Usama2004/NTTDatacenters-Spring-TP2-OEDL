package com.nttdata.nttdatacenters_spring_t2_OEDL.Servicio;

import org.springframework.stereotype.Service;
import com.nttdata.nttdatacenters_spring_t2_OEDL.Modelo.Producto;

@Service
public class ProductoServicePeninsulaImpl implements ProductoService{
	private static final double IVA = 0.21;

    @Override
    public Producto calcularPrecioPVP(Producto producto) {
        double precioPVP = producto.getPrecioSinImpuestos() * (1 + IVA);
        producto.setPrecioPVP(precioPVP);
        return producto;
    }
}
