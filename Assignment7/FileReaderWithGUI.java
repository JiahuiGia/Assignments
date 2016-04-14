package Assignment7;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class FileReaderWithGUI extends JFrame {

	private JLabel inputFilePath;
	private JLabel errorMessage;
	private JTextField filePath;
	private JTextArea displayText;
	private JButton readFile;
	static int i = 0;

	public FileReaderWithGUI() {
		setTitle("FileReader");
		createComponents();
		addComponents();
		addListeners();
		makeItVisible();
	}

	private void makeItVisible() {
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void addListeners() {
		RFListener rfListener = new RFListener();
		readFile.addActionListener(rfListener);
	}

	class RFListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String fp = filePath.getText();
			File f = new File(fp);
			BufferedReader br = null;
			List<String> myList = new ArrayList<String>();
			try {
				br = new BufferedReader(new FileReader(f));
				String str;
				while ((str = br.readLine()) != null) {
					myList.add(str);
				}
			} catch (FileNotFoundException ex) {
				ex.printStackTrace();
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				}
			}
			if (i >= myList.size()) {
				errorMessage = new JLabel("That'all. Thank you!");
				errorMessage.setFont(new Font("TimesNewRoman", Font.PLAIN, 15));
				JOptionPane.showMessageDialog(null, errorMessage);
				i=0;
				displayText.setText("");
			} else {
				displayText.append(myList.get(i)+"\n");
				i++;
			}
		}
	}

	private void addComponents() {
		Container con = getContentPane();
		
		JPanel pathPanel = new JPanel();
		pathPanel.add(inputFilePath);
		pathPanel.add(filePath);
		con.add(pathPanel, BorderLayout.NORTH);
		
		con.add(new JScrollPane(displayText),BorderLayout.CENTER);

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(readFile);
		con.add(buttonPanel, BorderLayout.SOUTH);
	}

	private void createComponents() {
		inputFilePath = new JLabel("File Path:");
		inputFilePath.setFont(new Font("Calibri", Font.BOLD, 20));
		
		filePath = new JTextField(30);
		filePath.setFont(new Font("Calibri", Font.BOLD, 20));
		
		displayText = new JTextArea();
		displayText.setFont(new Font("Calibri", Font.BOLD, 20));
		displayText.setLineWrap(true);
		displayText.setWrapStyleWord(true);
		
		readFile = new JButton("Read File");
		readFile.setFont(new Font("Calibri", Font.BOLD, 20));
	}

	public static void main(String[] args) {
		new FileReaderWithGUI();
	}

}
