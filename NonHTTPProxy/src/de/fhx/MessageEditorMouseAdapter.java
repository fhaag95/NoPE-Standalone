package de.fhx;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

public class MessageEditorMouseAdapter extends MouseAdapter {
	
	private RawView parent;
	
	public MessageEditorMouseAdapter(RawView parent) {
		super();
		this.parent = parent;
	}
	
	@Override
	public void mouseReleased(MouseEvent me) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Specify a file to save");
		int userSelection = fileChooser.showSaveDialog(me.getComponent());
		if (userSelection == JFileChooser.APPROVE_OPTION) {
			File fileToSave = fileChooser.getSelectedFile();
			FileOutputStream fo;
			try {
				fo = new FileOutputStream(fileToSave);
				fo.write(this.parent.getContent());
				fo.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		
			
		}
	}
}
