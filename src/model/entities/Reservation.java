
package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Reservation {
    
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Reservation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public long duration(){ // diferença entre duas datas
        long diff = checkOut.getTime() - checkIn.getTime(); //diferença entre as duas datas em milisegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    
    public void updateDates(Date checkIn, Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    
    @Override
    public String toString(){
        return "Room "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }
}
