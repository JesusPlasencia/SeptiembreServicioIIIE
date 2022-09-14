package pe.idat.repository;

import java.util.List;

import pe.idat.model.Producto;

public interface ProductoRepository {

	List<Producto> lista();
	Producto obtener(Integer idProducto);
	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer idProducto);
}
