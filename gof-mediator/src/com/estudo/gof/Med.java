package com.estudo.gof;

public class Med {
	public static void main(String[] args) {
		abrirSala();
	}

	public static void abrirSala() {
		Usuario fernando = new Usuario("Fernando");
		Usuario anselmo = new Usuario("Anselmo");
		fernando.enviarMens("Anselmo em qual Pattern estamos?");
		anselmo.enviarMens("Acho que no 17o.");
	}
}