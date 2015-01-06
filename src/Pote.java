class Pote {

	public Pote () {

	}

	private int id;
	private String nombre;
	private int tipo; //1: Basico 2: Selecto

	//Crear metodos set y get

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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int t) {
		this.tipo=t;
	}

	public void mostrarpote() {
			System.out.println("		Id: 	"+this.getId());
			System.out.println("		Nombre: "+this.getNombre());
			System.out.println("		Tipo: 	"+this.getTipo());
	}
}