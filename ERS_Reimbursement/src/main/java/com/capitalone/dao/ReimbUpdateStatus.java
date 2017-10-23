package com.capitalone.dao;

import java.math.BigDecimal;
import java.sql.Date;

public interface ReimbUpdateStatus {
	
	boolean reimbStatusUpdate(int id, Date date, int resolverId, int reimbStatusId);
}
