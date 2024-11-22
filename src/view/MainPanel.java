package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

import controller.ShalomService;

public class MainPanel extends JPanel implements ActionListener{
	
	//Configuraciones
	final private static int SCREEN_WIDTH = 400;
	final private static int SCREEN_HEIGHT = 500;
	
	//Controlador
	ShalomService servicio = new ShalomService();
	
	// Crear los campos para ingresar datos
    JTextField titleField = new JTextField();
    JTextField descriptionField = new JTextField();
    JTextField dateTimeField = new JTextField();
    JTextField locationField = new JTextField();
    JButton imageButton = new JButton("Seleccionar Imagen");
    JLabel selectedImageLabel = new JLabel("Ninguna imagen seleccionada");
    JButton submitButton = new JButton("Enviar Evento");
    JLabel responseLabel = new JLabel("");
    File[] selectedImage = {null};
	
    //Constructor
	public MainPanel() {
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setLayout(new GridLayout(0, 1));
		addItemsToPanel();
	}
	
	//Agregar elementos al panel
	public void addItemsToPanel() {
		
		this.add(new JLabel("Título del Evento:"));
		this.add(titleField);
		this.add(new JLabel("Descripción:"));
		this.add(descriptionField);
		this.add(new JLabel("Fecha y Hora (YYYY-MM-DDTHH:MM):"));
		this.add(dateTimeField);
		this.add(new JLabel("Ubicación:"));
		this.add(locationField);
		imageButton.addActionListener(this);
		this.add(imageButton);
		this.add(selectedImageLabel);
		this.add(submitButton);
		this.add(responseLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == imageButton) {
			JFileChooser fileChooser = new JFileChooser();
			int returnValue = fileChooser.showOpenDialog(null);
			if (returnValue == JFileChooser.APPROVE_OPTION) {
				selectedImage[0] = fileChooser.getSelectedFile();
				selectedImageLabel.setText("Imagen Seleccionada: " + selectedImage[0].getName());
			}
			
		}
		
	}
}
