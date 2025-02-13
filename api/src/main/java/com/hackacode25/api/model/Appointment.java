package com.hackacode25.api.model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class Appointment {

    private int id;
    private LocalDate fecha_consulta;
    private LocalTime hora_consulta;
    private Patient un_paciente;
    private Doctor un_medico;
    private ServicePack servicio_o_paquete;
    private float monto_total;
    private boolean pagado_o_no;

    public Appointment() {}

    public Appointment(int id,
                       LocalDate fecha_consulta,
                       LocalTime hora_consulta,
                       Patient un_paciente,
                       Doctor un_medico,
                       ServicePack servicio_o_paquete,
                       float monto_total,
                       boolean pagado_o_no) {

        this.id = id;
        this.fecha_consulta = fecha_consulta;
        this.hora_consulta = hora_consulta;
        this.un_paciente = un_paciente;
        this.un_medico = un_medico;
        this.servicio_o_paquete = servicio_o_paquete;
        this.monto_total = monto_total;
        this.pagado_o_no = pagado_o_no;
    }
}