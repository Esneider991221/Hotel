package com.example.demo.controlador;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Habitacion;
import com.example.demo.servicios.HabitacionServicios;



@RestController
@CrossOrigin
@RequestMapping("/habitacion")
public class HabitacionControlador {
	@Autowired
	private HabitacionServicios habitacionServicios;
   @PostMapping("/saveHabitacion")
	public Habitacion saveHabitacion(@RequestBody Habitacion habitacion) {
		return habitacionServicios.saveHabitacion(habitacion);
	}
   @GetMapping("/listHabitaciones")
   public List<Habitacion> listHabitaciones() {
	return habitacionServicios.listHabitacions();
   }
   
   @GetMapping ("/test")
   public String test() {
 	  
 	  return "oka";
   }
}
