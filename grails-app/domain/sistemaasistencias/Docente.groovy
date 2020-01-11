package sistemaasistencias

import groovy.transform.EqualsAndHashCode

class Docente {
	DNI dni
	String nombre
	String apellido


    static constraints = {
    	nombre nullable: false
    	apellido nullable: false
    }

    static embedded = [dni: DNI]
}

@EqualsAndHashCode
class DNI {
	String valorString

	public DNI() {}
	public DNI(String valor) {
		valorString = valor
	}
	public DNI(int valor) {
		valorString = valor.toString()
	}

	String toString() {
		return valorString
	}
}