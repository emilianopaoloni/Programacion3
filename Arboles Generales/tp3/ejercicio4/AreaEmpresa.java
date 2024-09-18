package tp3.ejercicio4;

public class AreaEmpresa {
	
	String identificacionEmpresa;
	int tardanza;
	
	AreaEmpresa( String id, int t){
		this.identificacionEmpresa=id;
		this.tardanza=t;
	}
	
	public String getIdentificacionEmpresa() {
		return identificacionEmpresa;
	}
	public void setIdentificacionEmpresa(String identificacionEmpresa) {
		this.identificacionEmpresa = identificacionEmpresa;
	}
	public int getTardanza() {
		return tardanza;
	}
	public void setTardanza(int tardanza) {
		this.tardanza = tardanza;
	}
	

}
