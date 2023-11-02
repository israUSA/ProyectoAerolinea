/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import vista.VtnAerolinea;

/**
 *
 * @author Sellan
 */
public class CtrVtnAerolinea implements ActionListener{
    private VtnAerolinea oVtnAerolinea;
    
    public CtrVtnAerolinea(){}
    
    public CtrVtnAerolinea(VtnAerolinea oVtnAerolinea){
        this.oVtnAerolinea = oVtnAerolinea;
        addListeners();
    }
    
    private void addListeners(){
        oVtnAerolinea.getjBtnReservarVentanilla1().addActionListener(this);
        oVtnAerolinea.getjBtnRegistrar().addActionListener(this);
    }
    
    private void registrarEnTabla(){
        DefaultTableModel model = (DefaultTableModel) oVtnAerolinea.getjTableClientes().getModel();

        // Paso 2: Recopila los datos de los campos de texto
        String nombre = oVtnAerolinea.getjTfNombres().getText(); // Campo de nombre
        String cedula = oVtnAerolinea.getjTfCedula().getText(); // Campo de cédula
        String direccion = oVtnAerolinea.getjTfDireccion().getText(); // Campo de dirección

    
        oVtnAerolinea.incrementarContador();


        // Paso 3: Agrega los datos al modelo de la tabla
        model.addRow(new Object[]{oVtnAerolinea.getContador(), nombre, cedula, direccion});

        // Paso 4: Actualiza el modelo de la tabla
        oVtnAerolinea.getjTableClientes().setModel(model);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource() == oVtnAerolinea.getjBtnReservarVentanilla1()){
            System.out.println("Ventanilla 1");
        }
        
        else if(e.getSource() == oVtnAerolinea.getjBtnRegistrar()){
            registrarEnTabla();
        }
    
    }
    
    
}
