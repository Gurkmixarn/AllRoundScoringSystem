package common;// Java program to implement
// a Simple Registration Form
// using Java Swing

import decathlon.*;
import heptathlon.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {

    // Components of the Form
    private final Container c;
    double result;
    private final JTextField txtName;
    private final JTextField txtResult;
    private final JRadioButton rbMale;
    private JLabel lblDiscipline;
    private JComboBox CBDiscipline;
    private final JButton btnSubmit;
    private final JButton btnReset;
    private final JTextArea txtOutput;
    private final JLabel lblStatus;

    private final String[] decathlon
            = {"Deca100M", "Deca110MHurdles", "Deca400M", "Deca1500M", "DecaDiscusThrow",
            "DecaHighJump", "DecaJavelinThrow", "DecaLongJump", "DecaPoleVault", "DecaShotPut"};
    private final String[] heptathlon
            = {"Hep100MHurdles", "Hep200M", "Hep800M", "HeptHightJump",
            "HeptJavelinThrow", "HeptLongJump", "HeptShotPut"};
    private final double[] decaMin
            = {5, 10, 20, 2, 0, 0, 0, 250, 2, 0};
    private final double[] decaMax
            = {17.8, 28.5, 100, 7, 85, 300, 110, 1000, 1000, 30};
    private final double[] heptaMin = {5, 14, 70, 75.7, 0, 0, 5};
    private final double[] heptaMax = {26.4, 42.08, 250.79, 270, 100, 400, 100};


    // constructor, to initialize the components
    // with default values.
    public Gui() {
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


        JLabel lblGender = new JLabel("Gender");
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

        JRadioButton rbFemale = new JRadioButton("Female");
        rbFemale.setFont(new Font("Arial", Font.PLAIN, 15));
        rbFemale.setSelected(false);
        rbFemale.setSize(80, 20);
        rbFemale.setLocation(275, 150);
        c.add(rbFemale);

        ButtonGroup btnGrpGender = new ButtonGroup();
        btnGrpGender.add(rbMale);
        btnGrpGender.add(rbFemale);

        lblDiscipline = new JLabel("Discipline:");
        lblDiscipline.setFont(new Font("Arial", Font.PLAIN, 20));
        lblDiscipline.setSize(100, 20);
        lblDiscipline.setLocation(100, 200);
        c.add(lblDiscipline);

        CBDiscipline = new JComboBox(decathlon);
        CBDiscipline.setFont(new Font("Arial", Font.PLAIN, 15));
        CBDiscipline.setSize(150, 20);
        CBDiscipline.setLocation(200, 200);
        c.add(CBDiscipline);

        JLabel lblResult = new JLabel("Result:");
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

        lblStatus = new JLabel("");
        lblStatus.setFont(new Font("Arial", Font.PLAIN, 20));
        lblStatus.setSize(500, 25);
        lblStatus.setLocation(100, 350);
        c.add(lblStatus);

        ActionListener maleListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.remove(CBDiscipline);
                CBDiscipline = new JComboBox(decathlon);
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
                CBDiscipline = new JComboBox(heptathlon);
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
            String compName = txtName.getText();
            if (txtName.getText().trim().isEmpty()) {
                lblStatus.setText("Competitor's name cannot be empty.");
                return;
            } else if (!compName.matches("^[\\p{L} \\p{M}]+$")) {
                lblStatus.setText("Only use letters when putting in competitors name.");
                return;
            }
            try {
                result = Double.parseDouble(txtResult.getText());
            } catch (Exception error) {
                lblStatus.setText("Only numbers and not empty in result field!");
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
                if (decaMin[0] > result) {
                    lblStatus.setText("Result is too low! Range: (" + decaMin[0] + "-" + decaMax[0] + ")");
                    return;
                } else if (decaMax[0] < result) {
                    lblStatus.setText("Result is too high! Range: (" + decaMin[0] + "-" + decaMax[0] + ")");
                    return;
                } else {
                    Deca100M deca100M = new Deca100M();
                    deca100M.calculateResult(result);
                    score = deca100M.getScore();
                }

            } else if (selectedItem.equals("Deca110MHurdles")) {
                if (decaMin[1] > result) {
                    lblStatus.setText("Result is too low! Range: (" + decaMin[1] + "-" + decaMax[1] + ")");
                    return;
                } else if (decaMax[1] < result) {
                    lblStatus.setText("Result is too high! Range: (" + decaMin[1] + "-" + decaMax[1] + ")");
                    return;
                } else {
                    Deca110MHurdles deca110MHurdles = new Deca110MHurdles();
                    deca110MHurdles.calculateResult(result);
                    score = deca110MHurdles.getScore();
                }
            } else if (selectedItem.equals("Deca400M")) {
                if (decaMin[2] > result) {
                    lblStatus.setText("Result is too low! Range: (" + decaMin[2] + "-" + decaMax[2] + ")");
                    return;
                } else if (decaMax[2] < result) {
                    lblStatus.setText("Result is too high! Range: (" + decaMin[2] + "-" + decaMax[2] + ")");
                    return;
                } else {
                    Deca400M deca400M = new Deca400M();
                    deca400M.calculateResult(result);
                    score = (int) deca400M.getScore();
                }
            } else if (selectedItem.equals("Deca1500M")) {
                if (decaMin[3] > result) {
                    lblStatus.setText("Result is too low! Range: (" + decaMin[3] + "-" + decaMax[3] + ")");
                    return;
                } else if (decaMax[3] < result) {
                    lblStatus.setText("Result is too high! Range: (" + decaMin[3] + "-" + decaMax[3] + ")");
                    return;
                } else {
                    Deca1500M deca1500M = new Deca1500M();
                    deca1500M.calculateResult(result);
                    score = (int) deca1500M.getScore();
                }
            } else if (selectedItem.equals("DecaDiscusThrow")) {
                if (decaMin[4] > result) {
                    lblStatus.setText("Result is too low! Range: (" + decaMin[4] + "-" + decaMax[4] + ")");
                    return;
                } else if (decaMax[4] < result) {
                    lblStatus.setText("Result is too high! Range: (" + decaMin[4] + "-" + decaMax[4] + ")");
                    return;
                } else {
                    DecaDiscusThrow decaDiscusThrow = new DecaDiscusThrow();
                    decaDiscusThrow.calculateResult(result);
                    score = (int) decaDiscusThrow.getScore();
                }
            } else if (selectedItem.equals("DecaHighJump")) {
                if (decaMin[5] > result) {
                    lblStatus.setText("Result is too low! Range: (" + decaMin[5] + "-" + decaMax[5] + ")");
                    return;
                } else if (decaMax[5] < result) {
                    lblStatus.setText("Result is too high! Range: (" + decaMin[5] + "-" + decaMax[5] + ")");
                    return;
                } else {
                    DecaHighJump decaHighJump = new DecaHighJump();
                    decaHighJump.calculateResult(result);
                    score = (int) decaHighJump.getScore();
                }
            } else if (selectedItem.equals("DecaJavelinThrow")) {
                if (decaMin[6] > result) {
                    lblStatus.setText("Result is too low! Range: (" + decaMin[6] + "-" + decaMax[6] + ")");
                    return;
                } else if (decaMax[6] < result) {
                    lblStatus.setText("Result is too high! Range: (" + decaMin[6] + "-" + decaMax[6] + ")");
                    return;
                } else {
                    DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow();
                    decaJavelinThrow.calculateResult(result);
                    score = (int) decaJavelinThrow.getScore();
                }
            } else if (selectedItem.equals("DecaLongJump")) {
                if (decaMin[7] > result) {
                    lblStatus.setText("Result is too low! Range: (" + decaMin[7] + "-" + decaMax[7] + ")");
                    return;
                } else if (decaMax[7] < result) {
                    lblStatus.setText("Result is too high! Range: (" + decaMin[7] + "-" + decaMax[7] + ")");
                    return;
                } else {
                    DecaLongJump decaLongJump = new DecaLongJump();
                    decaLongJump.calculateResult(result);
                    score = (int) decaLongJump.getScore();
                }
            } else if (selectedItem.equals("DecaPoleVault")) {
                if (decaMin[8] > result) {
                    lblStatus.setText("Result is too low! Range: (" + decaMin[8] + "-" + decaMax[8] + ")");
                    return;
                } else if (decaMax[8] < result) {
                    lblStatus.setText("Result is too high! Range: (" + decaMin[8] + "-" + decaMax[8] + ")");
                    return;
                } else {
                    DecaPoleVault decaPoleVault = new DecaPoleVault();
                    decaPoleVault.calculateResult(result);
                    score = (int) decaPoleVault.getScore();
                }
            } else if (selectedItem.equals("DecaShotPut")) {
                if (decaMin[9] > result) {
                    lblStatus.setText("Result is too low! Range: (" + decaMin[9] + "-" + decaMax[9] + ")");
                    return;
                } else if (decaMax[9] < result) {
                    lblStatus.setText("Result is too high! Range: (" + decaMin[9] + "-" + decaMax[9] + ")");
                    return;
                } else {
                    DecaShotPut decaShotPut = new DecaShotPut();
                    decaShotPut.calculateResult(result);
                    score = (int) decaShotPut.getScore();
                }
            } else if (selectedItem.equals("Hep100MHurdles")) {
                if (heptaMin[0] > result) {
                    lblStatus.setText("Result is too low! Range: (" + heptaMin[0] + "-" + heptaMax[0] + ")");
                    return;
                } else if (heptaMax[0] < result) {
                    lblStatus.setText("Result is too high! Range: (" + heptaMin[0] + "-" + heptaMax[0] + ")");
                    return;
                } else {
                    Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
                    hep100MHurdles.calculateResult(result);
                    score = (int) hep100MHurdles.getScore();
                }
            } else if (selectedItem.equals("Hep200M")) {
                if (heptaMin[1] > result) {
                    lblStatus.setText("Result is too low! Range: (" + heptaMin[1] + "-" + heptaMax[1] + ")");
                    return;
                } else if (heptaMax[1] < result) {
                    lblStatus.setText("Result is too high! Range: (" + heptaMin[1] + "-" + heptaMax[1] + ")");
                    return;
                } else {
                    Hep200M hep200M = new Hep200M();
                    hep200M.calculateResult(result);
                    score = (int) hep200M.getScore();
                }
            } else if (selectedItem.equals("Hep800M")) {
                if (heptaMin[2] > result) {
                    lblStatus.setText("Result is too low! Range: (" + heptaMin[2] + "-" + heptaMax[2] + ")");
                    return;
                } else if (heptaMax[2] < result) {
                    lblStatus.setText("Result is too high! Range: (" + heptaMin[2] + "-" + heptaMax[2] + ")");
                    return;
                } else {
                    Hep800M hep800M = new Hep800M();
                    hep800M.calculateResult(result);
                    score = (int) hep800M.getScore();
                }
            } else if (selectedItem.equals("HeptHightJump")) {
                if (heptaMin[3] > result) {
                    lblStatus.setText("Result is too low! Range: (" + heptaMin[3] + "-" + heptaMax[3] + ")");
                    return;
                } else if (heptaMax[3] < result) {
                    lblStatus.setText("Result is too high! Range: (" + heptaMin[3] + "-" + heptaMax[3] + ")");
                    return;
                } else {
                    HeptHightJump heptHightJump = new HeptHightJump();
                    heptHightJump.calculateResult(result);
                    score = (int) heptHightJump.getScore();
                }
            } else if (selectedItem.equals("HeptJavelinThrow")) {
                if (heptaMin[4] > result) {
                    lblStatus.setText("Result is too low! Range: (" + heptaMin[4] + "-" + heptaMax[4] + ")");
                    return;
                } else if (heptaMax[4] < result) {
                    lblStatus.setText("Result is too high! Range: (" + heptaMin[4] + "-" + heptaMax[4] + ")");
                    return;
                } else {
                    HeptJavelinThrow heptJavelinThrow = new HeptJavelinThrow();
                    heptJavelinThrow.calculateResult(result);
                    score = (int) heptJavelinThrow.getScore();
                }
            } else if (selectedItem.equals("HeptLongJump")) {
                if (heptaMin[5] > result) {
                    lblStatus.setText("Result is too low! Range: (" + heptaMin[5] + "-" + heptaMax[5] + ")");
                    return;
                } else if (heptaMax[5] < result) {
                    lblStatus.setText("Result is too high! Range: (" + heptaMin[5] + "-" + heptaMax[5] + ")");
                    return;
                } else {
                    HeptLongJump heptLongJump = new HeptLongJump();
                    heptLongJump.calculateResult(result);
                    score = (int) heptLongJump.getScore();
                }
            } else if (selectedItem.equals("HeptShotPut")) {
                if (heptaMin[6] > result) {
                    lblStatus.setText("Result is too low! Range: (" + heptaMin[6] + "-" + heptaMax[6] + ")");
                    return;
                } else if (heptaMax[6] < result) {
                    lblStatus.setText("Result is too high! Range: (" + heptaMin[6] + "-" + heptaMax[6] + ")");
                    return;
                } else {
                    HeptShotPut heptShotPut = new HeptShotPut();
                    heptShotPut.calculateResult(result);
                    score = (int) heptShotPut.getScore();
                }

            }
            String data4
                    = "Score: " + Integer.toString(score);

            txtOutput.setText(data + data1 + data2 + data3 + data4);
            txtOutput.setEditable(false);
            lblStatus.setText("Registration Successfully..");
        } else if (e.getSource() == btnReset) {
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

