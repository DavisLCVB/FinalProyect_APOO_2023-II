/**
 * Panel encargado de mostrar el menu principal de la aplicación;
 */
package com.grupo8.finalproject.userinterface.mainmenu;

import java.awt.Color;
import javax.swing.*;

/**
 * @author Davis Cartagena
 */
public class MainMenuPanel extends JPanel {

    public SupervisorPanel supervisorPanel;
    public WorkPanel workPanel;
    public WorkersPanel workersPanel;

    public MainMenuPanel() {
        this.setBounds(0, 0, 1200, 800);
        this.setLayout(null);
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        initComponents();
    }

    public void initComponents() {
        supervisorPanel = new SupervisorPanel();
        this.add(supervisorPanel);
        
        workPanel = new WorkPanel();
        this.add(workPanel);
        
        workersPanel = new WorkersPanel();
        this.add(workersPanel);
    }
}
