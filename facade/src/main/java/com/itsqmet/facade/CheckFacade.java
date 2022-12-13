package com.itsqmet.facade;

import com.itsqmet.facade.page.Avion;
import com.itsqmet.facade.page.Hotel;

public class CheckFacade {

	private Avion avion;
	private Hotel hotel;

	public CheckFacade() {
		avion = new Avion();
		hotel = new Hotel();
	}

	public void buscar(String fechaIda, String fechaVuelta, String origen, String destino){
		avion.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		hotel.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
	}

}
