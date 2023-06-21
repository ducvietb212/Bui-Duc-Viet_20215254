package GUIProject.hust.soict.globalict.swing;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGrid extends JFrame {
    private JButton[] btnNumbers = new JButton[10];
    private JButton btnDelete, btnReset;
    private JTextField tfDisplay;

    public static void main(String[] args) {
        new NumberGrid();
    }
    public NumberGrid(){
        tfDisplay = new JTextField();
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JPanel panelButtons = new JPanel(new GridLayout(4,3));
        addButtons(panelButtons);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panelButtons,BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(250,250);
        setVisible(true);

    }
    void addButtons(JPanel panelButtons){
        ButtonListener btnListener = new ButtonListener();
        for(int i = 1;i <= 9; i++){
            btnNumbers[i] = new JButton(""+i);
            panelButtons.add(btnNumbers[i]);
            btnNumbers[i].addActionListener(btnListener);
        }
        btnDelete = new JButton("DEL");
        panelButtons.add(btnDelete);
        btnDelete.addActionListener(btnListener);

        btnNumbers[0] = new JButton("0");
        panelButtons.add(btnNumbers[0]);
        btnNumbers[0].addActionListener(btnListener);

        btnReset = new JButton("C");
        panelButtons.add(btnReset);
        btnReset.addActionListener(btnListener);
    }
    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if(button.charAt(0)>='0'&&button.charAt(0)<='9'){
                tfDisplay.setText(tfDisplay.getText()+button);
            }
            else if(button.equals("DEL")){
                //handles the "DEL" case
                int length = tfDisplay.getText().length();
                if(length > 0){
                    try {
                        tfDisplay.setText(tfDisplay.getText(0, length -1));
                    } catch (BadLocationException ex) {
                        ex.printStackTrace();
                    }
                }
                else{
                    tfDisplay.setText("");
                }
            }
            else{
                //handles the "C" case
                tfDisplay.setText("");
            }
        }
    }
}