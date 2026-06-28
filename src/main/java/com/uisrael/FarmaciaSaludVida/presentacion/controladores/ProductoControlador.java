package com.uisrael.FarmaciaSaludVida.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IProductoCasoUso;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.ProductoRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.ProductoResponseDto;
import com.uisrael.FarmaciaSaludVida.presentacion.mapeadores.IProductoDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/producto")
public class ProductoControlador {

	private final IProductoCasoUso productoCasoUso; // casos de uso
	private final IProductoDtoMapper mapper; // mapeadores

	public ProductoControlador(IProductoCasoUso productoCasoUso, IProductoDtoMapper mapper) {

		this.productoCasoUso = productoCasoUso;
		this.mapper = mapper;
	}

	@GetMapping
	public List<ProductoResponseDto> listar() {
		return productoCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProductoResponseDto crear(@Valid @RequestBody ProductoRequestDto request) {
		return mapper.toResponseDto(productoCasoUso.crear(mapper.toDomain(request)));

	}

	@GetMapping
	public ProductoResponseDto buscarPorId(int idProducto) {
		return mapper.toResponseDto(productoCasoUso.obtenerPorId(idProducto));
	}

	@DeleteMapping("/{idProducto}")
	public ResponseEntity<Void> eliminar(@PathVariable int idProducto) {
		productoCasoUso.eliminar(idProducto);
		return ResponseEntity.noContent().build();
	}
}
