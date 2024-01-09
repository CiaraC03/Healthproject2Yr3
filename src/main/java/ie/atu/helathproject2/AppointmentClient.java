package ie.atu.helathproject2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "medicalRecords-service", url = "http://localhost:8082")
public interface AppointmentClient {
    @PostMapping("/confirmMedicalRecords")
    String appointmentDetails(@RequestBody Appointment appointment);
}
