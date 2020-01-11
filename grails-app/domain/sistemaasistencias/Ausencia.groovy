package sistemaasistencias

import org.joda.time.LocalDate

class Ausencia {
	LocalDate fecha
	Docente docente
	TipoDeAusencia tipo
	String razon

    static constraints = {
    }
}
