package com.library.model;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.library.view.LibraryInterface;

public class LibrarySystem implements ChangeListener {

	private LibraryInterface screen;

	public LibrarySystem() {
		screen = new LibraryInterface("LibrarySystem");
		screen.getTabbedPane().addChangeListener(this);
		screen.setVisible(true);
	}

	@Override // tab t�kland���nda �n plana ��ks�n
	public void stateChanged(ChangeEvent arg0) {
		// from add book tab browse library tab
		if (screen.getTabbedPane().getSelectedIndex() == 1) {
			screen.getTabbedPane().setTitleAt(1, screen.getFiller() + screen.getFiller() + "Browse Library"
					+ screen.getFiller() + screen.getFiller());
			
			screen.setSize(460,460);
		}else{ //from browse library tab to add book tab.
			screen.getTabbedPane().setTitleAt(1, screen.getFiller() + "Browse Library" + screen.getFiller());
			screen.setSize(460,460);
		}

	}
}
