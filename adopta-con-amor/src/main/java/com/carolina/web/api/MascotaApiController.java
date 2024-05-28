package com.carolina.web.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.carolina.data.MascotaRepository;
import com.carolina.model.Mascota;

@RestController
@RequestMapping(path="/api", produces="application/json")
@CrossOrigin(origins="*")
public class MascotaApiController {

@Autowired
private MascotaRepository mascotaRepo;
	
	
	// Mostrar mascota por identificación:
	@GetMapping("/mascota/id/{id}")
	public ResponseEntity<Mascota> mascotaById(@PathVariable("id") Long id){
		Optional<Mascota> optMascota = mascotaRepo.findById(id);
		if(optMascota.isPresent()) {
			return new ResponseEntity<>(optMascota.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND); 
	}
	
	// Subir una mascota:
	@PostMapping(path="/mascota", consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Mascota addMascota(@RequestBody Mascota mascota) {
		return mascotaRepo.save(mascota);
	}
	
	// Listar todas las mascotas:
	@GetMapping("/mascotas/listado")
	public Iterable<Mascota> allMascotas(){
		
		return mascotaRepo.findAll();
	}
	
	// Listar las 20 mascotas más jóvenes:
	@GetMapping("/mascotas/jovenes")
	public Iterable<Mascota> get20MascotasMasJovenes() {
	    PageRequest top20 = PageRequest.of(0, 20, Sort.by("fechaNac").descending());
	    return mascotaRepo.findAll(top20).getContent();
	}
	
	// Mostrar todas las mascotas en páginas de a 5:
	@GetMapping("/mascotas/recents/{pag}/{qtty}")
	public Iterable<Mascota> recentMascotas(@PathVariable("pag") int pag, @PathVariable("qtty") int qtty){
	    PageRequest page = PageRequest.of(pag, qtty, Sort.by("fechaNac").descending());
	    return mascotaRepo.findAll(page);
	}
	
	// Borrar una mascota:
	@DeleteMapping("/mascota/id/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteMascota(@PathVariable("id") Long id) {
		mascotaRepo.deleteById(id);
	}
	
	// Mostrar mascota por nombre:
	@GetMapping("/mascota/nombre/{nombre}")
	public List<Mascota> getMascotaByName(@PathVariable String nombre) {
		return mascotaRepo.findByNombre(nombre);
	}
}
