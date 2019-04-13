import javax.swing.*;

public class MainClass {

	public static void main(String[] args) {
		MoneyConverterModel model = new MoneyConverterModel();
		MoneyConverterView view = new MoneyConverterView(model);
		MoneyConverterController controller = new MoneyConverterController(model ,view);
		view.setVisible(true);

	}

}
