/* Universidade Federal de Itajubá (UNIFEI)
   COM242 - Sistemas Distribuídos
   Nome: João Marcos Cucovia - Matrícula: 2020002211
   09/05/2023
   
   RMI - Exemplo de implementação
   Programa que utiliza funções remotas para realizar o
   cálculo da distância entre 2 pontos num plano cartesiano.
*/

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceCalc extends Remote {
    double EuclideanDistance(double xa, double ya, double xb, double yb) throws RemoteException;
}