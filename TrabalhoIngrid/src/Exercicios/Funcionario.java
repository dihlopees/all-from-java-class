package Exercicios;

public class Funcionario {

        String nome;
        String cargo;
        int salario;
        double aumento;

        public double getAumento () {
            return aumento;
        }

        public int getSalario () {
            return salario;
        }

        public String getCargo () {
            return cargo;
        }

        public String getNome () {
            return nome;
        }

        public void setCargo (String cargo){
            if (cargo.equalsIgnoreCase("analista") || cargo.equalsIgnoreCase("desenvolvedor") || cargo.equalsIgnoreCase("gerente")) {
                this.cargo = cargo;
            } else {
                System.out.println("Você informou um cargo inválido");
            }

        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public void setSalario ( int salario){
            this.salario = salario;
        }

        public void calcularAumento (String cargoPessoa, int salarioPessoa) {
            if (cargoPessoa.equalsIgnoreCase("analista")) {
                this.aumento = salarioPessoa * 1.10;
            } else if (cargoPessoa.equalsIgnoreCase("desenvolvedor")) {
                this.aumento = salarioPessoa * 1.15;
            } else {
                this.aumento = salarioPessoa * 1.05;
            }
        }

}

