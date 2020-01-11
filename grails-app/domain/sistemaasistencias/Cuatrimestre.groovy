package sistemaasistencias

import org.joda.time.LocalDate

class Cuatrimestre {
	LocalDate fechaInicio
	LocalDate fechaFin

	int semanaInicio() {
		fechaInicio.getWeekOfWeekyear()
	}
	int semanaFin() {
		fechaFin.getWeekOfWeekyear()
	}

    static constraints = {
    }
}
