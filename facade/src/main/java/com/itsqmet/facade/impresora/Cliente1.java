package com.itsqmet.facade.impresora;

public class Cliente1 {
	public static void main(String[] args) {

		Impresora i = new Impresora();
		i.setHoja("a4");
		i.setColor(true);
		i.setTipoDocumento("pdf");
		i.setTexto("impresion 1");
		i.imprimirDocumento();

		Impresora i2 = new Impresora();
		i2.setHoja("a4");
		i2.setColor(true);
		i2.setTipoDocumento("pdf");
		i2.setTexto("impresion 2");
		i2.imprimirDocumento();

		Impresora i3 = new Impresora();
		i3.setHoja("a4");
		i3.setColor(false);
		i3.setTipoDocumento("jpg");
		i3.setTexto("impresion 3");
		i3.imprimirDocumento();

	}
}
