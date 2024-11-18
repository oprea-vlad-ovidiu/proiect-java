package ro.cti.ugal.proiect.java.vlad;

public class Material {
    public double rezistivitate;           // notat ρ, rezistivitate la temp 20 C
    public double coeficientTemperatura;   // notat α, cu cat creste rezistivitate per C
    
    public Material(double rezistivitate, double coeficientTemperatura) {
        this.rezistivitate = rezistivitate;
        this.coeficientTemperatura = coeficientTemperatura;
    }
    
    public double getRezistivitateLaTemperatura(double temp) {
        return rezistivitate * (1 + (coeficientTemperatura * (temp - 20)));
    }
    
    public double getRezistenta(double l, double d, double t) {
        // Returneaza rezistenta unui filament de lungime l cu diametrul d la temperatura t
        double rez = getRezistivitateLaTemperatura(t);
        return rez * (l / (Math.PI * Math.pow(d / 2, 2)));
    }
}
