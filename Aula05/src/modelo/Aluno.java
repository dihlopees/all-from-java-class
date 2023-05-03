package modelo;

public class Aluno {
    private String nmAluno;
    private String nrRa;
    private Materia materia;

    public String getNmAluno() {
        return nmAluno;
    }

    public void setNmAluno(String nmAluno) {
        this.nmAluno = nmAluno;
    }

    public String getNrRa() {
        return nrRa;
    }

    public void setNrRa(String nrRa) {
        this.nrRa = nrRa;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
