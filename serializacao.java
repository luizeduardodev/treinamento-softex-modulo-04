// Crie um exemplo de como funcionam a serialização e a desserialização de um sistema qualquer. Utilize as classes, os objetos e métodos padrões da Java e insira um endereço físico fictício.

// Trabalhe esse código em seu IDE, suba ele para sua conta no GitHub e compartilhe o link desse projeto no campo ao lado para que outros desenvolvedores possam analisá-lo.  

import java.io.*;

class serializacao implements Serializable {
    public String nome;
    public int idade;

    public void Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }
}

class Serialize {
    public static void main(String args[]) {
        serializacao c = new serializacao(); // criando o objeto
        try {
            FileOutputStream fo = new FileOutputStream("test.ser");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(c); // serializo objeto
            oo.close();

            System.out.println("Object serializado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // des-serializo o objeto
        try {
            FileInputStream fi = new FileInputStream("test.ser");
            ObjectInputStream oi = new ObjectInputStream(fi);
            c = (serializacao) oi.readObject();
            oi.close();

            System.out.println("agora ele foi des-serializado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}