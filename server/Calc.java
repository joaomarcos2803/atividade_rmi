/* 
Universidade Federal de Itajubá (UNIFEI)
COM242 - Sistemas Distribuídos
Nome: João Marcos Cucovia - Matrícula: 2020002211
RMI - Implementação do cálculo da distância euclidiana
Data: 09/05/2023
*/

import java.rmi.RemoteException;
import java.rmi.server.*;
import java.lang.*;

// Classe no servidor que implementa o método remoto
public class Calc extends UnicastRemoteObject implements InterfaceCalc {

    public Calc() throws RemoteException {
        System.out.println("Servidor instanciado!");
    } 
    
    public double EuclideanDistance(double xa, double ya, double xb, double yb) throws RemoteException {
        double xDifference = xb - xa;
        double yDifference = yb - ya;
        double distance = Math.sqrt((xDifference * xDifference) + (yDifference * yDifference));

		System.out.println("Distancia entre o ponto A (" + xa + ", " + ya + ") e o ponto B (" + xb + ", " + yb + ") = " + distance);
		return distance;
    }
}