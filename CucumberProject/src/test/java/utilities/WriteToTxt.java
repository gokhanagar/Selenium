package utilities;

import pojos.*;

import java.io.*;
import java.util.List;

public class WriteToTxt {

    /*
    public static void saveRegistrantData(Registrant registrant) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("api_registrant_data"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append(registrant + "\n");


            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
*/
    public static void saveAppointData(Appointment appointment) {

        try {

            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("appointment_records"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment + "\n");


            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void saveRegistrantData(List<Object> SSNIds) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("database_registrant_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (Object eachSSN : SSNIds) {
                writer.append(eachSSN + ",\n");
            }

            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

        /*
    public static void saveRegistrantData(Registrant[] registrants) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("api_all_registrant_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            for (int i = 0; i < registrants.length; i++) {
                writer.append(registrants[i].getFirstName() + "," + registrants[i].getLastName() + "," + registrants[i].getSsn() + "," + registrants[i].getLogin() +
                        "," + registrants[i].getId() + "," + registrants[i].getEmail() + "\n");
            }

            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
*/
//    public static void savePhysicianIds(String fileName, Physician[] physicians)  {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));
//
//            for (int i = 0; i < physicians.length ; i++) {
//                writer.append(physicians[i].getId()+",\n");
//            }
//
//
//            writer.close();
//        } catch(Exception e){
//
//        }
//    }

    public static void savePhysicianIds(String fileName, List<Object> id) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < id.size(); i++)
                writer.append(id.get(i).toString() + ",\n");

            writer.close();
        } catch (IOException e) {
        }
    }

    public static void savePhysicianName(String fileName, List<Object> firstname) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < firstname.size(); i++)
                writer.append(firstname.get(i).toString() + ",\n");

            writer.close();
        } catch (IOException e) {
        }
    }

    public static void saveAppointmentIds(String fileName, List<Object> id) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < id.size(); i++)

                writer.append(id.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }

    public static void saveAppointmentStartDate(String fileName, List<Object> startDate) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < startDate.size(); i++)

                writer.append(startDate.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }
    public static void saveAppointmentEndDate(String fileName, List<Object> endDate) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < endDate.size(); i++)

                writer.append(endDate.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }
    public static void saveAppointmentStatus(String fileName, List<Object> status) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < status.size(); i++)

                writer.append(status.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }
}
