import java.awt.*;
import java.awt.event.*;

public class Ventana 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("Ventana");
		f.setSize(500,500);
		f.setLayout(new BorderLayout());
		
		Label etiqueta = new Label("Hola mundo");
		Label etiqueta2 = new Label("Hola mundo");
		Button boton = new Button("Haz click");
		
		boton.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				etiqueta.setText("¡Botón presionado!");
			}
		});
		
		f.add(boton, BorderLayout.NORTH);
		f.add(etiqueta, BorderLayout.EAST);
		f.add(etiqueta2);

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
}