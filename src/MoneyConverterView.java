import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
//a view must have a model 
public class MoneyConverterView extends JFrame {
	
	String [] valute = {"RON", "EUR", "USD"};
	JComboBox comboBox1 = new JComboBox(valute);
	JComboBox comboBox2 = new JComboBox(valute);
	JButton convert = new JButton(">>");
	JTextField input = new JTextField(5);
	JTextField output = new JTextField(5);
	JLabel labelSuma = new JLabel("    ");
	JLabel labelRezultat = new JLabel("    ");
	JLabel labelOMoneda = new JLabel("    ");
	JLabel labelPanel4 = new JLabel("   ");
	JLabel rezultatPanou4 = new JLabel("   ");
	private MoneyConverterModel model;
	
	public MoneyConverterView(MoneyConverterModel model) {
		this.model = model;
		output.setEditable(false);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(comboBox1);
		panel1.add(convert);
		panel1.add(comboBox2);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(new JLabel("SUMA"));
		panel2.add(input);
		panel2.add(labelSuma);
		
		
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		panel3.add(new JLabel("REZULTAT"));
		panel3.add(output);
		panel3.add(labelRezultat);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout());
		panel4.add(new JLabel(" 1 "));
		panel4.add(labelOMoneda);
		panel4.add(new JLabel(" = "));
		panel4.add(rezultatPanou4);
		panel4.add(labelPanel4);
		
		
		
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.add(panel4);
		mainPanel.add(panel1);
		mainPanel.add(panel2);
	
		mainPanel.add(panel3);
		
		this.setContentPane(mainPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,400);
		this.setTitle("Money Converter");
		
		}
	
	public String getUserInput() {
		return input.getText();
	}
	
	public void setRezultat(String rezultat) {
		output.setText(rezultat);
	}
	
	public void setExemplu(String exemplu) {
		rezultatPanou4.setText(exemplu);
	}
	
	
	
	
	public void showError(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
	void addComboBox1Listener(ActionListener listener) {
		comboBox1.addActionListener(listener);
	}
	
	void addComboBox2Listener(ActionListener listener) {
		comboBox2.addActionListener(listener);
	}
	
	void addButtonListener(ActionListener listener) {
		convert.addActionListener(listener);
	}
	
	void addComboBoxesListener(ActionListener listener) {
		comboBox1.addActionListener(listener);
		comboBox2.addActionListener(listener);
	
	}
	
}
