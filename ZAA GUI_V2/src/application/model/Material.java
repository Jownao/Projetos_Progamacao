package application.model;

public class Material {
	
	String material;
	String medida;
	String tamanho;
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public void mostrarProduto() {
		System.out.println("Materiais cadastrados:");
		System.out.println("Tipo de material: "+this.material);
		System.out.println("Medida: "+this.material);
		System.out.println("Tamanho: "+this.tamanho);
	}
}
