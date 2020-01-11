package sistemaasistencias

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification
import org.joda.time.LocalDate

class CuatrimestreSpec extends Specification implements DomainUnitTest<Cuatrimestre> {

    def setup() {
    }

    def cleanup() {
    }

    void "cuando le pido la semana del primero de enero responde que es la primera"() {
        def cuatrimestre = new Cuatrimestre(fechaInicio: new LocalDate(2019,01,01))

        expect: "semana inicio igual uno"
        	cuatrimestre.semanaInicio() == 1
    }
}
