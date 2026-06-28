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

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.ILaboratorioCasoUso;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.LaboratorioRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.LaboratorioResponseDto;
import com.uisrael.FarmaciaSaludVida.presentacion.mapeadores.ILaboratorioDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/laboratorio")
public class LaboratorioControlador {

	private final ILaboratorioCasoUso laboratorioCasoUso; // casos de uso
	private final ILaboratorioDtoMapper mapper; // mapeadores

	public LaboratorioControlador(ILaboratorioCasoUso laboratorioCasoUso, ILaboratorioDtoMapper mapper) {

		this.laboratorioCasoUso = laboratorioCasoUso;
		this.mapper = mapper;
	}

	@GetMapping
	public List<LaboratorioResponseDto> listar() {
		return laboratorioCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public LaboratorioResponseDto crear(@Valid @RequestBody LaboratorioRequestDto request) {
		return mapper.toResponseDto(laboratorioCasoUso.crear(mapper.toDomain(request)));

	}

	@GetMapping
	public LaboratorioResponseDto buscarPorId(int idFarmacia) {
		return mapper.toResponseDto(laboratorioCasoUso.obtenerPorId(idFarmacia));
	}

	@DeleteMapping("/{idLaboratorio}")
	public ResponseEntity<Void> eliminar(@PathVariable int idLaboratorio) {
		laboratorioCasoUso.eliminar(idLaboratorio);
		return ResponseEntity.noContent().build();
	}
}
