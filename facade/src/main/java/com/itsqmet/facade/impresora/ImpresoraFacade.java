package com.itsqmet.facade.impresora;

public class ImpresoraFacade {

	Impresora impresora;

	public ImpresoraFacade(String texto) {
		super();
		impresora= new Impresora();
		impresora.setColor(true);
		impresora.setHoja("A4");
		impresora.setTipoDocumento("pdf");
		impresora.setTexto(texto);
	}

	public void imprimir() {
		impresora.imprimirDocumento();
	}

}
