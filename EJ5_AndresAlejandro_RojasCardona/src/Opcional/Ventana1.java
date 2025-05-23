package Opcional;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana1 extends JFrame implements ActionListener
{
	//Extiende de la clase JFrame para poder usar sus métodos
	//Implemento el actionListener para que esa misma clase pueda añadir un objeto con listener
	
	
	private JLabel l1;
	private JLabel l2;
	private JTextField nombre;
	private JTextField edad;
	private JButton boton;
	private JPanel panel;
	
	Ventana1()
	{
		
		
		//Título de la ventana
		setTitle("Identificador usuario");
		
		//Tamaño de la ventana y posición
			//		X    Y   Tamaño Y  Tamaño X
		setBounds( 650, 300,  500,      350);
		//Con estos ajustes queda en el centro de mi pantalla
		//Este mismo ajuste se puede usar en los elementos de dentro del panel
		//Para organizarlos tal y como quiera
		
		//Cierre de ventana predeterminado
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Para que no se pueda cambiar el tamaño, vaya para que el que pongo en el .setSize no se cambie
		setResizable(false);
		
		l1 = new JLabel("Escribe tu nombre");
		
		
		l2 = new JLabel("¿Cuantos años tienes?");
		
		nombre = new JTextField(10);
		edad = new JTextField(10);
		
		boton = new JButton("Aceptar");
		boton.setBackground(Color.GREEN);
		
		panel = new JPanel();
		//Esto para establecer que vaya en modo de pila
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.add(l1);
		panel.add(nombre);
		panel.add(l2);
		panel.add(edad);
		panel.add(boton);
		//Con esto hago que los componentes se pongan en el centro
		panel.setAlignmentX(JComponent.CENTER_ALIGNMENT);

		boton.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(panel,BorderLayout.CENTER);
		setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource().equals(boton))
		{
			Filtro v2 = new Filtro(Integer.parseInt(edad.getText()),nombre.getText());
			setVisible(false);
		}
	}
}
