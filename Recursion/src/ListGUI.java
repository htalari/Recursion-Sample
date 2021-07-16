/**
 * View represents the GUI that is shown when the program is first run
 * @author Talari
 * version 1.0
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ListGUI implements ActionListener{
	AddressList list = new AddressList();
	JFrame frame;
	JPanel panel;
	JLabel title;
	JLabel searching;
	JLabel name;
	JLabel phone;
	JLabel email;
	JLabel address;
	JLabel dob;
	JLabel phoneByName;
	JLabel emailByName;
	JLabel nameByPhone;
	JLabel dobByName;
	JLabel printList;
	JLabel line;
	JTextField dobByNameField;
	JTextField nameByPhoneField;
	JTextField emailByNameField;
	JTextField phoneByNameField;
	JTextField dobField;
	JTextField addressField;
	JTextField emailField;
	JTextField phoneField;
	JTextField nameField;
	JButton printListBtn;
	JButton printListReverseBtn;
	JButton dobByNameBtn;
	JButton nameByPhoneBtn;
	JButton emailByNameBtn;
	JButton phoneByNameBtn;
	JButton addToFrontBtn;
	JButton addToBackBtn;
	JButton reverseListBtn;
	JButton sizeBtn;
	JTextArea allText;
	JScrollPane scrollAllText;
	String str;
	
	/**
	 * Constructor which creates the GUI that is first displayed to the user.
	 */
	public ListGUI() {
		frame = new JFrame("Address List");
		frame.setPreferredSize(new Dimension(800,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		this.createLabels();
		this.createTextFields();
		this.createButtons();
		this.createTextAreas();
		this.addPanel();
		
		printListBtn.addActionListener(this);
		printListReverseBtn.addActionListener(this);
		dobByNameBtn.addActionListener(this);
		nameByPhoneBtn.addActionListener(this);
		emailByNameBtn.addActionListener(this);
		phoneByNameBtn.addActionListener(this);
		addToFrontBtn.addActionListener(this);
		addToBackBtn.addActionListener(this);
		reverseListBtn.addActionListener(this);
		sizeBtn.addActionListener(this);
		
		
		frame.add(panel);
	}
	/**
	 * Method that makes the GUI visible to the user
	 */
	public void see() {
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	/**
	 * private helper method that adds all GUI Components to a JPanel named panel
	 */
	private void addPanel() {
		panel.add(title);
		panel.add(name);
		panel.add(nameField);
		panel.add(phone);
		panel.add(phoneField);
		panel.add(email);
		panel.add(emailField);
		panel.add(address);
		panel.add(addressField);
		panel.add(dob);
		panel.add(dobField);
		panel.add(addToFrontBtn);
		panel.add(addToBackBtn);
		panel.add(searching);
		panel.add(phoneByName);
		panel.add(phoneByNameField);
		panel.add(phoneByNameBtn);
		panel.add(emailByName);
		panel.add(emailByNameField);
		panel.add(emailByNameBtn);
		panel.add(nameByPhone);
		panel.add(nameByPhoneBtn);
		panel.add(nameByPhoneField);
		panel.add(dobByName);
		panel.add(dobByNameBtn);
		panel.add(dobByNameField);
		panel.add(printList);
		panel.add(printListBtn);
		panel.add(printListReverseBtn);
		panel.add(scrollAllText);
		panel.add(line);
		panel.add(reverseListBtn);
		panel.add(sizeBtn);
	}
	/**
	 * private helper method that creates and sets the bounds for each JLabel in GUI
	 */
	private void createLabels() {
		title = new JLabel("Address List");
		title.setBounds(360, 10, 100, 20);
		
		name = new JLabel("Name");
		name.setBounds(70, 50, 100, 20);
		
		phone = new JLabel("Phone");
		phone.setBounds(230, 50, 100, 20);
		
		email = new JLabel("Email");
		email.setBounds(390, 50, 100, 20);
		
		address = new JLabel("Address");
		address.setBounds(550, 50, 100, 20);
		
		dob = new JLabel("Date of Birth");
		dob.setBounds(690, 50, 100, 20);
		
		searching = new JLabel("Specific Searches ------------------------------------");
		searching.setBounds(50, 180, 500, 20);
		
		phoneByName = new JLabel("Phone Number By Name:");
		phoneByName.setBounds(50, 220, 170, 20);
		
		emailByName = new JLabel("Email by Name:");
		emailByName.setBounds(50, 250, 150, 20);
		
		nameByPhone = new JLabel("Name by Phone Number:");
		nameByPhone.setBounds(50, 280, 170, 20);
		
		dobByName = new JLabel("Date of Birth by Name:");
		dobByName.setBounds(50, 310, 170, 20);
		
		printList = new JLabel("Print Entire List -------------------------------------");
		printList.setBounds(50, 350, 500, 20);
		
		line = new JLabel("-------------------------------------------------");
		line.setBounds(50, 400, 500, 20);
				
	}
	/**
	 * private helper method which creates and sets bounds for each JTextField in the GUI
	 */
	private void createTextFields() {
		nameField = new JTextField();
		nameField.setBounds(40, 70, 100, 20);
		
		phoneField = new JTextField();
		phoneField.setBounds(200, 70, 100, 20);
		
		emailField = new JTextField();
		emailField.setBounds(360, 70, 100, 20);
		
		addressField = new JTextField();
		addressField.setBounds(520, 70, 110, 20);
		
		dobField = new JTextField();
		dobField.setBounds(680, 70, 100, 20);
		
		phoneByNameField = new JTextField();
		phoneByNameField.setBounds(220, 220, 100, 20);
		
		emailByNameField = new JTextField();
		emailByNameField.setBounds(220, 250, 100, 20);
		
		nameByPhoneField = new JTextField();
		nameByPhoneField.setBounds(220, 280, 100, 20);
		
		dobByNameField = new JTextField();
		dobByNameField.setBounds(220, 310, 100, 20);
	}
	/**
	 * private helper method that creates and sets the bounds of each JButton in the GUI
	 */
	private void createButtons() {
		addToFrontBtn = new JButton("Add To Front");
		addToFrontBtn.setBounds(270, 120, 100, 20);
		
		addToBackBtn = new JButton("Add To Back");
		addToBackBtn.setBounds(430, 120, 100, 20);
		
		phoneByNameBtn = new JButton("Confirm");
		phoneByNameBtn.setBounds(350, 220, 100, 20);
		
		emailByNameBtn = new JButton("Confirm");
		emailByNameBtn.setBounds(350, 250, 100, 20);
		
		nameByPhoneBtn = new JButton("Confirm");
		nameByPhoneBtn.setBounds(350, 280, 100, 20);
		
		dobByNameBtn = new JButton("Confirm");
		dobByNameBtn.setBounds(350, 310, 100, 20);
		
		printListBtn = new JButton("Print List");
		printListBtn.setBounds(100, 380, 100, 20);
		
		printListReverseBtn = new JButton("Print List in Reverse");
		printListReverseBtn.setBounds(250, 380, 170, 20);
		
		reverseListBtn = new JButton("Reverse Entire List");
		reverseListBtn.setBounds(100, 430, 170, 20);
		
		sizeBtn = new JButton("Size of List");
		sizeBtn.setBounds(300, 430, 100, 20);
		
	}
	/**
	 * Private helper method that creates the JTextArea and JScrollPane for the GUI 
	 */
	private void createTextAreas() {
		allText = new JTextArea();
		allText.setEditable(false);
		scrollAllText = new JScrollPane(allText);
		scrollAllText.setBounds(500, 180, 280, 280);
		
	}

	@Override
	/**
	 * method that checks if any button in the GUI has been pressed
	 * @param e
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == printListBtn) {
			this.printList();
		}
		if(e.getSource() == printListReverseBtn) {
			this.printReverseList();
		}
		if(e.getSource() == phoneByNameBtn) {
			this.getPhoneByName();
		}
		if(e.getSource() == emailByNameBtn) {
			this.getEmailByName();
		}
		if(e.getSource() == nameByPhoneBtn) {
			this.getNameByPhone();
		}
		if(e.getSource() == dobByNameBtn) {
			this.getDobByName();
		}
		if(e.getSource() == addToFrontBtn) {
			this.addToFrontPressed();
		}
		if(e.getSource() == addToBackBtn) {
			this.addToBackPressed();
		}
		if(e.getSource() == sizeBtn)
		{
			this.getSize();
		}
		if(e.getSource() == reverseListBtn) {
			this.reverseList();
		}
	}
	private void reverseList() {
		if(list.isEmpty()) {
			JOptionPane.showMessageDialog(null, "List empty no need to reverse", "List empty no need to reverse", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			list.reverse();
			JOptionPane.showMessageDialog(null, "Successful", "Successful", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	/**
	 * private helper method which prints out the size of the linked list in the text area
	 */
	private void getSize() {
		int size = list.sizeOf();
		allText.setText(null);
		allText.append(size + " ");
	}
	/**
	 * private helper method that adds all of the text typed at the top of the GUI to the back of 
	 * the linked list.
	 */
	private void addToBackPressed() {
		if(nameField.getText().equals("") && addressField.getText().equals("") && phoneField.getText().equals("") && emailField.getText().equals("") && dobField.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Please enter text in at least one box ", "Please Enter text in at least one box", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			String name = nameField.getText();
			String addr = addressField.getText();
			String phone = phoneField.getText();
			String email = emailField.getText();
			String dob = dobField.getText();
			
			list.addToBack(name, phone, email, addr, dob);
		}
	}
	/**
	 * private helper method that adds all of the text typed at the top of the GUI to the front of 
	 * the linked list. 
	 */
	private void addToFrontPressed() {
		if(nameField.getText().equals("") && addressField.getText().equals("") && phoneField.getText().equals("") && emailField.getText().equals("") && dobField.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Please enter text in at least one box ", "Please Enter text in at least one box", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			String name = nameField.getText();
			String addr = addressField.getText();
			String phone = phoneField.getText();
			String email = emailField.getText();
			String dob = dobField.getText();
			
			list.addToFront(name, phone, email, addr, dob);
		}
	}
	/**
	 * private helper method that grabs the text from the text field pertaining to 
	 * getting the date of birth by name and tries to find the correlated date of birth
	 * 
	 * method also displays results to the text area
	 */
	private void getDobByName() {
		str = dobByNameField.getText();
		str = list.dobByName(str);
		allText.setText(null);
		allText.append(str);
		 
	}
	/**
	 * private helper method that grabs the text from the text field that pertains to 
	 * getting a name from a phone number and tries to find the correlating name. 
	 * 
	 * method also displays results to the text area 
	 */
	private void getNameByPhone() {
		str = nameByPhoneField.getText();
		str = list.nameByPhoneNumber(str);
		allText.setText(null);
		allText.append(str);
	}
	/**
	 * private helper method that grabs the text from the email by name text field 
	 * and tries to find the correlating email from the name given
	 * 
	 * method also displays all text to text area 
	 */
	private void getEmailByName() {
		str = emailByNameField.getText();
		str = list.emailByName(str);
		allText.setText(null);
		allText.append(str);
	}
	/**
	 * private helper method that grabs the text from the text field that pertains to getting 
	 * a phone number from a name and tries to find the correlating phone number. 
	 */
	private void getPhoneByName() {
		str = phoneByNameField.getText();
		str = list.phoneNumberByName(str);
		allText.setText(null);
		allText.append(str);
	}
	/**
	 * private helper method that displays the reverse order of the linked list on the text area 
	 */
	private void printReverseList() {
		str = list.reverseToString();
		allText.setText(null);
		allText.append(str);
	}
	/**
	 * private helper method that displays linked list in order in the text area. 
	 */
	private void printList() {
		str = list.ToString();
		allText.setText(null);
		allText.append(str);
	}
}
