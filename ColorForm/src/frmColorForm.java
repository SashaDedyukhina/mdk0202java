import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class frmColorForm extends JFrame {
    protected AbstractButton lblNameColor;

    public frmColorForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,217,184);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        final JPanel lblNameColor = new JPanel();
        lblNameColor.setBounds(25,90,145,23);
        contentPane.setLayout(null);
        JButton btnChangeColor = new JButton("Изменить цвет формы");
        btnChangeColor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(contentPane.getBackground() == Color.RED){ 
                    contentPane.setBackground(Color.GREEN); 
                    lblNameColor.setToolTipText("Зеленый"); 
                }
                else {
                    contentPane.setBackground(Color.RED); 
                    lblNameColor.setToolTipText("Красный"); 
                }
            }
        });
        btnChangeColor.setBounds(25, 39, 161, 23); 
        contentPane.add(btnChangeColor);

    }

    private static final String EventQueue = null;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    try {
                        frmColorForm frame = new frmColorForm();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
    }
}