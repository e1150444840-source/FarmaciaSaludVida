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

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IPedidoCasoUso;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.PedidoRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.PedidoResponseDto;
import com.uisrael.FarmaciaSaludVida.presentacion.mapeadores.IPedidoDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/pedido")
public class PedidoControlador {

	private final IPedidoCasoUso pedidoCasoUso; // casos de uso
	private final IPedidoDtoMapper mapper; // mapeadores

	public PedidoControlador(IPedidoCasoUso pedidoCasoUso, IPedidoDtoMapper mapper) {

		this.pedidoCasoUso = pedidoCasoUso;
		this.mapper = mapper;
	}

	@GetMapping
	public List<PedidoResponseDto> listar() {
		return pedidoCasoUso.listar().stream().map(mapper::toResponseDto).toList();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PedidoResponseDto crear(@Valid @RequestBody PedidoRequestDto request) {
		return mapper.toResponseDto(pedidoCasoUso.crear(mapper.toDomain(request)));

	}

	@GetMapping("/{idPedido}")
	public PedidoResponseDto buscarPorId(int idPedido) {
		return mapper.toResponseDto(pedidoCasoUso.obtenerPorId(idPedido));
	}

	@DeleteMapping("/{idPedido}")
	public ResponseEntity<Void> eliminar(@PathVariable int idPedido) {
		pedidoCasoUso.eliminar(idPedido);
		return ResponseEntity.noContent().build();
	}
}
