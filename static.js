// # Crie uma classe de sua preferência com, no mínimo, uma variável, um método e um incremento. Depois, desenvolva três ou mais objetos para testar o código.

// # Trabalhe esse código em seu IDE, suba ele para sua conta no GitHub e compartilhe o link desse projeto no campo ao lado para que outros desenvolvedores possam analisá-lo.

class Pessoa {
    static incremento = 0;

    constructor() {
        Pessoa.incremento += 1;
    }

    getContador() {
        return Pessoa.incremento;
    }
}

let objeto = new Pessoa();
let objeto1 = new Pessoa();
let objeto2 = new Pessoa();
let objeto3 = new Pessoa();

console.log(`Objeto: ${objeto.getContador()}`);
console.log(`Objeto1: ${objeto1.getContador()}`);
console.log(`Objeto2: ${objeto2.getContador()}`);
console.log(`Objeto3: ${objeto3.getContador()}`);
