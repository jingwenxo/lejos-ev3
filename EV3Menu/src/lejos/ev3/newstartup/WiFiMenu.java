package lejos.ev3.newstartup;

import lejos.ev3.newstartup.gui.Submenu;
import lejos.hardware.lcd.Image;

public class WiFiMenu extends Submenu{
	
	static final String ICWIFI = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00f8\u001f\u0000\u0000\u00ff\u00ff\u0000\u00c0\u00ff\u00ff\u0003\u00f0\u00ff\u00ff\u000f\u00f8\u003f\u00fc\u001f\u00fe\u0003\u00c0\u007f\u00ff\u0000\u0000\u00ff\u003f\u0000\u0000\u00fc\u001f\u0000\u0000\u00f8\u000e\u00f8\u001f\u0070\u0000\u00fe\u007f\u0000\u0000\u00ff\u00ff\u0000\u0080\u00ff\u00ff\u0001\u00c0\u003f\u00fc\u0003\u00c0\u0007\u00e0\u0003\u00c0\u0003\u00c0\u0001\u0000\u0000\u0000\u0000\u0000\u00c0\u0003\u0000\u0000\u00e0\u0007\u0000\u0000\u00e0\u0007\u0000\u0000\u00e0\u0007\u0000\u0000\u00e0\u0007\u0000\u0000\u00c0\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
	
	static final String ICPIN = "\u0000\u001f\u0080\u0020\u0040\u0040\u0020\u009c\u0020\u0094\u0020\u009c\u0020\u00c0\u0020\u00a0\u0050\u0054\u0028\u002a\u0094\u001f\u008a\u0000\u00e5\u0000\u0023\u0000\u0031\u0000\u000f\u0000";
	static final String ICNXT = "\u00f8\u001f\u00fc\u003f\u0004\u0020\u00f4\u002f\u0014\u0028\u0034\u0028\u0054\u0028\u00b4\u002a\u00f4\u002f\u0004\u0020\u00b4\u002d\u00a4\u0025\u008c\u0021\u0054\u0020\u00fc\u003f\u00f8\u001f";
	static final String ICPOWER = "\u0080\u0001\u0080\u0001\u00b8\u001d\u00bc\u003d\u00bc\u003d\u009e\u0079\u008e\u0071\u008e\u0071\u000e\u0070\u000e\u0070\u001e\u0078\u003c\u003c\u00fc\u003f\u00f8\u001f\u00e0\u0007\u0000\u0000";
	
	@Override
	public String getTitle() {
		return "WiFi";
	}
	
	@Override
	public Image getIcon() {
		return new Image(32, 32, Utils.stringToBytes8( ICWIFI ) );
	}

	@Override
	public String[] getDetails() {
		return new String[] { "Detail 1", "Detail 2", "Detail 3", "Detail 4"};
	}

	@Override
	public Image[] getItems() {
		return new Image[] { new Image(16, 16, Utils.stringToBytes8(ICPIN) ),
				new Image(16, 16, Utils.stringToBytes8(ICNXT) ),
				new Image(16, 16, Utils.stringToBytes8(ICPOWER) )};
	}
	
}