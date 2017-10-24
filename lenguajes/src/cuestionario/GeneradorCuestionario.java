/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;
import java.util.ArrayList;
import java.util.List;
import nomutables.Arreglos1;
/**
 *
 * @author T-102
 */
public class GeneradorCuestionario {
    public ArrayList<Pregunta> generar(){
//Primero generamos el arreglo que contendra las preguntas 
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
 //Primero generamis cada opcion de la primera pregunta
 
    Opcion op11=new Opcion("Moscu",false);
    Opcion op21=new Opcion("Kiev",false);
    Opcion op31=new Opcion("Turin",false);
    Opcion op41=new Opcion("Helsink",true);
    
    ArrayList<Opcion> opciones1=new ArrayList<>();
        opciones1.add(op11);
         opciones1.add(op21);
          opciones1.add(op31);
           opciones1.add(op41);
        Pregunta p1=new Pregunta("Capital de Finlandia",opciones1);
        preguntas.add(p1);
        return preguntas;
    }
}
