// # Crie uma classe e insira nela, no mínimo, dois atributos, os quais devem ter um método acessor (get) e um método modificador (set) para cada. Defina um objeto para cada atributo e elabore um construtor para criar alguma regra.

// # A atividade pode ser realizada em qualquer linguagem de programação ou apenas utilizando algoritmos.

// # Trabalhe esse código em seu IDE ou no Bloco de Notas, e compartilhe o link no campo ao lado para que outros desenvolvedores possam analisá-lo.

class Pessoa {
    constructor(nome, sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    getNome() {
        return this.nome;
    }
    setNome(nome) {
        return (this.nome = nome);
    }

    getSobrenome() {
        return this.sobrenome;
    }
    setSobrenome(sobrenome) {
        return (this.sobrenome = sobrenome);
    }
}

objeto = new Pessoa("Luiz", "Eduardo");

console.log(objeto.getNome());
console.log(objeto.setNome("Caio"));

console.log(objeto.getSobrenome());
console.log(objeto.setSobrenome("Rodrigues"));
