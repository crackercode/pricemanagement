package com.priceservice.dto;

/**
 * The ResponseVO class
 * 
 * @author cracker
 * @since 2021
 */
public class ResponseVO {

	private ResponseStatus status;

	private Object data;

	public ResponseVO() {
		super();

	}

	/**
	 * @param status
	 * @param data
	 */
	public ResponseVO(ResponseStatus status, Object data) {
		super();
		this.status = status;
		this.data = data;
	}

	/**
	 * Get status
	 *
	 * @return the status
	 */
	public ResponseStatus getStatus() {
		return status;
	}

	/**
	 * Set status.
	 *
	 * @param status the status to set
	 */
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	/**
	 * Get data
	 *
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * Set data.
	 *
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	public static ResponseVO success(Object data) {
		return new ResponseVO(ResponseStatus.OK, data);
	}

	public static ResponseVO fail(Object data) {
		return new ResponseVO(ResponseStatus.FAIL, data);
	}

	@Override
	public String toString() {
		return "ResponseVO [status=" + status + ", data=" + data + "]";
	}

}
