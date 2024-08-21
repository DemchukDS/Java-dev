package seminar_006;

import java.sql.Date;
import java.sql.Time;

public class VeterinaryClinic {
    public VeterinaryClinic(){}
    public class SickCat extends Cat{
        public String diagnosis;
        public String prescription;
        public String listOfDiseases;
        public String vaccinations;

        public SickCat(){}
    }
    public class Doctor {
        public String doctorName;
        public Time startWorkingTime;
        public Time endWorkingTime;

        @Override
        public String toString() {
            return String.format(doctorName);
        }
    }
    public class Appointment {
        public Doctor doctor;
        public SickCat cat;
        public Date date;
        public Time startTime;
        public Time endTime;
        public int appointmentId;

        @Override
        public String toString() {
            return String.format("Дата приема: %s\nВремя приема: %s \nВрач: %s.", date, startTime, doctor);
        }
    }
}