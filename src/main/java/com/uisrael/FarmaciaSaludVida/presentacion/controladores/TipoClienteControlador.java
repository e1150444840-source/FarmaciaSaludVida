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

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.ITipoClienteCasoUso;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.TipoClienteRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.TipoClienteResponseDto;
import com.uisrael.FarmaciaSaludVida.presentacion.mapeadores.ITipoClienteDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tipoCiente")
public class TipoClienteControlador {

	private final ITipoClienteCasoUso tipoCienteCasoUso; // casos de uso
	private final ITipoClienteDtoMapper mapper; // mapeadores

	public TipoClienteControlador(ITipoClienteCasoUso tipoCienteCasoUso, ITipoClienteDtoMapper mapper) {

		this.tipoCienteCasoUso = tipoCienteCasoUso;
		this.mapper = mapper;
	}

	@GetMapping
	public List<TipoClienteResponseDto> listar() {
		return tipoCienteCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public TipoClienteResponseDto crear(@Valid @RequestBody TipoClienteRequestDto request) {
		return mapper.toResponseDto(tipoCienteCasoUso.crear(mapper.toDomain(request)));

	}

	@GetMapping
	public TipoClienteResponseDto buscarPorId(int idTipoCliente) {
		return mapper.toResponseDto(tipoCienteCasoUso.obtenerPorId(idTipoCliente));
	}

	@DeleteMapping("/{idTipoCliente}")
	public ResponseEntity<Void> eliminar(@PathVariable int idTipoCliente) {
		tipoCienteCasoUso.eliminar(idTipoCliente);
		return ResponseEntity.noContent().build();
	}
}
