import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TemperatureConversion extends JFrame{
    private JComboBox<String> conversionType;
    private JTextField inputField;
    private JLabel resultLabel;

    public TemperatureConversion() {
        setTitle("Temperature converter");
        setSize(700,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1));

        Font myFont = new Font("Times New Roman",Font.PLAIN,20);

        String[] conversions = {"Celsius to Fahrenheit","Celsius to Kelvin","Fahrenheit to Celsius","Fahrenheit to Kelvin","Kelvin to celsius","Kelvin to Fahrenheit"};

        conversionType = new JComboBox<>(conversions);
        conversionType.setFont(myFont);
        inputField = new JTextField();
        inputField.setFont(myFont);
        JButton convertButton = new JButton("Convert");
        convertButton.setFont(myFont);
        JLabel selectConversion = new JLabel("Select conversion: ");
        selectConversion.setFont(myFont);

        JLabel enterTemp = new JLabel("Enter the Temperature: ");
        enterTemp.setFont(myFont);

        resultLabel = new JLabel("Result: ");
        resultLabel.setFont(myFont);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                convertTemperature();
            }
        });

        add(selectConversion);
        add(conversionType);
        add(enterTemp);
        add(inputField);
        add(convertButton);
        add(resultLabel);
        setVisible(true);
    }
    private void convertTemperature(){
        try{
            float Temperature = Float.parseFloat(inputField.getText());
            int choice = conversionType.getSelectedIndex();
            double result = 0.0;
            switch (choice) {
                case 0:
                    result = Temperature * (9.0f/5)+32; 
                    break;
                case 1:
                    result = Temperature + 273.15;
                    break;
                case 2:
                    result = (Temperature - 32) *(5.0f/9);
                    break;
                case 3:
                    result = (Temperature- 32) *(5.0f/9) + (273.15);
                    break;
                case 4:
                    result = Temperature - 273.15;
                    break;
                case 5:
                    result = (Temperature- 273.15) *(9.0f/5) +32;
                    break;
            }
            resultLabel.setText("Result: "+result);
        }
        catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid choise!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TemperatureConversion());
    }
}