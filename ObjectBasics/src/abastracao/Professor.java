package abastracao;

public class Professor extends Pessoa {

	String salario;
	String materia;
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getEndereco() {
		String endr =  "Endereço do Professor: ";
		endr += super.getEndereco();
		return endr;
	}
	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo etiqueta do Professor.");
		System.out.println(getEndereco());
	}
	
}
