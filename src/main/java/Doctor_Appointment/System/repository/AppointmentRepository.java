package Doctor_Appointment.System.repository;

import Doctor_Appointment.System.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
