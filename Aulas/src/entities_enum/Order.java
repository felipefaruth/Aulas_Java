package entities_enum;

import java.util.Date;

public class Order {
	
	private Integer id;
	private Date time;
	private OrderStatus status;
	
	public Order() {
	}

	public Order(Integer id, Date time, OrderStatus status) {
		this.id = id;
		this.time = time;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "id=" + id + 
				", time=" + time +
				", status=" + status;
	}
	
	
	
}

