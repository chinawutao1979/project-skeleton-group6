package framework;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import ui.bank.BankFrm;
import ui.ccard.CardFrm;		


public class Application {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel decriptionLabel;
	private JPanel controlPanel;
	private JLabel msglabel;

	public Application() {
		prepareGUI();
	}

	public static void main(String[] args) {
		Application swingContainerDemo = new Application();
		swingContainerDemo.showJFrameDemo();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Java Swing");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		headerLabel = new JLabel("Head", JLabel.CENTER);
		decriptionLabel = new JLabel("MIU CS525_ADS Group6", JLabel.CENTER);

		decriptionLabel.setSize(350, 100);

		msglabel = new JLabel("Welcome SWING", JLabel.CENTER);

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(decriptionLabel);
		mainFrame.setVisible(true);
	}

	private void showJFrameDemo() {
		headerLabel.setText("Framework Development Lab");

		final JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setLayout(new FlowLayout());
		frame.add(msglabel);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				frame.dispose();
			}
		});
		JButton okButton = new JButton("Banking system");
		JButton okButton2 = new JButton("Credit-Card processing system");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BankFrm.main(null);
				mainFrame.setVisible(false);
			}
		});
		okButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CardFrm.main(null);
				mainFrame.setVisible(false);
			}
		});
		controlPanel.add(okButton);
		controlPanel.add(okButton2);
		mainFrame.setVisible(true);
	}
}
