package tests.practice;

public class Tarih {



/*
public static String stringDateFormat(String date) {
        String day = date.substring(0, 2);
        String month = date.substring(3, 5);
        String year = date.substring(6);

        String formatDateString = year + "-" + month + "-" + day;

        return formatDateString;

        // buraya gelen  gun ay yil gg.aa.yyyy
        // 2030-01-01  yıl ay gun olmalı
 */


/*
@And("Kullanici gelecek bir tarih secer")
    public void kullaniciGelecekBirTarihSecer() {
        LocalDateTime istenilenTarih = LocalDateTime.now().plusDays(2);
        DateTimeFormatter tarihFormati = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String gelecekTarih = istenilenTarih.format(tarihFormati);
        System.out.println("gelecekTarih = " + gelecekTarih);
        makeAnAppointmentPage.appointmentDateTimeMakeAnAppointment.sendKeys(gelecekTarih);
    }

    @And("Kullanici gecmis bir tarih secer")
    public void kullaniciGecmisBirTarihSecer() {
        LocalDateTime istenilenTarih = LocalDateTime.now().minusDays(2);
        DateTimeFormatter tarihFormati = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String gecmisTarih = istenilenTarih.format(tarihFormati);
        System.out.println("gecmisTarih = " + gecmisTarih);
        makeAnAppointmentPage.appointmentDateTimeMakeAnAppointment.sendKeys(gecmisTarih);
        ReusableMethods.waitFor(2);
    }

 */


/*
Faker faker = new Faker();

Integer day=faker.number().numberBetween(1,28);
Integer month=faker.number().numberBetween(1,12);
Integer year=faker.number().numberBetween(2024,2099);

String dateOfAppointmentFaker= day+"/"+month+"/"+year;
 */













}