/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fioreflowershop;

public class PickUp {
    private String pickupNo;
    private String requirePickUpDate;
    private String requirePickUpTime;
    private String pickupDate;
    private String pickupTime;
    private String pickupStatus;
    private Staff staff;
    private Order order;

    public PickUp() {
    }

    public PickUp(String pickupNo, String requirePickUpDate, String requirePickUpTime, String pickupDate, String pickupTime, String pickupStatus, Staff staff, Order order) {
        this.pickupNo = pickupNo;
        this.requirePickUpDate = requirePickUpDate;
        this.requirePickUpTime = requirePickUpTime;
        this.pickupDate = pickupDate;
        this.pickupTime = pickupTime;
        this.pickupStatus = pickupStatus;
        this.staff = staff;
        this.order = order;
    }

    public String getRequirePickUpDate() {
        return requirePickUpDate;
    }

    public String getRequirePickUpTime() {
        return requirePickUpTime;
    }

    public void setRequirePickUpDate(String requirePickUpDate) {
        this.requirePickUpDate = requirePickUpDate;
    }

    public void setRequirePickUpTime(String requirePickUpTime) {
        this.requirePickUpTime = requirePickUpTime;
    }

    

    public String getPickupNo() {
        return pickupNo;
    }

    public void setPickupNo(String pickupNo) {
        this.pickupNo = pickupNo;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getPickupStatus() {
        return pickupStatus;
    }

    public void setPickupStatus(String pickupStatus) {
        this.pickupStatus = pickupStatus;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "PickUp{" + "pickupNo=" + pickupNo + ", requirePickUpDate=" + requirePickUpDate + ", requirePickUpTime=" + requirePickUpTime + ", pickupDate=" + pickupDate + ", pickupTime=" + pickupTime + ", pickupStatus=" + pickupStatus + ", staff=" + staff + ", order=" + order + '}';
    }

    
    
}
