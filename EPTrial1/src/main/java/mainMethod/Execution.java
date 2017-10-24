package mainMethod;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.postgresql.jdbc.TimestampUtils;

import com.ers.reimbursement.model.Reimbursement;
import com.ers.reimbursement.model.ReimbursementStatus;
import com.ers.reimbursement.model.Users;

import dao.ReimbursementDAOImpl;
import dao.StatusDAOImpl;
import dao.UsersDAOImpl;
import impl.AddReimbursement;
import impl.ImplementUsersDAO;

public class Execution {

	public static void main(String[] args) {
		
//		ImplementUsersDAO iud = new ImplementUsersDAO();
//		iud.getUsers();
//		
//		AddReimbursement ar = new AddReimbursement();
//		ar.addReimbursement();
		ReimbursementDAOImpl rdi = new ReimbursementDAOImpl();
		// getting the user information based on login information
		UsersDAOImpl udi = new UsersDAOImpl();
		Users loggedInUser = new Users();
		loggedInUser = udi.getUserName("sunlight1", "abcd1234");
		System.out.println(loggedInUser);
		// if employee show past tickets
		if (loggedInUser.getUserRoleId() == 100){
			List<Reimbursement> allReimbForAUser;
			int loggedInUserId = loggedInUser.getErsUsersId();
			System.out.println("Below are the reimbursement tickets for this particular user " + loggedInUser.getUserFirstName() + " " + loggedInUser.getUserLastName());
			allReimbForAUser = rdi.getAllTicketsForAUser(loggedInUserId);
			for(Reimbursement r: allReimbForAUser){
				System.out.println(r);
			}
			System.out.println("Add reimb for the employee");
			Reimbursement rAdd = new Reimbursement();	
			Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
			rAdd.setReimbId(6);
			rAdd.setReimbAmount(800);
			rAdd.setReimbSubmitted(currentTimestamp);
			rAdd.setReimResolved(null);
			rAdd.setReimbDescription("Travel");
			rAdd.setReimbAuthor(3);
			//rAdd.setReimbResolver((Integer)null);
			rAdd.setReimbStatusId(2);
			rAdd.setReimbTypeId(2);
			
			try {
				//rdi.addReimbursement(rAdd);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else{ 							// logged person is a manager, shown all reimb list
			System.out.println("All reimb for manager review");
			List<Reimbursement> allReimb;
			allReimb = rdi.getAllReimbursements();

			for(Reimbursement r: allReimb){
				System.out.println(r);
			}
			
			System.out.println("below are Approved reimbs");
			StatusDAOImpl sdi = new StatusDAOImpl();
			ReimbursementStatus retStatus = new ReimbursementStatus();
			retStatus = sdi.getReimbStatus("Approved");			
			List<Reimbursement> allApprovedReimb;
			allApprovedReimb = rdi.filterReimbByStatus(retStatus.getReimbStatusId());
			for(Reimbursement ar: allApprovedReimb){
				System.out.println(ar);
			}
		}

	}

}
