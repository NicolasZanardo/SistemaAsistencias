package sistemaasistencias

import groovy.transform.EqualsAndHashCode

class Materia {
	String nombre
	CodigoMateria codigo

    static constraints = {
    }

    static embedded = ['codigo']
}

@EqualsAndHashCode
class CodigoMateria {
	int departamento
	int numeroMateria

	String toString() {
		departamento.ToSring() + '.' + numeroMateria.ToString(
		)
	}
}