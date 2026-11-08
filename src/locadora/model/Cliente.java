package locadora.model;

public class Cliente {

    // Atributos da Classe
    private String name;
    private String cpf;
    private String phone;


    // Construtor

    public Cliente(String name, String cpf, String phone){
        // Se não tiver CPF e for tamanho inválido dar erro
        if (cpf == null || cpf.length() != 11){
            throw new IllegalArgumentException("CPF inválido: deve ter 11 dígitos");
        }
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
    }

    // Encapsulamento dos private

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhone() {
        return phone;
    }
}
