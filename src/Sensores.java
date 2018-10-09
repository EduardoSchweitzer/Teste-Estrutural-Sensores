import java.util.ArrayList;

public class Sensores implements SensoresInterface {
	
	private ArrayList<Sensor> sensores;
	
	private class Sensor {
		int temperatura;
		int radiacao;
		String status;
		boolean h;
		
		public Sensor (int temperatura, int radiacao) {
			this.temperatura = temperatura;
			this.radiacao = radiacao;
			this.status = "habilitado";
			this.h = true;
		}
	}
	
	public Sensores () {
		sensores = new ArrayList<Sensor>();
	}
	
	@Override
	public void setH(int s, boolean h) {
		if (h == true) {
			sensores.get(s).status = "habilitado";
		} else {
			sensores.get(s).status = "não habilitado";
		}
		sensores.get(s).h = h;

	}

	@Override
	public void setTemp(int s, int t) {
		sensores.get(s).temperatura = t;

	}

	@Override
	public void setRad(int s, int r) {
		sensores.get(s).radiacao = r;

	}

	@Override
	public boolean isH(int s) {
		Sensor se = sensores.get(s);
		if (se.status.matches("habilitado")) {
			return true;
		} else return false;
	}

	@Override
	public int isAlerta(int s) {
		Sensor sen = sensores.get(s);
		if (sen.status.matches("não habilitado")) {
			return 0;
		} else if (sen.radiacao > 7) {
			return 3;
		} else if (sen.radiacao > 5 || sen.temperatura > 40) {
			return 2;
		} else if (sen.radiacao > 1 || sen.temperatura > 30) {
			return 1;
		}
		return -1;
	}
	
	public boolean add(int temperatura, int radiacao) {
		return sensores.add(new Sensor(temperatura, radiacao));
	}

}
