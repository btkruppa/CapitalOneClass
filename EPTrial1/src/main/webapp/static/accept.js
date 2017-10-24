function getReimbID(){
	
	let xhr = new XMLHttpRequest();

	let reimbID;
	
	reimbID = document.querySelector('input[name="Radio1"]:checked').value
	
	xhr.open('GET', '../acceptReimbursement/'+ reimbID);
	xhr.send();
	location.reload(true);
}
