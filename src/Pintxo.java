class Pintxo {

	//Metodo contructora sin inicializar variables
	public Pintxo() {

	}

	//Definición variables
	private int id;
	private String nombre;
	private String[] ingredientes;
	private int tipo; // 1: Basico 2:Selecto
	
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

	public String[] getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String[] ing)
		this.ingredientes=ing;

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int t) {
		this.tipo=t;
	}
}