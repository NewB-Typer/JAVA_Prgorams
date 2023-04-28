package exam.Practise.GUI.calculation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StringOperations extends JFrame {
    private JTextField inputField;
    private JButton reverseButton;
    private JButton palindromeButton;
    private JButton vowelButton;
    private JLabel resultLabel;

    public StringOperations() {
        super("String Operations");

        // Create input field and buttons
        inputField = new JTextField(20);
        reverseButton = new JButton("Reverse");

        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String output = getReverse(input);
                resultLabel.setText("Reverse: " + output);
            }
        });

        palindromeButton = new JButton("Palindrome");
        palindromeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                boolean isPalindrome = isPalindrome(input);
                resultLabel.setText("Palindrome: " + isPalindrome);
            }
        });

        vowelButton = new JButton("Vowels");
        vowelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String vowels = getVowels(input);
                resultLabel.setText("Vowels: " + vowels);
            }
        });

        // Create label for results
        resultLabel = new JLabel();

        // Add components to the frame
        setLayout(new FlowLayout());
        add(new JLabel("Enter a string: "));
        add(inputField);
        add(reverseButton);
        add(palindromeButton);
        add(vowelButton);
        add(resultLabel);

        // Configure the frame
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private boolean isPalindrome(String str) {
        String reversed = getReverse(str);
        return str.equals(reversed);
    }

    private String getReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    private String getVowels(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        new StringOperations();
    }
}
