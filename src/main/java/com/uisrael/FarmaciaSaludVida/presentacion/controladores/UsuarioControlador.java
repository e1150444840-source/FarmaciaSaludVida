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

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IUsuarioCasoUso;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.UsuarioRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.UsuarioResponseDto;
import com.uisrael.FarmaciaSaludVida.presentacion.mapeadores.IUsuarioDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioControlador {

	private final IUsuarioCasoUso usuarioCasoUso; // casos de uso
	private final IUsuarioDtoMapper mapper; // mapeadores

	public UsuarioControlador(IUsuarioCasoUso usuarioCasoUso, IUsuarioDtoMapper mapper) {

		this.usuarioCasoUso = usuarioCasoUso;
		this.mapper = mapper;
	}

	@GetMapping
	public List<UsuarioResponseDto> listar() {
		return usuarioCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioResponseDto crear(@Valid @RequestBody UsuarioRequestDto request) {
		return mapper.toResponseDto(usuarioCasoUso.crear(mapper.toDomain(request)));

	}

	@GetMapping("/{idUsuario}")
	public UsuarioResponseDto buscarPorId(int idUsuario) {
		return mapper.toResponseDto(usuarioCasoUso.obtenerPorId(idUsuario));
	}

	@DeleteMapping("/{idUsuario}")
	public ResponseEntity<Void> eliminar(@PathVariable int idUsuario) {
		usuarioCasoUso.eliminar(idUsuario);
		return ResponseEntity.noContent().build();
	}
}
