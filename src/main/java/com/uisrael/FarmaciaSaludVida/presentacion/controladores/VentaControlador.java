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

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IVentaCasoUso;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.VentaRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.VentaResponseDto;
import com.uisrael.FarmaciaSaludVida.presentacion.mapeadores.IVentaDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/venta")
public class VentaControlador {

	private final IVentaCasoUso ventaCasoUso; // casos de uso
	private final IVentaDtoMapper mapper; // mapeadores

	
	public VentaControlador(IVentaCasoUso ventaCasoUso, IVentaDtoMapper mapper) {

		this.ventaCasoUso = ventaCasoUso;
		this.mapper = mapper;
	}

	@GetMapping
	public List<VentaResponseDto> listar() {
		return ventaCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public VentaResponseDto crear(@Valid @RequestBody VentaRequestDto request) {
		return mapper.toResponseDto(ventaCasoUso.crear(mapper.toDomain(request)));

	}

	@GetMapping("/{idVenta}")
	public VentaResponseDto buscarPorId(int idVenta) {
		return mapper.toResponseDto(ventaCasoUso.obtenerPorId(idVenta));
	}

	@DeleteMapping("/{idVenta}")
	public ResponseEntity<Void> eliminar(@PathVariable int idVenta) {
		ventaCasoUso.eliminar(idVenta);
		return ResponseEntity.noContent().build();
	}
}
