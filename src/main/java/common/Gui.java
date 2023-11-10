package common;// Java program to implement
// a Simple Registration Form
// using Java Swing

import decathlon.Deca100M;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame
        extends JFrame
        implements ActionListener {

    // Components of the Form
    private Container c;
    double result;
    private JTextField txtName;
    private JLabel lblResult;
    private JTextField txtResult;
    private JLabel lblGender;
    private JRadioButton rbMale;
    private JRadioButton rbFemale;
    private ButtonGroup btnGrpGender;
    private JLabel lblDiscipline;
    private JComboBox CBDiscipline;
    private JButton btnSubmit;
    private JButton btnReset;
    private JTextArea txtOutput;
    private JLabel lblStatus;

    private String discipline[]
            = {"Deca100M", "Deca110MHurdles", "Deca400M", "Deca1500M", "DecaDiscusThrow",
            "DecaHighJump", "DecaJavelinThrow", "DecaLongJump", "DecaPoleVault", "DecaShotPut"};
    private String months[]
            = {"Hep100MHurdles", "Hep200M", "Hep800M", "HeptHightJump",
            "HeptJavelinThrow", "HeptLongJump", "HeptShotPut"};
    private double decaMax[]
            = {17.8};
    private double decaMin[]
            = {5};

    // constructor, to initialize the components
    // with default values.
    public MyFrame() {
        setTitle("All round scoring system");
        setBounds(300, 90, 900, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        JLabel lblTitle = new JLabel("Scoring form");
        lblTitle.setFont(new Font("Arial", Font.PLAIN, 30));
        lblTitle.setSize(300, 30);
        lblTitle.setLocation(300, 30);
        c.add(lblTitle);

        JLabel lblName = new JLabel("Name:");
        lblName.setFont(new Font("Arial", Font.PLAIN, 20));
        lblName.setSize(100, 20);
        lblName.setLocation(100, 100);
        c.add(lblName);

        txtName = new JTextField();
        txtName.setFont(new Font("Arial", Font.PLAIN, 15));
        txtName.setSize(190, 20);
        txtName.setLocation(200, 100);
        c.add(txtName);


        lblGender = new JLabel("Gender");
        lblGender.setFont(new Font("Arial", Font.PLAIN, 20));
        lblGender.setSize(100, 20);
        lblGender.setLocation(100, 150);
        c.add(lblGender);

        rbMale = new JRadioButton("Male");
        rbMale.setFont(new Font("Arial", Font.PLAIN, 15));
        rbMale.setSelected(true);
        rbMale.setSize(75, 20);
        rbMale.setLocation(200, 150);
        c.add(rbMale);

        rbFemale = new JRadioButton("Female");
        rbFemale.setFont(new Font("Arial", Font.PLAIN, 15));
        rbFemale.setSelected(false);
        rbFemale.setSize(80, 20);
        rbFemale.setLocation(275, 150);
        c.add(rbFemale);

        btnGrpGender = new ButtonGroup();
        btnGrpGender.add(rbMale);
        btnGrpGender.add(rbFemale);

        lblDiscipline = new JLabel("Discipline:");
        lblDiscipline.setFont(new Font("Arial", Font.PLAIN, 20));
        lblDiscipline.setSize(100, 20);
        lblDiscipline.setLocation(100, 200);
        c.add(lblDiscipline);

        CBDiscipline = new JComboBox(discipline);
        CBDiscipline.setFont(new Font("Arial", Font.PLAIN, 15));
        CBDiscipline.setSize(150, 20);
        CBDiscipline.setLocation(200, 200);
        c.add(CBDiscipline);

        lblResult = new JLabel("Result:");
        lblResult.setFont(new Font("Arial", Font.PLAIN, 20));
        lblResult.setSize(100, 20);
        lblResult.setLocation(100, 250);
        c.add(lblResult);

        txtResult = new JTextField();
        txtResult.setFont(new Font("Arial", Font.PLAIN, 15));
        txtResult.setSize(150, 20);
        txtResult.setLocation(200, 250);
        c.add(txtResult);

        btnSubmit = new JButton("Submit");
        btnSubmit.setFont(new Font("Arial", Font.PLAIN, 15));
        btnSubmit.setSize(100, 20);
        btnSubmit.setLocation(150, 300);
        btnSubmit.addActionListener(this);
        c.add(btnSubmit);

        btnReset = new JButton("Clear");
        btnReset.setFont(new Font("Arial", Font.PLAIN, 15));
        btnReset.setSize(100, 20);
        btnReset.setLocation(270, 300);
        btnReset.addActionListener(this);
        c.add(btnReset);

        txtOutput = new JTextArea();
        txtOutput.setFont(new Font("Arial", Font.PLAIN, 15));
        txtOutput.setSize(300, 200);
        txtOutput.setLocation(500, 100);
        txtOutput.setLineWrap(true);
        txtOutput.setEditable(false);
        c.add(txtOutput);

        lblStatus = new JLabel("Spara!!");
        lblStatus.setFont(new Font("Arial", Font.PLAIN, 20));
        lblStatus.setSize(500, 25);
        lblStatus.setLocation(100, 350);
        c.add(lblStatus);

        ActionListener maleListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(CBDiscipline);
                CBDiscipline = new JComboBox(discipline);
                CBDiscipline.setFont(new Font("Arial", Font.PLAIN, 15));
                CBDiscipline.setSize(150, 20);
                CBDiscipline.setLocation(200, 200);
                c.add(CBDiscipline);
                c.revalidate(); // Revalidate the container
                c.repaint();    // Repaint the container
            }
        };

        ActionListener femaleListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(CBDiscipline);
                CBDiscipline = new JComboBox(months);
                CBDiscipline.setFont(new Font("Arial", Font.PLAIN, 15));
                CBDiscipline.setSize(150, 20);
                CBDiscipline.setLocation(200, 200);
                c.add(CBDiscipline);
                c.revalidate(); // Revalidate the container
                c.repaint();    // Repaint the container
            }
        };

        rbMale.addActionListener(maleListener);
        rbFemale.addActionListener(femaleListener);


        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            //Placeholder if statement
            if (1 == 1) {
                try{
                    result = Double.parseDouble(txtResult.getText());
                }catch (Exception error) {
                    lblStatus.setText("Only numbers in result field!!");
                    return;
                }
                String data1;
                String data
                        = "Name: "
                        + txtName.getText() + "\n";
                if (rbMale.isSelected())
                    data1 = "Gender: Male"
                            + "\n";
                else
                    data1 = "Gender: Female"
                            + "\n";
                String data2
                        = "Discipline: "
                        + (String) CBDiscipline.getSelectedItem()
                        + "\n";
                String data3
                        = "Result: "
                        + txtResult.getText() + "\n";
                Object selectedItem = CBDiscipline.getSelectedItem();
                int score = 0;
                if (selectedItem.equals("Deca100M")) {
                    if (decaMin[0] > result){
                        lblStatus.setText("Result too damn low!");
                        return;
                    } else if (decaMax[0] < result) {
                        lblStatus.setText("Result too damn high!");
                        return;
                    }else {
                        Deca100M deca100M = new Deca100M();
                        deca100M.calculateResult(result);
                        score = deca100M.getScore();
                    }

                } else if (selectedItem.equals("Deca110MHurdles")) {
                    System.out.println("Plz work");
                }
                String data4
                        = "Score: " + Integer.toString(score);

                txtOutput.setText(data + data1 + data2 + data3 + data4);
                txtOutput.setEditable(false);
                lblStatus.setText("Registration Successfully..");
            } else {
                System.out.println("Or else what?");

            }
        }
        else if (e.getSource() == btnReset) {
            String def = "";
            txtName.setText(def);
            txtResult.setText(def);
            lblStatus.setText(def);
            txtOutput.setText(def);
            rbMale.doClick();
            CBDiscipline.setSelectedIndex(0);
        }
    }
}

// Driver Code
class Registration {

    public static void main(String[] args) throws Exception {
        MyFrame f = new MyFrame();
    }
}
