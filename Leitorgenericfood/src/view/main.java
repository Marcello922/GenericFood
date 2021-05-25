package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class main {

	public static void main(String[] args) {
		IArquivosController arqcontrol = new ArquivosController();
		try {
			arqcontrol.readDir("C:\\TEMP\\", "generic_food.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
