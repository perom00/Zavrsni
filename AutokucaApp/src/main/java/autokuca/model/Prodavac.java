package autokuca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;



@Entity
public class Prodavac extends Entitet {

	private String ime;
	private String prezime;
        private String oib;
        private String iban;
        
        
        
        
        @OneToMany(mappedBy = "prodavac")
        private List<Racun> racuni= new ArrayList<>();
        
        @OneToMany(mappedBy = "prodavac")
        private List<ProdajnoMjesto> prodajnoMjesto=new ArrayList<>();

    public Prodavac(String ime, String prezime, String oib, String iban, Integer sifra) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
        this.iban = iban;
    }

    public Prodavac() {
    }
        
        
        
        
        
        
        

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public List<Racun> getRacuni() {
        return racuni;
    }

    public void setRacuni(List<Racun> racuni) {
        this.racuni = racuni;
    }

    public List<ProdajnoMjesto> getProdajnoMjesto() {
        return prodajnoMjesto;
    }

    public void setProdajnoMjesto(List<ProdajnoMjesto> prodajnoMjesto) {
        this.prodajnoMjesto = prodajnoMjesto;
    }

    public Integer getSifra() {
        return sifra;
    }

    public void setSifra(Integer sifra) {
        this.sifra = sifra;
    }

    
        
        

	@Override
	public String toString() {

		return ime + " " + prezime;
	}
        
        

}


