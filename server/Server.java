/* 
Universidade Federal de Itajubá (UNIFEI)
COM242 - Sistemas Distribuídos
Nome: João Marcos Cucovia - Matrícula: 2020002211
RMI - Implementação do cálculo da distância euclidiana
Data: 09/05/2023
*/

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject; 

public class Server
{ 
    public static void main (String args[]) 
    { 
        try 
        { 
            Registry registry = java.rmi.registry.LocateRegistry.createRegistry(5001);
            Naming.rebind("rmi://localhost:5001/Calc", new Calc());
        } 
        catch (Exception e) 
        { 
            System.out.println("Exception: " + e.toString()); 
            e.printStackTrace(); 
        }
    } 
}