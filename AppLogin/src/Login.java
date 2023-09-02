import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;

public class Login {
    private String usuario;
    private String senha;

    public Login() {
        this.usuario = "";
        this.senha = "";
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usr) {
        this.usuario = usr;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String pwd) {
        this.senha = pwd;
    }

    public boolean verificarLogin() {
        boolean retorno = true;
        int total_linhas = 0;

        System.out.println("''''''''''''''''''''''''''''''''''''''");
        System.out.println("''''''''''''''''''''''''''''''''''''''");
        System.out.println("''''''''''''''''''''''''''''''''''''''");
        System.out.println("''''''''''''''''''''''''''''''''''''''");
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("--class.for.name---");
            Connection conexao = DriverManager.getConnection("jdbc:mysql://tecpuc-dev.tk:3306/admin_my_a40067346?useSSL=false", "admin_40067346", "a40067346");
            System.out.println("---conexao---");
            String query = "SELECT COUNT(*) TotalLinhas FROM applogin_usuario WHERE user_name = '";
            query = query + this.usuario + "'";
            query = query + " AND password = '" + this.senha + "'";

            System.out.println("*******************************");
            System.out.println(query);

            Statement st = conexao.createStatement();
            // System.out.println("---statement---");
            ResultSet rs = st.executeQuery(query);
            // System.out.println("---resultset---");
            rs.next();

            System.out.println(rs.getInt("TotalLinhas"));
            System.out.println("----if----");
            if (rs.getInt("TotalLinhas") > 0) {
                // JOptionPane.showMessageDialog(null, "Ok");
                retorno = true;
            }

        }

        catch (Exception e) {
            e.printStackTrace();
        }
        return retorno; 
        /*
         * if (this.usuario.equals(usr) && this.senha.equals(pwd)){
         * if (total_linhas >= 1){
         * return true;
         * }
         * 
         * else{
         * return false;
         * }
         */
    }

    public void alterarSenha(String strNovaSenha){
        try {
            Class.forName("com.mysql.jdbc.Driver");
                Connection conexao = DriverManager.getConnection("jdbc:mysql://tecpuc-dev.tk:3306/admin_my_a40067346?useSSL=false", "admin_40067346", "a40067346");
                String query = "UPDATE applogin_usuario SET user_password = '" + strNovaSenha + "'";
                query = query + " WHERE user_name = '";
                query = query + this.usuario + "'";
               Statement st = conexao.createStatement();
               st.execute(query);
            }
            catch(Exception e){
                e.printStackTrace();
                
            }
        }
    }
    

