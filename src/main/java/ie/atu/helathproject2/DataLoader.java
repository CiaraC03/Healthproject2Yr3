package ie.atu.helathproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DataLoader  implements CommandLineRunner {
    private final AppointmentRepository appointmentRepository;

    @Autowired
    public DataLoader(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        Appointment testdata = new Appointment(1L, "12345", "2024-01-28T15:30:00", "DrMary", "Check-up");
        Appointment testdata2 = new Appointment(2L, "21345", "2024-02-02T09:00:00", "DrDavid", "Vaccinations");
        Appointment testdata3 = new Appointment(3L, "312345", "2024-01-20T01:45:00", "DrNiall", "Blood");

        appointmentRepository.save(testdata);
        appointmentRepository.save(testdata2);
        appointmentRepository.save(testdata3);
    }
}
