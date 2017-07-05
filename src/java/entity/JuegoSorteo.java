package entity;
// Generated Jul 4, 2017 11:49:37 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * JuegoSorteo generated by hbm2java
 */
public class JuegoSorteo  implements java.io.Serializable {


     private int idJuegoSorteo;
     private Juego juego;
     private Sorteo sorteo;
     private Date fechaJuego;

    public JuegoSorteo() {
    }

    public JuegoSorteo(int idJuegoSorteo, Juego juego, Sorteo sorteo, Date fechaJuego) {
       this.idJuegoSorteo = idJuegoSorteo;
       this.juego = juego;
       this.sorteo = sorteo;
       this.fechaJuego = fechaJuego;
    }
   
    public int getIdJuegoSorteo() {
        return this.idJuegoSorteo;
    }
    
    public void setIdJuegoSorteo(int idJuegoSorteo) {
        this.idJuegoSorteo = idJuegoSorteo;
    }
    public Juego getJuego() {
        return this.juego;
    }
    
    public void setJuego(Juego juego) {
        this.juego = juego;
    }
    public Sorteo getSorteo() {
        return this.sorteo;
    }
    
    public void setSorteo(Sorteo sorteo) {
        this.sorteo = sorteo;
    }
    public Date getFechaJuego() {
        return this.fechaJuego;
    }
    
    public void setFechaJuego(Date fechaJuego) {
        this.fechaJuego = fechaJuego;
    }




}


