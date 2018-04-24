package org.formacion.factorymethod;

public class LavadoraCargaFrontal extends LavadoraFactory {
	@Override
	protected Lavadora creaLavadora() {
		return new CargaFrontal();
	}
     public LavadoraCargaFrontal() {
    	    this.tipoCarga = "frontal";
     }
	
}
