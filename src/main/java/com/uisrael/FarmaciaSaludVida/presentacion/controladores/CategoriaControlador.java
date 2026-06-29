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

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.ICategoriaCasoUso;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.CategoriaRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.CategoriaResponseDto;
import com.uisrael.FarmaciaSaludVida.presentacion.mapeadores.ICategoriaDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaControlador {

	// dependencias de la arquitectura
	private final ICategoriaCasoUso categoriaCasoUso; // casos de uso
	private final ICategoriaDtoMapper mapper; // mapeadores

	public CategoriaControlador(ICategoriaCasoUso clienteCasoUso, ICategoriaDtoMapper mapper) {

		this.categoriaCasoUso = clienteCasoUso;
		this.mapper = mapper;
	}

	@GetMapping
	public List<CategoriaResponseDto> listar() {
		return categoriaCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CategoriaResponseDto crear(@Valid @RequestBody CategoriaRequestDto request) {
		return mapper.toResponseDto(categoriaCasoUso.crear(mapper.toDomain(request)));

	}

	@GetMapping("/{idCategoria}")
	public CategoriaResponseDto buscarPorId(int idCategoria) {
		return mapper.toResponseDto(categoriaCasoUso.obtenerPorId(idCategoria));
	}
	

	@DeleteMapping("/{idCategoria}")
	public ResponseEntity<Void> eliminar(@PathVariable int idCategoria) {
		categoriaCasoUso.eliminar(idCategoria);
		return ResponseEntity.noContent().build();
	}
}
