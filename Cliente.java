 public class Cliente {

    private String nome;
    private String senha;
    private int idade;
    private boolean prioridade;
    private String tipoAtendimento;

    public Cliente(String nome, String senha, int idade,String tipoAtendimento) {
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
        this.tipoAtendimento = tipoAtendimento;
        this.prioridade = idade >= 60;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

     public void setIdade(int idade) {
        this.idade = idade;
        this.prioridade = idade >= 60;
    }

     public String getTipoAtendimento() {
         return tipoAtendimento;
     }

     public void setTipoAtendimento(String tipoAtendimento) {
         this.tipoAtendimento = tipoAtendimento;
     }

     public boolean isPrioridade() {
        return prioridade;
    }

     @Override
     public String toString() {
         return "Nome: " + nome +
                 "  Senha: " + senha +
                 "  Idade: " + idade +
                 "  Prioridade: " + (prioridade ? "Sim" : "Não") +
                 "  Atendimento: " + tipoAtendimento;
     }
}

