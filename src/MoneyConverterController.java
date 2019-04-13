import java.awt.event.*;

public class MoneyConverterController {
	private MoneyConverterModel model;
	private MoneyConverterView view;
	
	public MoneyConverterController(MoneyConverterModel model, MoneyConverterView view ) {
		this.model = model;
		this.view = view;
		
		view.addComboBox1Listener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String select = (String) view.comboBox1.getSelectedItem();
				switch(select) {
				case "RON":
					view.labelSuma.setText("RON");
					view.labelOMoneda.setText("RON");
					break;
				case "EUR":
					view.labelSuma.setText("EUR");
					view.labelOMoneda.setText("EUR");
					break;
				case "USD":
					view.labelSuma.setText("USD");
					view.labelOMoneda.setText("USD");
					break;
					
				}
				
			}
		});
		
		view.addComboBox2Listener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String select = (String) view.comboBox2.getSelectedItem();
				switch(select) {
				case "RON":
					view.labelRezultat.setText("RON");
					view.labelPanel4.setText("RON");
					
					break;
				case "EUR": 
					view.labelRezultat.setText("EUR");
					view.labelPanel4.setText("EUR");
					break;
				case "USD":
					view.labelRezultat.setText("USD");
					view.labelPanel4.setText("USD");
					break;
				}
				
			}
		});
		
		view.addButtonListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = "";
				String panel4 = "1";
				String select1 = (String) view.comboBox1.getSelectedItem();
				String select2 = (String) view.comboBox2.getSelectedItem();
				if(select1.equalsIgnoreCase("EUR") && select2.equalsIgnoreCase("RON")) {
					try {
						
						input = view.getUserInput();
						model.converterEurToRon(input);
						view.setRezultat(model.getValue());
					} catch(NumberFormatException ex) {
						view.showError("Bad input: '" + input + "'");
					}
				}
				
				else if(select1.equalsIgnoreCase("EUR") && select2.equalsIgnoreCase("USD")) {
					try {
						input = view.getUserInput();
						model.converterEurToUsd(input);
						view.setRezultat(model.getValue());
					} catch(NumberFormatException ex) {
						view.showError("Bad input: '" + input + "'");
					}
				}
				
				else if(select1.equalsIgnoreCase("EUR") && select2.equalsIgnoreCase("EUR")) {
					try {
						input = view.getUserInput();
						model.converterEurToEur(input);
						view.setRezultat(model.getValue());
					} catch(NumberFormatException ex) {
						view.showError("Bad input: '" + input + "'");
					}
				}
				
				else if(select1.equalsIgnoreCase("RON") && select2.equalsIgnoreCase("EUR")) {
					try {
						
						input = view.getUserInput();
						model.converterRonToEur(input);
						view.setRezultat(model.getValue());
					} catch(NumberFormatException ex) {
						view.showError("Bad input: '" + input + "'");
					}
				}
				
				else if(select1.equalsIgnoreCase("RON") && select2.equalsIgnoreCase("USD")) {
					try {
						input = view.getUserInput();
						model.converterRonToUsd(input);
						view.setRezultat(model.getValue());
					} catch(NumberFormatException ex) {
						view.showError("Bad input: '" + input + "'");
					}
				}
				
				else if(select1.equalsIgnoreCase("RON") && select2.equalsIgnoreCase("RON")) {
					try {
						input = view.getUserInput();
						model.converterRonToRon(input);
						view.setRezultat(model.getValue());
					} catch(NumberFormatException ex) {
						view.showError("Bad input: '" + input + "'");
					}
				}
				
				else if(select1.equalsIgnoreCase("USD") && select2.equalsIgnoreCase("EUR")) {
					try {
						input = view.getUserInput();
						model.converterUsdToEur(input);
						view.setRezultat(model.getValue());
					} catch(NumberFormatException ex) {
						view.showError("Bad input: '" + input + "'");
					}
				}
				
				else if(select1.equalsIgnoreCase("USD") && select2.equalsIgnoreCase("RON")) {
					try {
						input = view.getUserInput();
						model.converterUsdToRon(input);
						view.setRezultat(model.getValue());
					} catch(NumberFormatException ex) {
						view.showError("Bad input: '" + input + "'");
					}
				}
				
				else if(select1.equalsIgnoreCase("USD") && select2.equalsIgnoreCase("USD")) {
					try {
						input = view.getUserInput();
						model.converterUsdToUsd(input);
						view.setRezultat(model.getValue());
					} catch(NumberFormatException ex) {
						view.showError("Bad input: '" + input + "'");
					}
				}
				
				
			}
		});
		
		view.addComboBoxesListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = "1";
				String select1 = (String) view.comboBox1.getSelectedItem();
				String select2 = (String) view.comboBox2.getSelectedItem();
				if(select1.equalsIgnoreCase("EUR") && select2.equalsIgnoreCase("RON")) {
					model.converterEurToRonEx(input);
					view.setExemplu(model.getValueExemplu());
				}
				else if(select1.equalsIgnoreCase("EUR") && select2.equalsIgnoreCase("USD")) {
					model.converterEurToUsdEx(input);
					view.setExemplu(model.getValueExemplu());
				}
				else if(select1.equalsIgnoreCase("EUR") && select2.equalsIgnoreCase("EUR")) {
					model.converterEurToEurEx(input);
					view.setExemplu(model.getValueExemplu());
				}
				else if(select1.equalsIgnoreCase("RON") && select2.equalsIgnoreCase("EUR")) {
					model.converterRonToEurEx(input);
					view.setExemplu(model.getValueExemplu());
				}
				else if(select1.equalsIgnoreCase("RON") && select2.equalsIgnoreCase("USD")) {
					model.converterRonToUsdEx(input);
					view.setExemplu(model.getValueExemplu());
				}
				else if(select1.equalsIgnoreCase("RON") && select2.equalsIgnoreCase("RON")) {
					model.converterRonToRonEx(input);
					view.setExemplu(model.getValueExemplu());
				}
				else if(select1.equalsIgnoreCase("USD") && select2.equalsIgnoreCase("EUR")) {
					model.converterUsdToEurEx(input);
					view.setExemplu(model.getValueExemplu());
				}
				else if(select1.equalsIgnoreCase("USD") && select2.equalsIgnoreCase("RON")) {
					model.converterUsdToRonEx(input);
					view.setExemplu(model.getValueExemplu());
				}
				else if(select1.equalsIgnoreCase("USD") && select2.equalsIgnoreCase("USD")) {
					model.converterUsdToUsdEx(input);
					view.setExemplu(model.getValueExemplu());
				}
				
				
				
				
				
				
				
				
			}
		});
		
		
	}
}
