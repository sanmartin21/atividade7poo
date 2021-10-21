package atividade7poo;

public class atcone {

	private float altura;
	private float raio;
	private int tinta;

	public double precolatatinta1 = 238.90;
	public double precolatatinta2 = 467.98;
	public double precolatatinta3 = 758.34;

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		if (altura > 0)
			this.altura = altura;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		if (raio > 0)
			this.raio = raio;
	}

	public int getTinta() {
		return tinta;
	}

	public void setTinta(int tinta) {
		if (tinta > 0 && tinta < 3)
			this.tinta = tinta;
	}

	public float geratriz() {
		return ((raio * raio) + (altura * altura));
	}

	public float geratriz1() {
		return (float) Math.sqrt(geratriz());
	}

	public float areatotal() {
		return (float) (3.14 * raio * (raio + geratriz1()));
	}

	public float fundocone() {
		return (float) (3.14 * (raio * raio));
	}

	public float lateralcone() {
		return (float) (3.14 * raio * geratriz());
	}

	public float cobertura() {
		return (float) (1 / 3.45);
	}

	public float quantlitrostinta() {
		return (areatotal() / cobertura());
	}

	public int latastotal() {
		return (int) Math.ceil((quantlitrostinta() / 18));

	}

	public double precodalata() {
		if (tinta == 1) {
			return (precolatatinta1);
		} else if (tinta == 2) {
			return (precolatatinta2);
		} else {
			return (precolatatinta3);
		}
	}

	public float valortotal() {
		return (float) (latastotal() * precodalata());
	}

	@Override
	public String toString() {
		return "at07 [geratriz1()=" + geratriz1() + ", areatotal()=" + areatotal() + ", fundocone()=" + fundocone()
				+ ", lateralcone()=" + lateralcone() + ", quantlitrostinta()=" + quantlitrostinta() + ", latastotal()="
				+ latastotal() + ", valortotal()=" + valortotal() + "]";
	}


	

}
