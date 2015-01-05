class Bar {

	public Bar() {

	}

	private int id;
	private String nombre;
	private String direccion;
	private ArrayList <Pintxo> pintxos;
	private ArrayList <Pote> potes;

	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id=i;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String n) {
		this.nombre=n;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String d) {
		this.direccion=d;
	}

	public ArrayList <Pintxo> getPintxos() {
		return pintxos;
	}

	public void sePintxos(ArrayList <Pintxo> idpintxos) {
		this.pintxos=idpintxos;
	}

	public ArrayList <Pote> getPotes() {
		return potes;
	}

	public void setPotes(ArrayList <Pote> idpotes) {
		this.potes=idpotes;
	}

}