
public class Deuda {
    private String deudor;
    private String domicilio;
    private String folio;
    private String saldoTotal;
     private int deuda;
    private int abono;
    
    public void setDeudor(String deudor){
        this.deudor=deudor;
    }
    public String GetDeudor(){
        return deudor;
    }
    
    
     public void setDomicilio(String domicilio){
        this.domicilio=domicilio;
    }
    public String GetDomicilio(){
        return domicilio;
    }
    
    
    
     public void setFolio(String folio){
        this.folio=folio;
    }
    public String GetFolio(){
        return folio;
    }
    
    
    
    public void setSaldoTotal(String saldoTotal){
        this.saldoTotal=saldoTotal;
    }
    public String GetSaldoTotal(){
        return saldoTotal;
    }
    
    
    
    public void setAbono(int abono){
        this.abono=abono;
    }
    public int GetAbono(){
        return abono;
    }
    
    
     public void setDeuda(int deuda){
        this.deuda=deuda;
    }
    public int GetDeuda(){
        return deuda;
    }
}
