import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.KeyStore.TrustedCertificateEntry;

public class Home extends JFrame {
 

    private static JButton btnLogout = new JButton("LOGOUT");
    private static JButton btnAlterarSenha = new JButton("ALTERAR SENHA");

    private static JLabel lblNovaSenha = new JLabel("Nova Senha..:");
    private static JLabel lblConfirmarSenha = new JLabel("Confirmar Senha....:");

    private static JTextField txtNovaSenha = new JTextField(25);
    private static JTextField txtConfirmarSenha = new JTextField(25);
    
    private static Login oLogin = new Login();
    

    public Home(){
        super("Home");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Home");
        setSize(270, 340);                
        //setVisible(true);

        setLayout(new GridLayout(7, 1)); //linhas e colunas
        getContentPane().add(btnLogout);
        getContentPane().add(btnAlterarSenha);
        getContentPane().add(lblNovaSenha);
        getContentPane().add(txtNovaSenha);   
        getContentPane().add(lblConfirmarSenha); 
        getContentPane().add(txtConfirmarSenha);    

        pack();   

        btnLogout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                fecharjanela();
            }
        }
        );

        btnAlterarSenha.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                alterarSenha();
            }
        }
        );
        
        }

        public void mostrarJanela(Login oLg){
            this.setVisible(true);
            oLogin.setUsuario(oLg.getUsuario());
            oLogin.setSenha(oLg.getSenha());
        }

        public void fecharjanela(){
            dispose();
        }

        public void alterarSenha(){
            if (txtNovaSenha.getText().equals(txtConfirmarSenha.getText())){
                oLogin.alterarSenha(txtNovaSenha.getText());
                JOptionPane.showMessageDialog(null, "Senha Alterada !!!");
            }

            }
            else{
                JOptionPane.showMessageDialog(null, "Senhas Diferentes!!!");
            }


        }
    }



