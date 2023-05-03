package TDE0404;
public class Curso {
    public String[] listaCursos = new String[5];
    public Curso() {
        listaCursos[0] = "Adm";
        listaCursos[1] = "TADS";
        listaCursos[2] = "Economia";
        listaCursos[3] = "Direito";
        listaCursos[4] = "Marketing";
    }
    public void getCursos(){
        for(int i=0; i<5; i++) {
            System.out.println("Cod = "+i+" curso = "+listaCursos[i]+"");
        }
    }
    public String cursoEscolhido(int indice){
        return listaCursos[indice];
    }
}
