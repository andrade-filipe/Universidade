package br.unit.exercicio;

public class Ponto 
{
    // Atributos
    private double x;
    private double y;
 
    public Ponto() {
    	this.x = 1;
    	this.y = 1;
    }
    
    public Ponto(double x, double y) {
    	this.x = x;
    	this.y = y;
    }
    
    public Ponto(Ponto ponto) {
    	this.x = ponto.getX();
    	this.y = ponto.getY();
    }
    
    
    
    // Métodos
 
    public double getX() { 
        return(this.x); 
    }      
    public double getY() { 
        return(this.y); 
    }
    public void setX (double xVal) { 
    	this.x = xVal; 
    }
    public void setY (double yVal) { 
    	this.y = yVal; 
    }
 
    public void desloca (double dx, double dy) {
    	this.x = this.x + dx;
    	this.y = this.y + dy;
    } 
    
    public String toString() {
         String str = "(" + this.x + "," + this.y + ")";
         return str;
    }
    
    //Sobrecarga
    public void desloca (String sx, String sy) {
    	this.x = this.x + Double.parseDouble(sx);
    	this.y = this.y + Double.parseDouble(sy);
    } 
}
