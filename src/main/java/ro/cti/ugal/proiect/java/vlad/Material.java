package ro.cti.ugal.proiect.java.vlad;

public class Material {
    public String nume;
    public double rezistivitate;           // notat ρ, rezistivitate la temp 20 C
    public double coeficientTemperatura;   // notat α, cu cat creste rezistivitate per C
    
    public Material(String nume, double rezistivitate, double coeficientTemperatura) {
        this.nume = nume;
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
    
    // Legea lui Planck pentru radiatia unui corp negru.
    // Aceasta lege, pentru o anumita frecventa de unda, 
    // reprezinta cata energie este emisa.
    // 
    // Folosind aceasta lege, calculam cata energie emite 
    // corpul pe spectrul luminos. (Violet 380nm --> 750nm Rosu)
    // https://en.wikipedia.org/wiki/Black-body_radiation#Planck's_law_of_blackbody_radiation
    // https://en.wikipedia.org/wiki/Planck%27s_law#Different_forms
    public double getEnergieRadiata(double T, double lambda) {
        // Temperatura T in Kelvin.
        // Lambda frecventa.
        
        // Constanta lui Planck.
        double h = 6.6261e-27;
        // Viteza luminii in vid.
        double c = 2.9979e8;
        // Constanta lui Boltzmann.
        double k = 1.3806e-16;
        // Numarul lui Euler.
        double e = 2.71828;

        return ( (2 * h * Math.pow(c, 2)) / (Math.pow(lambda, 5)) ) * 
                ( 1 / (Math.pow(e, (h * c) / (lambda * k * T)) - 1) );
    }
}
