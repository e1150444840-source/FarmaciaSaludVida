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

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.ILoteCasoUso;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.LoteRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.LoteResponseDto;
import com.uisrael.FarmaciaSaludVida.presentacion.mapeadores.ILoteDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/lote")
public class LoteControlador {

	private final ILoteCasoUso loteCasoUso; // casos de uso
	private final ILoteDtoMapper mapper; // mapeadores

	public LoteControlador(ILoteCasoUso loteCasoUso, ILoteDtoMapper mapper) {

		this.loteCasoUso = loteCasoUso;
		this.mapper = mapper;
	}

	@GetMapping
	public List<LoteResponseDto> listar() {
		return loteCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public LoteResponseDto crear(@Valid @RequestBody LoteRequestDto request) {
		return mapper.toResponseDto(loteCasoUso.crear(mapper.toDomain(request)));

	}

	@GetMapping("/{idLote}")
	public LoteResponseDto buscarPorId(int idLote) {
		return mapper.toResponseDto(loteCasoUso.obtenerPorId(idLote));
	}

	@DeleteMapping("/{idLote}")
	public ResponseEntity<Void> eliminar(@PathVariable int idLote) {
		loteCasoUso.eliminar(idLote);
		return ResponseEntity.noContent().build();
	}
}
