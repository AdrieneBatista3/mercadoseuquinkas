package mercadoseuquinkas.model;

public class Cidade {

    private Integer id;
    private String nome;
    private String uf;
    private int ativo = 1;

    public Cidade() {
    }

    public Cidade(String nome) {
        this.nome = nome;

    }

    public Cidade(Integer id, String nome, int ativo) {
        this.id = id;
        this.nome = nome;
        this.ativo = ativo;
    }

    public Cidade(Integer id, String nome, String uf) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return nome + "(" + uf + ")";
    }

}
