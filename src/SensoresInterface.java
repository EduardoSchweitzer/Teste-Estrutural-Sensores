
public interface SensoresInterface {
	void setH(int s, boolean h);
	
	void setTemp(int s, int t);
	
	void setRad(int s, int r);
	
	boolean isH(int s);
	
	int isAlerta(int s);
}
