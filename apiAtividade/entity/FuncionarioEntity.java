import java.lang.annotation.Inherited;

import entity.Setor;

@Entity
@Table (name = "tab_funcionario")
public class FuncionarioEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idadde;
    private double salario;
    private Setor setor;
    private Sexo Sexo;

    public FuncionarioEntity() {
    }

    public FuncionarioEntity(Long id, String nome, int idadde, double salario, Setor setor, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.idadde = idadde;
        this.salario = salario;
        this.setor = setor;
        Sexo = sexo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadde() {
        return idadde;
    }

    public void setIdadde(int idadde) {
        this.idadde = idadde;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return Sexo;
    }

    public void setSexo(Sexo sexo) {
        Sexo = sexo;
    }






}
