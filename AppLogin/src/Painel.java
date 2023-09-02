import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Painel extends JFrame {
    private static JLabel lblUsr = new JLabel("Usuário..:");
    private static JLabel lblPwd = new JLabel("Senha....:");

    private static JTextField txtUsr = new JTextField(25);
    private static JTextField txtPwd = new JTextField(25);

    private static JButton btnLogin = new JButton("ENTRAR");
    
    Login lg = new Login();
    Home janelaHome = new Home();

    public Painel(){
        super("Login");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login Frame");
        setSize(270, 340);                
        setVisible(true);

        setLayout(new GridLayout(7, 2)); //linhas e colunas
        getContentPane().add(lblUsr);
        getContentPane().add(txtUsr);
        getContentPane().add(lblPwd);
        getContentPane().add(txtPwd);   
        getContentPane().add(btnLogin);     

        pack();   
        
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                CliqueLogin();
            }
        }
        );

    }

    private void CliqueLogin(){
        //JOptionPane.showMessageDialog(null, "Clicou em Login");
        //System.out.println("clicou em login");
        boolean resultadoLogin;        

        lg.setUsuario(txtUsr.getText().toString());
        lg.setSenha(txtPwd.getText().toString());

        resultadoLogin = lg.verificarLogin();
        if (resultadoLogin == true){
            JOptionPane.showMessageDialog(null, "Login Válido !!!");
            dispose();
            janelaHome.mostrarJanela(lg);
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuário/Senha incorreto !!!");
        }
    }
}
