class Cliente {

	public Cliente() {

	}

	private int id;
	private String nombre; //Guardar Nombre Apellidos
	private Cartilla cartilla;

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

	public Cartilla getCartilla() {
		return cartilla;
	}

	public void setCartilla(Cartilla c) {
		this.cartilla=c;
	}

}