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

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IDetalleVentaCasoUso;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.DetalleVentaRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.DetalleVentaResponseDto;
import com.uisrael.FarmaciaSaludVida.presentacion.mapeadores.IDetalleVentaDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/detalleVenta")
public class DetalleVentaControlador {

	private final IDetalleVentaCasoUso detalleVentaCasoUso; // casos de uso
	private final IDetalleVentaDtoMapper mapper; // mapeadores

	public DetalleVentaControlador(IDetalleVentaCasoUso detalleVentaCasoUso, IDetalleVentaDtoMapper mapper) {

		this.detalleVentaCasoUso = detalleVentaCasoUso;
		this.mapper = mapper;
	}

	@GetMapping
	public List<DetalleVentaResponseDto> listar() {
		return detalleVentaCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleVentaResponseDto crear(@Valid @RequestBody DetalleVentaRequestDto request) {
		return mapper.toResponseDto(detalleVentaCasoUso.crear(mapper.toDomain(request)));

	}

	@GetMapping("/{idDetalleVenta}")
	public DetalleVentaResponseDto buscarPorId(int idDetalleVenta) {
		return mapper.toResponseDto(detalleVentaCasoUso.obtenerPorId(idDetalleVenta));
	}

	@DeleteMapping("/{idDetalleVenta}")
	public ResponseEntity<Void> eliminar(@PathVariable int idDetalleVenta) {
		detalleVentaCasoUso.eliminar(idDetalleVenta);
		return ResponseEntity.noContent().build();
	}
}
