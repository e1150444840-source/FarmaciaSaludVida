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

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IClienteCasoUso;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.ClienteRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.ClienteResponseDto;
import com.uisrael.FarmaciaSaludVida.presentacion.mapeadores.IClienteDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/cliente")
public class ClienteControlador {

	// dependencias de la arquitectura
	private final IClienteCasoUso clienteCasoUso; // caoss de uso
	private final IClienteDtoMapper mapper; // mapeadores

	public ClienteControlador(IClienteCasoUso clienteCasoUso, IClienteDtoMapper mapper) {

		this.clienteCasoUso = clienteCasoUso;
		this.mapper = mapper;
	}

	@GetMapping
	public List<ClienteResponseDto> listar() {
		return clienteCasoUso.listar().stream().map(mapper::toResponseDto).toList();

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ClienteResponseDto crear(@Valid @RequestBody ClienteRequestDto request) {
		return mapper.toResponseDto(clienteCasoUso.crear(mapper.toDomain(request)));

	}

	@GetMapping
	public ClienteResponseDto buscarPorId(int idCliente) {
		return mapper.toResponseDto(clienteCasoUso.obtenerPorId(idCliente));
	}

	@DeleteMapping("/{idCliente}")
	public ResponseEntity<Void> eliminar(@PathVariable int idCliente) {
		clienteCasoUso.eliminar(idCliente);
		return ResponseEntity.noContent().build();
	}

}
