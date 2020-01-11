package sistemaasistencias

class BootStrap {

    def init = { servletContext ->
		Docente pablo = new Docente([nombre: "Pablo", apellido: "Cosso", dni: new DNI("31415")])
		Materia nuevasTecnologias = new Materia([nombre: "Nuevas tecnologias", codigo: new CodigoMateria([departamento: 75, numeroMateria: 71])]).save()
		new Cargo([docente: pablo, materia: nuevasTecnologias, tipo: TipoDeCargo.PROFESOR_TITULAR]).save()
    }

    def destroy = {
    }
}
