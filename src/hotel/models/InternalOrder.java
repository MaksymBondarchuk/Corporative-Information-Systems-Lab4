package hotel.models;

import java.util.Date;

public class InternalOrder {
    public int id;
    public String description;
    public Date date;
    public OrderType orderType;
    public Employee requestedBy;
    public Employee assignedTo;
}
