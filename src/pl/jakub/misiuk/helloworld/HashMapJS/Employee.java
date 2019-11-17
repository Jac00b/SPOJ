package pl.jakub.misiuk.helloworld.HashMapJS;

import java.util.Objects;

public class Employee {
    private String imie;
    private String nazwisko;
    private double wyplata;

    public Employee(String imie, String nazwisko, double wyplata) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
    }
    public Employee(){

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getWyplata() {
        return wyplata;
    }

    public void setWyplata(double wyplata) {
        this.wyplata = wyplata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.wyplata, wyplata) == 0 &&
                Objects.equals(imie, employee.imie) &&
                Objects.equals(nazwisko, employee.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, wyplata);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wyplata=" + wyplata +
                '}';
    }
}
