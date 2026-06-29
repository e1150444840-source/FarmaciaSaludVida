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

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IVehiculoCasoUso;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.VehiculoRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.VehiculoResponseDto;
import com.uisrael.FarmaciaSaludVida.presentacion.mapeadores.IVehiculoDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/vehiculo")
public class VehiculoControlador {

	private final IVehiculoCasoUso vehiculoCasoUso; // casos de uso
	private final IVehiculoDtoMapper mapper; // mapeadores

	public VehiculoControlador(IVehiculoCasoUso vehicuoCasoUso, IVehiculoDtoMapper mapper) {

		this.vehiculoCasoUso = vehicuoCasoUso;
		this.mapper = mapper;
	}

	@GetMapping
	public List<VehiculoResponseDto> listar() {
		return vehiculoCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public VehiculoResponseDto crear(@Valid @RequestBody VehiculoRequestDto request) {
		return mapper.toResponseDto(vehiculoCasoUso.crear(mapper.toDomain(request)));

	}

	@GetMapping("/{idVehiculo}")
	public VehiculoResponseDto buscarPorId(int idVehiculo) {
		return mapper.toResponseDto(vehiculoCasoUso.obtenerPorId(idVehiculo));
	}

	@DeleteMapping("/{idVehiculo}")
	public ResponseEntity<Void> eliminar(@PathVariable int idVehiculo) {
		vehiculoCasoUso.eliminar(idVehiculo);
		return ResponseEntity.noContent().build();
	}
}
