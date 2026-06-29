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

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IFarmaciaCasoUso;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.FarmaciaRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.FarmaciaResponseDto;
import com.uisrael.FarmaciaSaludVida.presentacion.mapeadores.IFarmaciaDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/farmacia")
public class FarmaciaControlador {

	private final IFarmaciaCasoUso farmaciaCasoUso; // casos de uso
	private final IFarmaciaDtoMapper mapper; // mapeadores

	public FarmaciaControlador(IFarmaciaCasoUso categoriaCasoUso, IFarmaciaDtoMapper mapper) {

		this.farmaciaCasoUso = categoriaCasoUso;
		this.mapper = mapper;
	}

	@GetMapping
	public List<FarmaciaResponseDto> listar() {
		return farmaciaCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public FarmaciaResponseDto crear(@Valid @RequestBody FarmaciaRequestDto request) {
		return mapper.toResponseDto(farmaciaCasoUso.crear(mapper.toDomain(request)));

	}

	@GetMapping("/{idFarmacia}")
	public FarmaciaResponseDto buscarPorId(int idFarmacia) {
		return mapper.toResponseDto(farmaciaCasoUso.obtenerPorId(idFarmacia));
	}

	@DeleteMapping("/{idFarmacia}")
	public ResponseEntity<Void> eliminar(@PathVariable int idFarmacia) {
		farmaciaCasoUso.eliminar(idFarmacia);
		return ResponseEntity.noContent().build();
	}

}
