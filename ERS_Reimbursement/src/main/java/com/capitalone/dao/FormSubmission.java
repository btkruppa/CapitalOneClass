package com.capitalone.dao;

import java.math.BigDecimal;
import java.sql.Date;

import com.capitalone.bean.ReImbursementList;

public interface FormSubmission {

	boolean reimbList(BigDecimal reimbAmount, Date reimbSubmitted, String reimbDesc, String reimbReceipt,
			int reimbAuthor, int reimbStatus, int reimbType);

}
