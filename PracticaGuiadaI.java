package componentesSwing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.*;

public class PracticaGuiadaI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPractica miMarco = new MarcoPractica();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
		
	}

}

class MarcoPractica extends JFrame {
	
	public MarcoPractica() {
		
		setTitle("Editor de Texto");
		setBounds(300, 200, 600, 500);
		
		LaminaPractica miLamina = new LaminaPractica();
		
		add(miLamina);
		
	}
}

class LaminaPractica extends JPanel {
	
	public LaminaPractica() {
		
		setLayout(new BorderLayout());
		
		JMenuBar miBarra = new JMenuBar();
		
		//----------Aqui iran los elementos del Menu-----------
		
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamaño = new JMenu("Tamaño");

		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamaño);
		
		//---------Aqui van los elementos de Fuente-------------
		
		JMenuItem fuente1 = new JMenuItem("Arial Narrow");
		JMenuItem fuente2 = new JMenuItem("Comic Sans");
		JMenuItem fuente3 = new JMenuItem("Verdana");
		JMenuItem fuente4 = new JMenuItem("Tahoma");
		
		fuente1.addActionListener(new StyledEditorKit.FontFamilyAction("cambiarFuente", "Arial Narrow"));
		fuente2.addActionListener(new StyledEditorKit.FontFamilyAction("cambiarFuente", "Comic Sans MS"));
		fuente3.addActionListener(new StyledEditorKit.FontFamilyAction("cambiarFuente", "Verdana"));
		fuente4.addActionListener(new StyledEditorKit.FontFamilyAction("cambiarFuente", "Tahoma"));

		fuente.add(fuente1);
		fuente.add(fuente2);
		fuente.add(fuente3);
		fuente.add(fuente4);

		//---------Aqui van los elementos de Estilo-------------

		JMenuItem negrita = new JMenuItem("Negrita");
		JMenuItem cursiva = new JMenuItem("Cursiva");
		JMenuItem subrayado = new JMenuItem("Subrayado");
		
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		subrayado.addActionListener(new StyledEditorKit.UnderlineAction());
		
		estilo.add(negrita);
		estilo.add(cursiva);
		estilo.add(subrayado);
		
		//---------Aqui van los elementos de Tamaño-------------

		ButtonGroup miGrupo = new ButtonGroup();
		
		JRadioButtonMenuItem boton1 = new JRadioButtonMenuItem("10"); 
		JRadioButtonMenuItem boton2 = new JRadioButtonMenuItem("12"); 
		JRadioButtonMenuItem boton3 = new JRadioButtonMenuItem("14"); 
		JRadioButtonMenuItem boton4 = new JRadioButtonMenuItem("16"); 
		JRadioButtonMenuItem boton5 = new JRadioButtonMenuItem("18"); 
		JRadioButtonMenuItem boton6 = new JRadioButtonMenuItem("20"); 
		JRadioButtonMenuItem boton7 = new JRadioButtonMenuItem("22"); 
		
		boton1.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", 10));
		boton2.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", 12));
		boton3.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", 14));
		boton4.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", 16));
		boton5.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", 18));
		boton6.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", 20));
		boton7.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", 22));

		miGrupo.add(boton1);
		miGrupo.add(boton2);
		miGrupo.add(boton3);
		miGrupo.add(boton4);
		miGrupo.add(boton5);
		miGrupo.add(boton6);
		miGrupo.add(boton7);
		
		tamaño.add(boton1);
		tamaño.add(boton2);
		tamaño.add(boton3);
		tamaño.add(boton4);
		tamaño.add(boton5);
		tamaño.add(boton6);
		tamaño.add(boton7);
		
		add(miBarra, BorderLayout.NORTH);
		
		JTextPane miArea = new JTextPane();
		
		JScrollPane miScroll = new JScrollPane(miArea);
		
		JToolBar miBarraHerramientas = new JToolBar(JToolBar.VERTICAL);
		
		miBarraHerramientas.add(new EfectosTexto("Negrita", new StyledEditorKit.BoldAction(), new ImageIcon("src/componentesSwing/negrita.png")));
		
		miBarraHerramientas.add(new EfectosTexto("Cursiva", new StyledEditorKit.ItalicAction(), new ImageIcon("src/componentesSwing/cursiva.png")));
		
