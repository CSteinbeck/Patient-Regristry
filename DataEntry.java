package FinalEntry;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

/**
 * Created by calebtaylor on 1/3/2017.
 */
public class DataEntry extends JFrame {
    private JPanel Submit;
    private JPanel WestSide;
    private JPanel EastSide;
    private JTextField FirstName;
    private JTextField LastName;
    private JTextField Gender;
    private JTextField Age;
    private JTextField Description;
    private JButton submitButton;
    private final static List<DataEntry1> dataForm = new ArrayList<DataEntry1>();
    public DataEntry(){
        super("Entry Panel");


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("DataEntry");
                dataForm.add(new DataEntry1(FirstName.getText(), LastName.getText(),
                        Gender.getText(), Age.getText(), Description.getText()));



            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DataEntry");
        frame.setContentPane(new DataEntry().Submit);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);

    }
}
