package de.fhx;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import burp.IMessageEditor;
import net.miginfocom.swing.MigLayout;

public class MessageEditor implements IMessageEditor{

	private RawView rawView = new RawView(this.readOnly);
	private HexView hexView = new HexView(this.readOnly);
	private boolean readOnly;
	private byte[] message;
	
	public MessageEditor() {
		this.readOnly = false;
	}
	
	public MessageEditor(boolean readOnly) {
		this.readOnly = readOnly;
	}
	
	public void setReadOnly(boolean value) {
		this.readOnly = value;
		this.rawView.setReadOnly(value);
		this.hexView.setReadOnly(value);
	}
	
	@Override
	public Component getComponent() {
		
		JPanel view =  new JPanel();
		view.setLayout(new BorderLayout());
		JTabbedPane tabPane = new JTabbedPane();		
		tabPane.add("Raw", rawView);
		tabPane.add("Hex", hexView);
		view.add(tabPane);
		return view;
	}

	@Override
	public void setMessage(byte[] message, boolean isRequest) {
		this.message = message;
		this.rawView.setContent(this.message);
		this.hexView.setContent(this.message);
	}

	@Override
	public byte[] getMessage() {
		
		return this.message;
	}

	@Override
	public boolean isMessageModified() {
		
		return false;
	}

	@Override
	public byte[] getSelectedData() {
		
		return null;
	}

}
