package model;

public class Masa {
    private int masaNo;

    public Masa(int masaNo) {
        this.masaNo = masaNo;
    }

    public int getMasaNo() {
        return masaNo;
    }

    @Override
    public String toString() {
        return "Masa " + masaNo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(masaNo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Masa other = (Masa) obj;
        return masaNo == other.masaNo;
    }
}