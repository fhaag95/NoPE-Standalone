package de.fhx;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import net.miginfocom.swing.MigLayout;

public class RawView extends JPanel {
	
	private JTextArea textArea;
	private boolean readOnly = false;
	
	public RawView() {		
		this.setLayout(new BorderLayout());
		this.textArea = new JTextArea();
		this.textArea.setEditable(false);			
		this.add(this.textArea);
	}
	
	public RawView(boolean readOnly) {
		this();
		this.readOnly = readOnly;
	}
	
	public void setReadOnly(boolean value) {
		this.readOnly = value;
	}
	
	public void setContent(byte[] message) {
		textArea.setText(new String(message));		
	}
	

}
