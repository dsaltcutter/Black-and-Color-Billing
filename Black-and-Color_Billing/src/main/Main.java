package main;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import ui.BillingFrame;

public class Main {

	static BillingFrame billingFrame;
	
	public static void main(String[] args) {

		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		createMainFrame();
		
		
	}
	
	public static void createMainFrame() {
		billingFrame = new BillingFrame();
	}
	
	public BillingFrame getBillingFrame() {
		return billingFrame;
	}
}
