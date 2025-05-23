package Opcional;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Filtro extends JFrame
{
	
	private JPanel panel;
	private JLabel persona;
	private JLabel imagen;
	private ImageIcon icono;
	
	Filtro(int edad, String nombre)
	{
		setTitle("Ventana de filtrado");
		setBounds(650, 300,  600,      450);
		setResizable(false);
		
		//Con esto cargo la imagen
		if(edad < 25)
		{
			icono = new ImageIcon("C:/Users/andre/Downloads/iloveimg-converted/flor.jpg");
		}
		else if(edad >= 25 && edad <= 70)
		{
			icono = new ImageIcon("C:/Users/andre/Downloads/iloveimg-converted/sol_feliz.jpg");
		}
		else
		{
			icono = new ImageIcon("C:/Users/andre/Downloads/iloveimg-converted/hoja_seria.jpg");
		}
		
		//Cambio su tamaño
		Image redimensionar = icono.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		
		//Pongo la imagen nueva 
		ImageIcon imagenNueva = new ImageIcon(redimensionar);
		
		//La cargo en un JLabel
		imagen = new JLabel(imagenNueva);
		imagen.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		panel = new JPanel();
		
		//Hago que los componentes se pongan en pila
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		persona = new JLabel("¡Hola "+ nombre +"!");
		persona.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(persona);
		panel.add(imagen);
		
		
		//Hago que se pongan en el centro del eje X
		panel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		panel.setBackground(new Color(255,250,180));


		add(panel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		 
		
		
		
		
		
	}
	
	
}
