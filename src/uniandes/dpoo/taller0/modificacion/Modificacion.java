package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	
	private static CalculadoraEstadisticas calculadora;
	
	public static void main(String[] args) {
		System.out.println("Hola, mundo!");
		String archivo = "./data/atletas.csv";
		
		try {
			calculadora = LoaderOlimpicos.cargarArchivo(archivo);
			System.out.println(calculadora.paisConMasMedallistas());
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}
	}
}
