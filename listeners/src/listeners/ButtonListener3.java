package listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonListener3 extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
	//	super.mouseClicked(e);
		System.out.println("Click responded to by adapter.");
	}

}
