package smartphone.apple;

import smartphone.generic.Smartphone;

public class Iphone extends Smartphone {
    /**
     * @param nome o nome da pessoa a ser contatada.
     */
    public void ligarFaceTime(String nome) {
        System.out.println("Ligando para o contato " + nome);
    }

    /**
     *
     */
    public void atenderFaceTime() {
        System.out.println("Chamada atendida via FaceTime");
    }
}
