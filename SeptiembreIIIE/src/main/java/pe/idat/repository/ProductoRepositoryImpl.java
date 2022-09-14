package pe.idat.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.idat.model.Producto;

@Service
public class ProductoRepositoryImpl implements ProductoRepository{

	List<Producto> almacenamiento = new ArrayList<Producto>();
	
	@Override
	public List<Producto> lista() {
		return almacenamiento;
	}

	@Override
	public Producto obtener(Integer idProducto) {
		return almacenamiento.stream().filter(p -> p.getIdProducto() == idProducto).findFirst().orElse(null);
	}

	@Override
	public void guardar(Producto producto) {
		almacenamiento.add(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		Producto foundProducto = obtener(producto.getIdProducto());
		eliminar(producto.getIdProducto());
		almacenamiento.add(foundProducto);
	}

	@Override
	public void eliminar(Integer idProducto) {
		Producto foundProducto = obtener(idProducto);
		almacenamiento.remove(foundProducto);
	}

}
