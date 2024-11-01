package arenadosherois;

public class Gigante extends Personagem{

	public Gigante(String nome) {
		super(nome, 200, 40); // vida alta e dano base 
	}
	@Override 
	public void atacar(Personagem oponente) {
		int distancia = calcularDistancia(oponente);
		if (distancia <= 1) {
			oponente.receberDano(this.getDanoBase());
System.out.println(getNome() + " atacou " + oponente.getNome() + " com força bruta");
} else {
System.out.println(getNome() + " está muito longe para atacar");
		}
	}
}
