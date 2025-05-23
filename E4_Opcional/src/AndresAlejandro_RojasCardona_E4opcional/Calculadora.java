package AndresAlejandro_RojasCardona_E4opcional;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener 
{
	private JButton sumar;
	private JButton restar;
	private JButton multiplicar;
	private JButton dividir;	
	
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel op1;
	private JLabel op2;
	private JLabel resultado;	
	
	private JSeparator separador;
	private JSeparator separador2;
	
	private JPanel panel;
	
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	
	public static void main(String[]args)
	{
		Calculadora ventana = new Calculadora();
	}
	
	Calculadora()
	{
		//Para poner la ventana en medio (Mi pantalla)
		setBounds( 650, 300,  1050,      450);
		setTitle("Calculadora");
		setResizable(false);
		
		l1 = new JLabel("Operaciones disponibles: \n1.-Sumar \n2.-Restar \n3.-Multiplicar \n4.-Dividir.");
		l1.setFont(new Font("Georgia",Font.BOLD,14));
		l1.setAlignmentX(CENTER_ALIGNMENT);
		
		l2 = new JLabel("\nLa operación siempre será llevada desde el operando 1 hacia el operando 2. ");
		l2.setFont(new Font("Georgia",Font.BOLD,14));
		l2.setAlignmentX(CENTER_ALIGNMENT);
		
		l3 = new JLabel("EJ: op1 = 1, op2 = 4 (RESTA) op1-op2 = 1-4 = -3");
		l3.setFont(new Font("Georgia",Font.BOLD,14));
		l3.setAlignmentX(CENTER_ALIGNMENT);
		
		l4 = new JLabel("");
		l4.setFont(new Font("Georgia",Font.BOLD,14));
		l4.setAlignmentX(CENTER_ALIGNMENT);
		
		resultado = new JLabel("El resultado de la operación es: ");
		resultado.setFont(new Font("Georgia",Font.BOLD,14));
		resultado.setAlignmentX(CENTER_ALIGNMENT);
		
		op1 = new JLabel("Operando 1");
		op1.setFont(new Font("Georgia",Font.BOLD,14));
		op1.setAlignmentX(CENTER_ALIGNMENT);
		
		op2 = new JLabel("Operando 2");
		op2.setFont(new Font("Georgia",Font.BOLD,14));
		op2.setAlignmentX(CENTER_ALIGNMENT);
		
		
		separador = new JSeparator();
		separador2 = new JSeparator();
		
		t1 = new JTextField();
		t1.setMaximumSize(new Dimension(150, 25));
		t1.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		t2 = new JTextField();
		t2.setMaximumSize(new Dimension(150,25));
		t2.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		t3 = new JTextField();
		t3.setMaximumSize(new Dimension(150,25));
		t3.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		sumar = new JButton("SUMAR");
		sumar.setAlignmentX(Component.CENTER_ALIGNMENT);
		sumar.addActionListener(this);
		
		restar = new JButton("RESTAR");
		restar.setAlignmentX(Component.CENTER_ALIGNMENT);
		restar.addActionListener(this);
		
		multiplicar = new JButton("MULTIPLICAR");
		multiplicar.setAlignmentX(Component.CENTER_ALIGNMENT);
		multiplicar.addActionListener(this);
		
		dividir = new JButton("DIVIDIR");
		dividir.setAlignmentX(Component.CENTER_ALIGNMENT);
		dividir.addActionListener(this);
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(separador);
		panel.add(op1);
		panel.add(t1);
		panel.add(op2);
		panel.add(t2);
		panel.add(resultado);
		panel.add(t3);
		panel.add(l4);
		panel.add(separador2);
		panel.add(sumar);
		panel.add(restar);
		panel.add(multiplicar);
		panel.add(dividir);
		
		add(panel,BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==sumar)
		{
			l4.setText("");
			int o1 = Integer.parseInt(t1.getText());
			int o2 = Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(o1 + o2));
		}
		else if(e.getSource().equals(restar))
		{
			l4.setText("");
			int o1 = Integer.parseInt(t1.getText());
			int o2 = Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(o1 - o2));
		}
		else if(e.getSource().equals(multiplicar))
		{
			l4.setText("");
			int o1 = Integer.parseInt(t1.getText());
			int o2 = Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(o1 * o2));
		}
		else if(e.getSource().equals(dividir))
		{
			l4.setText("");
			int o1 = Integer.parseInt(t1.getText());
			int o2 = Integer.parseInt(t2.getText());
			try
			{
				t3.setText(String.valueOf(o1 / o2));
			}
			catch(ArithmeticException ex)
			{
				l4.setText("NO SE PUEDE DIVIDIR POR CERO, TIENES QUE CAMBIAR EL SEGUNDO OPERANDO");
			}
		}
	}

	
	
	
}
