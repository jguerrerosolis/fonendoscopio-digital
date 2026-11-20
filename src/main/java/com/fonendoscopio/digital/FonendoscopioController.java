package com.fonendoscopio.digital;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FonendoscopioController {

	public record InfoFonendoscopio(
			String nombre,
			String descripcion,
			List<String> sensores,
			String comunicacion,
			int memoriaLocalDias,
			int bateriaHoras) {
	}

	@GetMapping("/fonendoscopio")
	public InfoFonendoscopio info() {
		return new InfoFonendoscopio(
				"Fonendoscopio digital",
				"Dispositivo de autoauscultación respiratoria para telemedicina",
				List.of("Cabezal acústico", "Banda torácica", "Acelerómetro"),
				"Bluetooth / Wi-Fi",
				5,
				48);
	}
}
