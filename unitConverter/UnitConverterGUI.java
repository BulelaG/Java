package unitConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitConverterGUI extends JFrame {
    private JComboBox<String> fromUnitDropdown;
    private JComboBox<String> toUnitDropdown;
    private JTextField quantityField;
    private JLabel resultLabel;

    public UnitConverterGUI() {
        setTitle("Unit Converter");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel fromLabel = new JLabel("From:");
        fromLabel.setBounds(20, 20, 100, 20);
        add(fromLabel);

        fromUnitDropdown = new JComboBox<>(new String[]{"Feet", "Pounds", "Fahrenheit", "Meters", "Kgs", "Celsius"});
        fromUnitDropdown.setBounds(120, 20, 100, 20);
        add(fromUnitDropdown);

        JLabel toLabel = new JLabel("To:");
        toLabel.setBounds(20, 50, 100, 20);
        add(toLabel);

        toUnitDropdown = new JComboBox<>(new String[]{"Meters", "Kgs", "Celsius", "Feet", "Pounds", "Fahrenheit"});
        toUnitDropdown.setBounds(120, 50, 100, 20);
        add(toUnitDropdown);

        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setBounds(20, 80, 100, 20);
        add(quantityLabel);

        quantityField = new JTextField();
        quantityField.setBounds(120, 80, 100, 20);
        add(quantityField);

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(20, 110, 100, 30);
        add(convertButton);

        resultLabel = new JLabel();
        resultLabel.setBounds(20, 150, 300, 20);
        add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convert();
            }
        });
    }

    private void convert() {
        String fromUnit = (String) fromUnitDropdown.getSelectedItem();
        String toUnit = (String) toUnitDropdown.getSelectedItem();
        double quantity = Double.parseDouble(quantityField.getText());

        double result;
        String conversionResult;
        switch (fromUnit.toLowerCase() + "_" + toUnit.toLowerCase()) {
            case "feet_meters":
                result = feetToMeters(quantity);
                conversionResult = quantity + " Feet is equal to " + result + " Meters.";
                break;
            case "meters_feet":
                result = metersToFeet(quantity);
                conversionResult = quantity + " Meters is equal to " + result + " Feet.";
                break;
            case "pounds_kgs":
                result = poundsToKgs(quantity);
                conversionResult = quantity + " Pounds is equal to " + result + " Kgs.";
                break;
            case "kgs_pounds":
                result = kgsToPounds(quantity);
                conversionResult = quantity + " Kgs is equal to " + result + " Pounds.";
                break;
            case "fahrenheit_celsius":
                result = fahrenheitToCelsius(quantity);
                conversionResult = quantity + " Fahrenheit is equal to " + result + " Celsius.";
                break;
            case "celsius_fahrenheit":
                result = celsiusToFahrenheit(quantity);
                conversionResult = quantity + " Celsius is equal to " + result + " Fahrenheit.";
                break;
            default:
                conversionResult = "Invalid conversion units.";
        }
        resultLabel.setText(conversionResult);
    }

    // Conversion methods
    private double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    private double metersToFeet(double meters) {
        return meters / 0.3048;
    }

    private double poundsToKgs(double pounds) {
        return pounds * 0.453592;
    }

    private double kgsToPounds(double kgs) {
        return kgs / 0.453592;
    }

    private double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UnitConverterGUI().setVisible(true);
            }
        });
    }
}
