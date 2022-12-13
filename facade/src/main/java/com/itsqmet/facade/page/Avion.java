package com.itsqmet.facade.page;
//Patron Facade
//conocido como fachada
//es un patron estructural
//simplifica la complejidad de la aplicacion
//facilita el uso al cliente
//cliente utiliza la fachada llamando a todos los metodos existentes
//no expone logica de negocio
//simplifica la logica de acceso 
//brinda una interfaz simple para acceder a un subsistema complejo es decir,
//clases de las que se quiere hacer uso desde el programa principal
//se debe crear una instancia de fachada para acceder a las clases "subsistemas"
//se hace uso de los metodos que se quieren usar
//subclases implementgan funcionalidad
//fachada hace peticiones a las subclases no agrega funcionalidad
//se lo puede relacionar con el patron singleton
public class Avion {
	public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino) {
		System.out.println("===========");
		System.out.println("Vuelos encontrados para: " + destino + " desde: " + origen);
		System.out.println("Fecha de salida: " + fechaIda + " Fecha de regreso: " + fechaVuelta);
		System.out.println("===========");
	}
}
