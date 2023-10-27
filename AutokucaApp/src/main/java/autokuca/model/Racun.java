package autokuca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.util.Date;


@Entity
public class Racun extends Entitet{
        @ManyToOne
	private Kupac kupac;
        @ManyToOne
	private  Prodavac prodavac;
        @ManyToOne
	private Vozilo vozilo;
        
        private Date datum;
        
        
        
	
        

	public Racun() {
		super();
	}
	public Racun(Integer sifra, Kupac kupac, Prodavac prodavac, Vozilo vozilo) {
		super(sifra);
		this.kupac = kupac;
		this.prodavac = prodavac;
		this.vozilo = vozilo;
	}

    
	public Kupac getKupac() {
		return kupac;
	}
	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}
	public Prodavac getProdavac() {
		return prodavac;
	}
	public void setProdavac(Prodavac prodavac) {
		this.prodavac = prodavac;
	}
	public Vozilo getVozilo() {
		return vozilo;
	}
	public void setVozilo(Vozilo vozilo) {
		this.vozilo = vozilo;
	}

        public Date getDatum() {
            return datum;
        }

        public void setDatum(Date datum) {
            this.datum = datum;
        }
        
        

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        if(getVozilo()==null){
            sb.append("Vozilo bez naziva");

        }else{
            sb.append(getVozilo());
        }
        
         if(getProdavac()!=null && getProdavac().getIme()!=null && !getProdavac().getIme().isEmpty()){
            sb.append(" [");
            sb.append(getProdavac().getIme());
            sb.append("]");
        }
        
        return sb.toString();
    }

   
    }
        
        
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


