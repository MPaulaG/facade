package com.itsqmet.facade.app;

import com.itsqmet.facade.CheckFacade;

public class App {
public static void main(String[] args) {
	CheckFacade cliente1= new CheckFacade();
	cliente1.buscar("26/12/22","02/01/23", "Quito","Miami");
	
	
	CheckFacade cliente2= new CheckFacade();
	cliente2.buscar("12/12/22","19/12/22", "Quito","Guayaquil");
}
}
