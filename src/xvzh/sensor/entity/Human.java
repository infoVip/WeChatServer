package xvzh.sensor.entity;

import java.util.Date;
/**
 * 人体红外传感器数据实体
 * @author Administrator
 *
 */
public class Human {
	private boolean status;
	private Date timeDate;
	public Human() {
		super();
	}
	public Human(boolean status) {
		this.status = status;
		this.timeDate = new Date();
	}

	public boolean isStatus() {
		return status;
	}

	public Date getTimeDate() {
		return timeDate;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setTimeDate(Date timeDate) {
		this.timeDate = timeDate;
	}
	
}
