package com.example.demo.servicios;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.Habitacion;
import com.example.demo.repositorio.IAHabitacionRepositorio;

@Service
public class HabitacionServicios {
    @Autowired
	private IAHabitacionRepositorio habitacionRepositorio;
    
    public Habitacion saveHabitacion(Habitacion habitacion) {
    	habitacionRepositorio.save(habitacion);
    	return habitacion;
    }
    
    public List<Habitacion> listHabitacions(){
    	return habitacionRepositorio.findAll();
    }
}
