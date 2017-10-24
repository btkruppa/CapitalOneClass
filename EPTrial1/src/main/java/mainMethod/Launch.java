package mainMethod;

import java.util.List;

import com.ers.reimbursement.model.Reimbursement;
import com.ers.reimbursement.model.ReimbursementStatus;
import com.ers.reimbursement.model.Users;

import dao.ReimbursementDAOImpl;
import dao.StatusDAOImpl;
import dao.UsersDAOImpl;

public class Launch {

	public static void main(String[] args) {
		
		String uName = "sunlight2";
		String uPwd = "abcd1234";
		String selectedStatus = "Approved";
		
		ReimbursementDAOImpl rdi = new ReimbursementDAOImpl();
		List<Reimbursement> showAllTickets;
		List<Reimbursement> showAllReimb;
		List<Reimbursement> showAllReimbByStatus;
		Reimbursement re = new Reimbursement();
		
		StatusDAOImpl sdi = new StatusDAOImpl();
		ReimbursementStatus rs = new ReimbursementStatus();
		
		
		UsersDAOImpl udi = new UsersDAOImpl();
		Users usr = new Users();
		usr = udi.getUserName(uName, uPwd);
		
		if(usr.getUserRoleId() == 100){
			System.out.println("Logged in User is Employee");
			showAllTickets = rdi.getAllTicketsForAUser(usr.getErsUsersId());
			for(Reimbursement r: showAllTickets){
				System.out.println(r);
			}
		}
		else{
			System.out.println("Logged in User is Manager");
			showAllReimb = rdi.getAllReimbursements();
			for(Reimbursement s: showAllReimb){
				System.out.println(s);
			}
			System.out.println("Show reimbursements by Status");
			rs = sdi.getReimbStatus(selectedStatus);
			showAllReimbByStatus = rdi.filterReimbByStatus(rs.getReimbStatusId());

			for(Reimbursement t: showAllReimbByStatus){
				System.out.println(t);
			
			}
		}
		

	}

}
