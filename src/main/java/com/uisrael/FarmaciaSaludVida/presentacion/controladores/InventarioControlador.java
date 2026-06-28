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

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IInventarioCasoUso;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.InventarioRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.InventarioResponseDto;
import com.uisrael.FarmaciaSaludVida.presentacion.mapeadores.IInventarioDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/inventario")
public class InventarioControlador {

	private final IInventarioCasoUso inventarioCasoUso; // casos de uso
	private final IInventarioDtoMapper mapper; // mapeadores

	public InventarioControlador(IInventarioCasoUso inventarioCasoUso, IInventarioDtoMapper mapper) {

		this.inventarioCasoUso = inventarioCasoUso;
		this.mapper = mapper;
	}

	@GetMapping
	public List<InventarioResponseDto> listar() {
		return inventarioCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public InventarioResponseDto crear(@Valid @RequestBody InventarioRequestDto request) {
		return mapper.toResponseDto(inventarioCasoUso.crear(mapper.toDomain(request)));

	}

	@GetMapping
	public InventarioResponseDto buscarPorId(int idInventario) {
		return mapper.toResponseDto(inventarioCasoUso.obtenerPorId(idInventario));
	}

	@DeleteMapping("/{idInventario}")
	public ResponseEntity<Void> eliminar(@PathVariable int idInventario) {
		inventarioCasoUso.eliminar(idInventario);
		return ResponseEntity.noContent().build();
	}
}
