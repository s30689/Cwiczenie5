import java.time.Year;

public class Employee {
    public String name;
    public String surName;
    public String city;
    public String mail;
    public String pesel;
    public int rokZatrudnienia;



    public int calculateSalary() {
        int basicSalary = 3000;
        int obecnyRok = Year.now().getValue();
        int stazPracy = obecnyRok - rokZatrudnienia;
        int stazBonus = stazPracy * 1000;
        int finalBasicSalary = basicSalary + stazBonus;
        return finalBasicSalary;
    }
 public Employee(String name,String surName,String city,String mail,String pesel,int rokZatrudnienia){

 }
}



