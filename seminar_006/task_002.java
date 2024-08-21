package seminar_006;

import java.sql.Date;
import java.sql.Time;

public class task_002 {
    public static void main(String[] args) {
        /*
         * 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
        приложения, которое является
        а) информационной системой ветеринарной клиники
        б) архивом выставки котов
        в) информационной системой Театра кошек Ю. Д. Куклачёва
        Можно записать в текстовом виде, не обязательно реализовывать в java.
         */
        VeterinaryClinic doctorVet = new VeterinaryClinic();

        VeterinaryClinic.SickCat c1Cat = doctorVet.new SickCat();
        VeterinaryClinic.SickCat c2Cat = doctorVet.new SickCat();

        c1Cat.age = 2;
        c1Cat.breed = "Двортерьер";
        c1Cat.name = "Барсик";
        c1Cat.hostName = "Кобрусев Владислав";
        c1Cat.vaccinations = "Привит";
        c1Cat.listOfDiseases = "Рвота";
        c1Cat.diagnosis = "Нет";
        c1Cat.prescription = "Нет";

        c2Cat.age = 5;
        c2Cat.breed = "Британская";
        c2Cat.name = "Шкура";
        c2Cat.hostName = "Сегень Василий";

        VeterinaryClinic.Doctor doctor1 = doctorVet.new Doctor();
        doctor1.doctorName = "Семёнов Семён";
        doctor1.startWorkingTime = Time.valueOf("08:00:00");
        doctor1.endWorkingTime = Time.valueOf("17:00:00");

        VeterinaryClinic.Appointment visit1 = doctorVet.new Appointment();
        visit1.appointmentId = 1;
        visit1.doctor = doctor1;
        visit1.cat = c1Cat;
        visit1.date = Date.valueOf("2024-06-12");
        visit1.startTime = Time.valueOf("09:15:00");
        visit1.endTime = Time.valueOf("09:40:00");

        VeterinaryClinic.Appointment visit2 = doctorVet.new Appointment();
        visit2.appointmentId = 2;
        visit2.doctor = doctor1;
        visit2.cat = c2Cat;
        visit2.date = Date.valueOf("2024-06-12");
        visit2.startTime = Time.valueOf("09:50:00");
        visit2.endTime = Time.valueOf("10:25:00");

        System.out.print(c1Cat);
        System.out.println(visit1);
    }
}
