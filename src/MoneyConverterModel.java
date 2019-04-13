import java.lang.*;

public class MoneyConverterModel {
	private Double rezultat;
	private Double exemplu;
	
	//private Double input;
	public static final String INITIAL_VALUE = "1";
	
	
	public MoneyConverterModel() {
		
	}
	
	public void converterEurToRon(String input) {
		rezultat = 4.654 * Double.parseDouble(input);
		
	}
	
	
	
	public void converterEurToRonEx(String input) {
		exemplu = 4.654 * Double.parseDouble(input);
	}
	
	
	
	public void converterUsdToRon(String input) {
		rezultat = 4.119 * Double.parseDouble(input);
		
	}
	
	public void converterUsdToRonEx(String input) {
		exemplu = 4.119 * Double.parseDouble(input);
	}
	
	public void converterRonToRon(String input) {
		rezultat = 1 * Double.parseDouble(input);
		
	}
	public void converterRonToRonEx(String input) {
		exemplu = 1 * Double.parseDouble(input);
	}
	
	
	public void converterRonToEur(String input) {
		rezultat = 0.214 * Double.parseDouble(input);
		
	}
	
	public void converterRonToEurEx(String input) {
		exemplu = 0.214 * Double.parseDouble(input);
	}
	
	public void converterUsdToEur(String input) {
		rezultat = 0.885 * Double.parseDouble(input);
		
	}
	
	public void converterUsdToEurEx(String input) {
		exemplu = 0.885 * Double.parseDouble(input);
	}
	
	public void converterEurToEur(String input) {
		rezultat = 1 * Double.parseDouble(input);
		
	}
	
	public void converterEurToEurEx(String input) {
		exemplu = 1 * Double.parseDouble(input);
	}
	
	public void converterRonToUsd(String input) {
		rezultat = 0.242 * Double.parseDouble(input);
		
	}
	
	public void converterRonToUsdEx(String input) {
		exemplu = 0.242 * Double.parseDouble(input);
	}
	
	public void converterEurToUsd(String input) {
		rezultat = 1.129 * Double.parseDouble(input);
		
	}
	
	public void converterEurToUsdEx(String input) {
		
		exemplu = 1.129 * Double.parseDouble(input);
	}
	
	public void converterUsdToUsd(String input) {
		rezultat = 1 * Double.parseDouble(input);
		
	}
	
	public void converterUsdToUsdEx(String input) {
		exemplu = 1 * Double.parseDouble(input);
	}
	
	public void setValue(String value) {
		rezultat = Double.parseDouble(value);
		
	}
	public void setValueExemplu(String value) {
		exemplu = Double.parseDouble(value);
	}
	public String getValue() {
		return rezultat.toString();
	}
	
	public String getValueExemplu() {
		return exemplu.toString();
	}
	
	
	
	
	
	

}
