public class PessoaJuridica extends Cliente{

    private String cnpj;                // cpnj da PJ
    private int numFuncionarios;        // Número de funcionários da PJ
    private String setor;               //Setor de atuação da PJ (financeiro, educação, veículos, etc)

    private PessoaJuridica(String nome, String cnpj, String endereco, int numFuncionarios, String setor) {

        super(nome, endereco);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCpf(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;

    }

    void imprimir() {

        System.out.println("====");
        System.out.println("Nome: " +getNome());
        System.out.println("CNPJ: " +this.cnpj);
        System.out.println("Setor: " +this.setor);
        System.out.println("Endereco: " +getEndereco());
        System.out.println("N° Funcionario: " +getNumFuncionarios());
        System.out.println("Data do Cadastro: " +getData());

    }


}
