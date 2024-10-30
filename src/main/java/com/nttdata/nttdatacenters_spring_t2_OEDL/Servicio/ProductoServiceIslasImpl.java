package com.nttdata.nttdatacenters_spring_t2_OEDL.Servicio;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.nttdata.nttdatacenters_spring_t2_OEDL.Modelo.Producto;

@Primary
@Service
public class ProductoServiceIslasImpl implements ProductoService {
    private static final double IPSI = 0.04;

    @Override
    public Producto calcularPrecioPVP(Producto producto) {
        double precioPVP = producto.getPrecioSinImpuestos() * (1 + IPSI);
        producto.setPrecioPVP(precioPVP);
        return producto;
    }
}