		miBarraHerramientas.add(new EfectosTexto("Subrayado", new StyledEditorKit.UnderlineAction(), new ImageIcon("src/componentesSwing/subrayado.png")));
		
		miBarraHerramientas.addSeparator();
		
		miBarraHerramientas.add(new EfectosTexto("Azul", new StyledEditorKit.ForegroundAction("Color Azul", Color.BLUE), new ImageIcon("src/componentesSwing/azul.png")));

		miBarraHerramientas.add(new EfectosTexto("Verde", new StyledEditorKit.ForegroundAction("Color Verde", Color.GREEN), new ImageIcon("src/componentesSwing/verde.png")));
		
		miBarraHerramientas.add(new EfectosTexto("Rojo", new StyledEditorKit.ForegroundAction("Color Rojo", Color.RED), new ImageIcon("src/componentesSwing/rojo.png")));

		miBarraHerramientas.addSeparator();

		miBarraHerramientas.add(new EfectosTexto("Izquierda", new StyledEditorKit.AlignmentAction("Izquierda", StyleConstants.ALIGN_LEFT), new ImageIcon("src/componentesSwing/alineacion-izquierda.png")));

		miBarraHerramientas.add(new EfectosTexto("Derecha", new StyledEditorKit.AlignmentAction("Derecha", StyleConstants.ALIGN_RIGHT), new ImageIcon("src/componentesSwing/alineacion-derecha.png")));
		
		miBarraHerramientas.add(new EfectosTexto("Centrado", new StyledEditorKit.AlignmentAction("Centrado", StyleConstants.ALIGN_CENTER), new ImageIcon("src/componentesSwing/alineacion-centrada.png")));
		
		miBarraHerramientas.add(new EfectosTexto("Justificado", new StyledEditorKit.AlignmentAction("Justificado", StyleConstants.ALIGN_JUSTIFIED), new ImageIcon("src/componentesSwing/alineacion-justificada.png")));
		
		
		//--------- Eventos de Teclado para Negrita y Cursiva ------------
		
		KeyStroke teclaNegrita = KeyStroke.getKeyStroke("ctrl N");
		KeyStroke teclaCursiva = KeyStroke.getKeyStroke("ctrl K");
		KeyStroke teclaSubrayado = KeyStroke.getKeyStroke("ctrl U");

		InputMap mapaEntrada = miArea.getInputMap(JComponent.WHEN_FOCUSED);

		mapaEntrada.put(teclaNegrita, "Letra Negrita");
		mapaEntrada.put(teclaCursiva, "Letra Cursiva");
		mapaEntrada.put(teclaSubrayado, "Letra Subrayado");
		
		ActionMap mapaAccion = miArea.getActionMap();
		
		mapaAccion.put("Letra Negrita", new StyledEditorKit.BoldAction());	
		mapaAccion.put("Letra Cursiva", new StyledEditorKit.ItalicAction());
		mapaAccion.put("Letra Subrayado", new StyledEditorKit.UnderlineAction());
	
		//--------------- Menu Emergente ----------------------------
		
		JPopupMenu emergente = new JPopupMenu();

		JMenuItem negra = new JMenuItem("Negrita");
		JMenuItem cursa = new JMenuItem("Cursiva");
		JMenuItem subra = new JMenuItem("Subrayado");
		
		negra.addActionListener(new StyledEditorKit.BoldAction());
		cursa.addActionListener(new StyledEditorKit.ItalicAction());
		subra.addActionListener(new StyledEditorKit.UnderlineAction());
		
		emergente.add(negra);
		emergente.add(cursa);
		emergente.add(subra);
		
		miArea.setComponentPopupMenu(emergente);
		
		
		//-------------------------------------------------------------------
		
		add(miScroll, BorderLayout.CENTER);
		
		add(miBarraHerramientas, BorderLayout.WEST);
		
	}
	
	private class EfectosTexto extends AbstractAction { // Clase para efectos, estilos del texto
		
		private Action accion;
		
		public EfectosTexto(String nombre, Action accion, Icon icono) {
			
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "El Texto se pone en " + nombre);
			this.accion = accion;

		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			accion.actionPerformed(e);
		}
	
	}

} //-------- cierre de LaminaPractica (clase)