package ie.atu.helathproject2;

import org.springframework.stereotype.Service;

@Service
public class AppointmentService {


    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository)
    {
        this.appointmentRepository = appointmentRepository;
    }

    public void saveAppointment(Appointment appointment)
    {
        appointmentRepository.save(appointment);
    }

    public Appointment getAppointmentByPatientId(String patientId)
    {
        return appointmentRepository.findByPatientId(patientId);
    }

}
