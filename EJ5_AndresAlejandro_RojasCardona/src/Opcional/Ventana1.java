package Opcional;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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
		
		//Para que no se pueda cambiar el tamaño, vaya para que el que pongo en el .setSize no se cambie
		setResizable(false);
		
		l1 = new JLabel("Escribe tu nombre");
		l1.setAlignmentX(CENTER_ALIGNMENT);
		l1.setFont(new Font("Georgia",Font.BOLD,14));
		
		l2 = new JLabel("¿Cuantos años tienes?");
		l2.setAlignmentX(CENTER_ALIGNMENT);
		l2.setFont(new Font("Georgia",Font.BOLD,14));
		
		nombre = new JTextField();
		nombre.setMaximumSize(new Dimension(150, 25));
		nombre.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
		
		edad = new JTextField(10);
		edad.setMaximumSize(new Dimension(150, 25));
		edad.setAlignmentX(CENTER_ALIGNMENT);

		
		boton = new JButton("Aceptar");
		boton.setAlignmentX(Component.CENTER_ALIGNMENT);
		boton.setBackground(Color.GREEN);
		boton.setFont(new Font("Georgia",Font.BOLD,14));
		
		panel = new JPanel();
		//Esto para establecer que vaya en modo de pila
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.add(l1);
		panel.add(nombre);
		panel.add(l2);
		panel.add(edad);
		panel.add(boton);
		panel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		panel.setBackground(Color.cyan);
		//Con esto hago que los componentes se pongan en el centro
		

		boton.addActionListener(this);
		
		add(panel,BorderLayout.CENTER);
		
		//Cierre de ventana predeterminado
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//Solo un objeto tiene asociado el listener por lo que no hace falta conseguir la fuente del elemento
		Filtro v2 = new Filtro(Integer.parseInt(edad.getText()),nombre.getText());
		setVisible(false);
	}
}
