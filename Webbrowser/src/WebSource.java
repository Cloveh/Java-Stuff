import java.awt.event.KeyAdapter;

import org.eclipse.swt.*;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.*;

import chrriis.dj.nativeswing.NativeComponentWrapper;
import chrriis.dj.nativeswing.NativeSwing;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

public class WebSource {

	public static void main(String[] args) {
		NativeSwing.initialize();
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setSize(1920, 1080);
		

		Button button = new Button(shell, SWT.PUSH);
		button.setText("<--");
		button.setSize(100, 45);
		button.setLocation(100, 15);
		
		Button button2 = new Button(shell, SWT.PUSH);
		button2.setText("REFRESH");
		button2.setSize(100, 45);
		button2.setLocation(1700, 15);
		
		Button button3 = new Button(shell, SWT.PUSH);
		button3.setText("SEARCH");
		button3.setSize(100, 45);
		button3.setLocation(1600, 15);
		
		Button button4 = new Button(shell, SWT.PUSH);
		button4.setText("-->");
		button4.setSize(100, 45);
		button4.setLocation(200, 15);
		
		Text addressBar = new Text(shell, 1);
		addressBar.setLocation(300, 15);
		addressBar.setSize(1500, 45);
		
		Browser browser = new Browser(shell, 0);
		browser.setSize(1900, 920);
		browser.setLocation(10, 80);
		
		browser.setUrl("http://google.com");
		button3.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
				clicked();
			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				clicked();
			}

			@Override
			public void mouseUp(MouseEvent arg0) {
				
			}
			
			private void clicked() {
				browser.setUrl(addressBar.getText());
			}
			
		});
		button4.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
				clicked();
			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				clicked();
			}

			@Override
			public void mouseUp(MouseEvent arg0) {
				
			}
			
			private void clicked() {
				browser.forward();
			}
			
		});
		button.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
				clicked();
			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				clicked();
			}

			@Override
			public void mouseUp(MouseEvent arg0) {
				
			}
			
			private void clicked() {
				browser.back();
			}
			
		});
		button2.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
				clicked();
			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				clicked();
			}

			@Override
			public void mouseUp(MouseEvent arg0) {
				
			}
			
			private void clicked() {
				browser.refresh();
			}
			
		});
		
		addressBar.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				if (arg0.keyCode == 13)
					browser.setUrl(addressBar.getText());
			}
			
		});
		
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
