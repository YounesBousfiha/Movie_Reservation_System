package com.example.demo.controllers;


import com.example.demo.models.Reservation;
import com.example.demo.services.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationService reservationService;


    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<Reservation> getReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping
    public Reservation createResevation(@RequestBody Reservation reservation) {
        return reservationService.saveReservation(reservation);
    }
}
