package com.uisrael.FarmaciaSaludVida.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.ICategoriaCasoUso;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IClienteCasoUso;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IDetalleVentaCasoUso;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IFarmaciaCasoUso;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IInventarioCasoUso;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.ILaboratorioCasoUso;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.ILoteCasoUso;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IPedidoCasoUso;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IProductoCasoUso;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.ITipoClienteCasoUso;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IUsuarioCasoUso;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IVehiculoCasoUso;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IVentaCasoUso;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl.CategoriaCasoUsoImpl;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl.ClienteCasoUsoImpl;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl.DetalleVentaCasoUsoImpl;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl.FarmaciaCasoUsoImpl;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl.InventarioCasoUsoImpl;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl.LaboratorioCasoUsoImpl;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl.LoteCasoUsoImpl;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl.PedidoCasoUsoImpl;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl.ProductoCasoUsoImpl;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl.TipoClienteCasoUsoImpl;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl.UsuarioCasoUsoImpl;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl.VehiculoCasoUsoImpl;
import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl.VentaCasoUsoImpl;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.ICategoriaRepositorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IClienteRepositorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IDetalleVentaRepositorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IFarmaciaRepositorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IInventarioRepositorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.ILaboratorioRepositorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.ILoteRepositorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IPedidoRepositorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IProductoRepositorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.ITipoClienteRepositorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IUsuarioRepositorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IVehiculoRepositorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IVentaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores.CategoriaRepositorioImpl;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores.ClienteRepositorioImpl;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores.DetalleVentaRepositorioImpl;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores.FarmaciaRepositorioImpl;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores.InventarioRepositorioImpl;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores.LaboratorioRepositorioImpl;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores.LoteRepositorioImpl;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores.PedidoRepositorioImpl;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores.ProductoRepositorioImpl;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores.TipoClienteRepositorioImpl;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores.UsuarioRepositorioImpl;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores.VehiculoRepositorioImpl;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores.VentaRepositorioImpl;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.ICategoriaJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IClienteJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IDetalleVentaJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IFarmaciaJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IInventarioJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.ILaboratorioJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.ILoteJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IPedidoJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IProductoJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.ITipoClienteJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IUsuarioJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IVehiculoJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IVentaJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.ICategoriaJpaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IClienteJpaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IDetalleVentaJpaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IFarmaciaJpaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IInventarioJpaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.ILaboratorioJpaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.ILoteJpaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IPedidoJpaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IProductoJpaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.ITipoClienteJpaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IUsuarioJpaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IVehiculoJpaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IVentaJpaRepositorio;

@Configuration
public class Configuracion {

	// -----CATEGORIA
	@Bean
	ICategoriaRepositorio categoriaRepositorio(ICategoriaJpaRepositorio jpaRepository, ICategoriaJpaMapper mapper) {
		return new CategoriaRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	ICategoriaCasoUso categoriaCasoUso(ICategoriaRepositorio repositorio) {
		return new CategoriaCasoUsoImpl(repositorio);
	}

	// -----CLIENTE
	@Bean
	IClienteRepositorio clienteRepositorio(IClienteJpaRepositorio jpaRepository, IClienteJpaMapper mapper) {
		return new ClienteRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	IClienteCasoUso clienteCasoUso(IClienteRepositorio repositorio) {
		return new ClienteCasoUsoImpl(repositorio);
	}

	// -----DETALLEVENTA
	@Bean
	IDetalleVentaRepositorio detalleVentaRepositorio(IDetalleVentaJpaRepositorio jpaRepository,
			IDetalleVentaJpaMapper mapper) {
		return new DetalleVentaRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	IDetalleVentaCasoUso detalleVentaCasoUso(IDetalleVentaRepositorio repositorio) {
		return new DetalleVentaCasoUsoImpl(repositorio);
	}

	// -----FARMACIA
	@Bean
	IFarmaciaRepositorio farmaciaRepositorio(IFarmaciaJpaRepositorio jpaRepository, IFarmaciaJpaMapper mapper) {
		return new FarmaciaRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	IFarmaciaCasoUso farmaciaCasoUso(IFarmaciaRepositorio repositorio) {
		return new FarmaciaCasoUsoImpl(repositorio);
	}

	// -----INVENTARIO
	@Bean
	IInventarioRepositorio inventarioRepositorio(IInventarioJpaRepositorio jpaRepository, IInventarioJpaMapper mapper) {
		return new InventarioRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	IInventarioCasoUso inventarioCasoUso(IInventarioRepositorio repositorio) {
		return new InventarioCasoUsoImpl(repositorio);
	}

	// -----LABORATORIO
	@Bean
	ILaboratorioRepositorio laboratorioRepositorio(ILaboratorioJpaRepositorio jpaRepository,
			ILaboratorioJpaMapper mapper) {
		return new LaboratorioRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	ILaboratorioCasoUso laboratorioCasoUso(ILaboratorioRepositorio repositorio) {
		return new LaboratorioCasoUsoImpl(repositorio);
	}

	// -----LOTE
	@Bean
	ILoteRepositorio loteRepositorio(ILoteJpaRepositorio jpaRepository, ILoteJpaMapper mapper) {
		return new LoteRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	ILoteCasoUso loteCasoUso(ILoteRepositorio repositorio) {
		return new LoteCasoUsoImpl(repositorio);
	}

	// -----PEDIDO
	@Bean
	IPedidoRepositorio pedidoRepositorio(IPedidoJpaRepositorio jpaRepository, IPedidoJpaMapper mapper) {
		return new PedidoRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	IPedidoCasoUso pedidoCasoUso(IPedidoRepositorio repositorio) {
		return new PedidoCasoUsoImpl(repositorio);
	}

	// -----PRODUCTO
	@Bean
	IProductoRepositorio productoRepositorio(IProductoJpaRepositorio jpaRepository, IProductoJpaMapper mapper) {
		return new ProductoRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	IProductoCasoUso productoCasoUso(IProductoRepositorio repositorio) {
		return new ProductoCasoUsoImpl(repositorio);
	}

	// -----TIPOCLIENTE
	@Bean
	ITipoClienteRepositorio tipoClienteRepositorio(ITipoClienteJpaRepositorio jpaRepository,
			ITipoClienteJpaMapper mapper) {
		return new TipoClienteRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	ITipoClienteCasoUso tipoClienteCasoUso(ITipoClienteRepositorio repositorio) {
		return new TipoClienteCasoUsoImpl(repositorio);
	}

	// -----USUARIO
	@Bean
	IUsuarioRepositorio usuarioRepositorio(IUsuarioJpaRepositorio jpaRepository, IUsuarioJpaMapper mapper) {
		return new UsuarioRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	IUsuarioCasoUso usuarioCasoUso(IUsuarioRepositorio repositorio) {
		return new UsuarioCasoUsoImpl(repositorio);
	}

	// -----VEHICULO
	@Bean
	IVehiculoRepositorio vehiculoRepositorio(IVehiculoJpaRepositorio jpaRepository, IVehiculoJpaMapper mapper) {
		return new VehiculoRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	IVehiculoCasoUso vehiculoCasoUso(IVehiculoRepositorio repositorio) {
		return new VehiculoCasoUsoImpl(repositorio);
	}

	// -----VENTA
	@Bean
	IVentaRepositorio ventaRepositorio(IVentaJpaRepositorio jpaRepository, IVentaJpaMapper mapper) {
		return new VentaRepositorioImpl(jpaRepository, mapper);
	}

	@Bean
	IVentaCasoUso ventaCasoUso(IVentaRepositorio repositorio) {
		return new VentaCasoUsoImpl(repositorio);
	}
}
