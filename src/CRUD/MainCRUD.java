package CRUD;

import CRUD.DTO.Dto;
import CRUD.INTERFACE.Interface;
import CRUD.SERVICIOS.Mall;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainCRUD {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        String opc = "1";
        Interface cosa=new Mall();

        do {
            Scanner d=new Scanner(System.in);
            System.out.println("""
                    ~~~~~ Menu ~~~~~\n
                     1.Add \n
                     2.To list \n
                     3.Edit \n
                     4.Remove \n
                     5.Observe the Number of shopping centers\n
                     6.To leave\n""");
            opc= d.next();
            switch (opc){
                case "1":{
                    System.out.println("~~~~~ Adding ~~~~~");
                    System.out.println("Enter the id:");
                    int id= Integer.parseInt(d.next());
                    System.out.println("Enter the name the Center:");
                    String nameCenter=d.next();
                    System.out.println("City:");
                    String city=d.next();
                    System.out.println("Enter the address:");
                    String address= d.next();

                    cosa.save(new Dto(id,nameCenter,city,address));
                }
                case "2":{
                    System.out.println("~~~~~ List ~~~~~");
                    List<Dto> Malls = cosa.findAll();
                    if (!Malls.isEmpty()){
                        Malls.forEach(System.out::println);
                    }else{
                        System.out.println("No records");
                    }
                }break;
                case "3":{
                    System.out.println("~~~~~ Editing ~~~~~");
                    System.out.println("Enter the id number of the mall to edit:");
                    int idEdit = Integer.parseInt(d.next());

                    Dto existingMall = cosa.findById(idEdit);

                    if (existingMall != null) {
                        System.out.println("Enter the name the mall:");
                        String newname=d.next();
                        System.out.println("City:");
                        String newcity=d.next();
                        System.out.println("Enter the address:");
                        String newaddress= d.next();

                        existingMall.setNameOfTheCenter(newname);
                        existingMall.setCity(newcity);
                        existingMall.setAddress(newaddress);

                        cosa.update(existingMall);
                        System.out.println("The mall data has been updated.");
                    } else {
                        System.out.println("No mall were found with the id provided.");
                    }
                }break;
                case "4":{
                    System.out.println("~~~~~ Removing ~~~~~");
                    System.out.println("Enter Id number:");
                    int id= Integer.parseInt(d.next());
                    boolean buscar= cosa.findById(id)==null;
                    if (!buscar){
                        System.out.println("The removal of the mall was requested: "+cosa.findById(id));
                        cosa.delete(cosa.findById(id));
                        System.out.println("The toy was removed");
                    }else {
                        System.out.println("No toy found with that id");
                    }
                }break;
                case "5": {
                    System.out.println("~~~~~ Number of Malls ~~~~~");
                    List<Dto> mallsList = cosa.findAll();
                    int totalMalls = mallsList.size();
                    System.out.println("There are " + totalMalls + " Malls in total.");
                } break;
                case "6":{
                    opc="6";
                }break;
            }

        }while (!opc.equals("6"));
    }
}
