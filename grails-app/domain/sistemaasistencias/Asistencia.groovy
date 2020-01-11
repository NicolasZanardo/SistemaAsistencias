package sistemaasistencias

import org.joda.time.LocalDate
import org.joda.time.LocalTime

class Asistencia {
	LocalDate fecha
	LocalTime horaSalida
	LocalTime horaLlegada
	Docente docente

    static constraints = {
    	fecha       nullable: false
    	horaSalida  nullable: true
    	horaLlegada nullable: false
    	docente     nullable: false
    }
}
