package com.example.demo.repositories;

import com.example.demo.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


// save(entity) — Save or update an entity.
// findById(id) — Find an entity by its ID.
// findAll() — Get all entities.
// delete(entity) — Delete an entity.
// deleteById(id) — Delete by ID.
// count() — Count all entities.
// existsById(id) — Check if an entity exists by ID.

public interface ReservationRepository extends JpaRepository<Reservation, Long> {}
