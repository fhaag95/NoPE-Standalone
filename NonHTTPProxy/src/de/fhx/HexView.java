package de.fhx;

import java.awt.BorderLayout;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.jhe.hexed.JHexEditor;
import com.jhe.hexed.JHexEditorASCII;
import com.jhe.hexed.JHexEditorHEX;

public class HexView extends JPanel{
	private JHexEditor hexEditor;
	private boolean readOnly = false;
	
	public HexView() {
		this.setLayout(new BorderLayout());
	}
	
	public HexView(boolean readOnly) {
		this();
		this.readOnly = readOnly;		
	}
	
	private void setHexEditor(JHexEditor editor) {
		this.hexEditor = editor;		
		this.add(this.hexEditor);
	}
	
	public void setReadOnly(boolean value) {
		this.readOnly = value;
	}
	
	public void setContent(byte[] message) {
		this.removeAll();		
		this.setHexEditor(new JHexEditor(message, this.readOnly));		
		this.revalidate();
		this.repaint();
	}
}
