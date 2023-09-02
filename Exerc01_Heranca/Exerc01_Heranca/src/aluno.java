public class aluno extends pessoa {

    private String semestre;
    private String curso;

    public aluno(){
        this.semestre = "";
        this.curso = "";

    }

    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
