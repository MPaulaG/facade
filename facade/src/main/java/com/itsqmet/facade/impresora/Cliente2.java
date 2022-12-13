package com.itsqmet.facade.impresora;

public class Cliente2 {
	public static void main(String[] args) {
		ImpresoraFacade f1= new ImpresoraFacade("impresion 1");
		f1.imprimir();
		
		ImpresoraFacade f2= new ImpresoraFacade("impresion 2");
		f2.imprimir();
		
		Impresora i3= new Impresora();
		i3.setHoja("a4");
		i3.setColor(false);
		i3.setTipoDocumento("jpg");
		i3.setTexto("impresion 3");
		i3.imprimirDocumento();
	}
	

}
