/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Administrador_
 */
public class JOPTIONPANE {
    public static void main(String[] args){
        double horasn1 = Double.parseDouble(JOptionPane.showInputDialog("Horas Trabajadas del Trabajador 1"));
        double horasn2 = Double.parseDouble(JOptionPane.showInputDialog("Horas Trabajadas del Trabajador 2"));
        double horasn3 = Double.parseDouble(JOptionPane.showInputDialog("Horas Trabajadas del Trabajador 3"));
        double pago = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su PagoxHora"));
        double resultadon1;
        double resultadon2;
        double resultadon3;
        double resultadofinaln1;
        double resultadofinaln2;
        double resultadofinaln3;
        resultadon1=horasn1*pago;
        resultadon2=horasn2*pago;
        resultadon3=horasn3*pago;
        
        double descuenton1=resultadon1*(0.05);
        double descuenton2=resultadon2*(0.05);
        double descuenton3=resultadon3*(0.05);
        
        if(pago>500){
            resultadofinaln1=resultadon1-resultadon1*(0.1);
            resultadofinaln2=resultadon2-resultadon2*(0.1);
            resultadofinaln3=resultadon3-resultadon3*(0.1);
            JOptionPane.showMessageDialog(null, resultadofinaln1+"", "Pago del Trabajador 1", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, resultadofinaln2+"", "Pago del Trabajador 2", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, resultadofinaln3+"", "Pago del Trabajador 3", JOptionPane.WARNING_MESSAGE);
        }
        if(pago<=0){
            JOptionPane.showMessageDialog(null, "NO SE INGRESA NUMEROS MENORES Q 0", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        if(horasn1<=0){
            JOptionPane.showMessageDialog(null, "NO SE INGRESA NUMEROS MENORES Q 0", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        if(horasn2<=0){
            JOptionPane.showMessageDialog(null, "NO SE INGRESA NUMEROS MENORES Q 0", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        if(horasn3<=0){
            JOptionPane.showMessageDialog(null, "NO SE INGRESA NUMEROS MENORES Q 0", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        if(pago<=500 && pago>=0){
            resultadofinaln1=resultadon1-descuenton1;
            resultadofinaln2=resultadon2-descuenton2;
            resultadofinaln3=resultadon3-descuenton3;

            JOptionPane.showMessageDialog(null, resultadofinaln1, "Pago del Trabajador 1", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, resultadofinaln2, "Pago del Trabajador 2", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, resultadofinaln3, "Pago del Trabajador 3", JOptionPane.WARNING_MESSAGE);            JOptionPane.showMessageDialog(null, resultadofinaln1, "Pago del Trabajador", JOptionPane.WARNING_MESSAGE);
        }
        if(horasn1>horasn2){
            if(horasn1>horasn3){
               JOptionPane.showMessageDialog(null, "El Trabajador 1 Tuvo mayor Sueldo", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(horasn2>horasn1){
            if(horasn2>horasn3){
               JOptionPane.showMessageDialog(null, "El Trabajador 2 Tuvo mayor Sueldo", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
        if(horasn3>horasn1){
            if(horasn3>horasn2){
               JOptionPane.showMessageDialog(null, "El Trabajador 3 Tuvo mayor Sueldo", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
