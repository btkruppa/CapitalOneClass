
function processDeny(){
	let xhr = new XMLHttpRequest();
	let reimbID;
	
	reimbID = document.querySelector('input[name="Radio1"]:checked').value;
	alert('ReImbursement Id: '+reimbID);
	
	xhr.open('POST', './deny/'+ reimbID);
	xhr.send();
	//location.reload(true);
	alert('Your request has been Denied');

}

function processApprove(){
	let xhr = new XMLHttpRequest();
	let reimbID;
	
	reimbID = document.querySelector('input[name="Radio1"]:checked').value;
	
	xhr.open('POST', './approve/'+ reimbID);
	xhr.send();
	//location.reload(true);
	alert('Approved Successfully');
}
