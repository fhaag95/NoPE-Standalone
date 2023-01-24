package de.fhx;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import net.miginfocom.swing.MigLayout;

public class RawView extends JPanel {
	
	private JTextArea textArea;
	private JPopupMenu popup;
	private byte[] message;
	private boolean readOnly = false;
	
	public RawView() {		
		this.setLayout(new BorderLayout());
		this.textArea = new JTextArea();
		this.textArea.setLineWrap(true);
		this.textArea.setEditable(false);	
		popup = new JPopupMenu();
		JMenuItem saveToFile = new JMenuItem("Save To File");
		saveToFile.addMouseListener(new MessageEditorMouseAdapter(this));
		popup.add(saveToFile);
		this.textArea.addMouseListener(new MouseAdapter() {
	         public void mouseReleased(MouseEvent me) {	        	 
	             showPopup(me); // showPopup() is our own user-defined method
	          }
	       });
		
		
		this.add(this.textArea);
	}
	
	private void showPopup(MouseEvent me) {
		popup.show(me.getComponent(), me.getX(), me.getY());
	}
	
	public RawView(boolean readOnly) {
		this();
		this.readOnly = readOnly;
	}
	
	public void setReadOnly(boolean value) {
		this.readOnly = value;
	}
	
	public void setContent(byte[] message) {
		this.message = message;
		textArea.setText(new String(this.message));		
	}
	
	public byte[] getContent() {
		return this.message;
	}
	

}
