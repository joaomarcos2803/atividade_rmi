/* 
Universidade Federal de Itajubá (UNIFEI)
COM242 - Sistemas Distribuídos
Nome: João Marcos Cucovia - Matrícula: 2020002211
RMI - Implementação do cálculo da distância euclidiana
Data: 09/05/2023
*/

import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  
import java.rmi.*;
import java.util.Scanner;

public class Client 
{  
	public static void main (String[] args) 
	{  
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Entre com valores xa e ya separados por espaço:");
		double xa = keyboard.nextDouble();
		double ya = keyboard.nextDouble();
		System.out.println();
		System.out.println("Entre com valores xb e yb separados por espaço:");
		double xb = keyboard.nextDouble();
		double yb = keyboard.nextDouble();
	
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 5001);

			// Procura o registro do objeto remoto implementado no servidor 
			InterfaceCalc stub = (InterfaceCalc) Naming.lookup("rmi://localhost:5001/Calc"); 
			
			// chamando a função e obtendo a resposta
			double response = stub.EuclideanDistance(xa, ya, xb, yb);
			System.out.println("\nDistância entre os pontos: " + response);
		} 
		catch (Exception e) 
		{
			System.err.println("ERRO no Cliente (Exception): " + e.toString()); 
			e.printStackTrace(); 
		} 
	}
} 