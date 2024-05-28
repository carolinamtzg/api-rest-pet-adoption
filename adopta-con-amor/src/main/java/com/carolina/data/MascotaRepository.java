package com.carolina.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolina.model.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {
	List<Mascota> findByNombre(String nombre);
}
