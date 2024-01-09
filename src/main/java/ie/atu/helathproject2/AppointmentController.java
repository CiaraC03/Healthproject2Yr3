package ie.atu.helathproject2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/appointments")
@RestController
public class AppointmentController {
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService)
    {
        this.appointmentService= appointmentService;
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<?> getAppointmentByPatientId(@PathVariable String patientId)
    {
        Appointment appointment = appointmentService.getAppointmentByPatientId(patientId);
        return ResponseEntity.ok(appointment);
    }

    @PostMapping("/createAppointment")
    public ResponseEntity<String>create(Appointment appointment)
    {
        appointmentService.saveAppointment(appointment);
        return new ResponseEntity<>("Appointment created successfully", HttpStatus.OK);
    }
}
