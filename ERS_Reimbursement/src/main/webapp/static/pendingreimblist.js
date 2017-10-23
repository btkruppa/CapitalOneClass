function loadPending() {	
	let xhr = new XMLHttpRequest();
	// on success callback function
	xhr.onload = function() {
		console.log("Pending");
		let empReimbList = JSON.parse(this.responseText);
		empReimbList.forEach((reimburse) => {
			if(reimburse.reimbStatus === "Pending"){
				document.getElementsByClassName('reimbursement-list-pedning')[0].innerHTML += `
					<tr id="${reimburse.reimbId}">
					<td> ${reimburse.reimbId} </td>
					<td> ${reimburse.reimbAmount} </td>
					<td> ${reimburse.reimbSubmitted} </td>
					<td> ${reimburse.reimbResolved} </td>
					<td> ${reimburse.reimbDesc} </td>
					<td> ${reimburse.reimbReceipt} </td>
					<td> ${reimburse.reimbAuthor} </td>
					<td> ${reimburse.reimbResolver} </td>
					<td> ${reimburse.reimbStatus} </td>
					<td> ${reimburse.reimbType} </td>
					<td><button class="btn btn-sm btn-success" onclick="approvePending(${reimburse.reimbId})">Approve</button><br><br>
						<button class="btn btn-sm btn-warning" onclick="approvePending(${reimburse.reimbId})">Decline</button></td>
					</tr>`;
				}})
	};
	
	xhr.open("GET", "../viewAll", true);
	xhr.send();
}



function approvePending(reimbId) {	
	alert("You are Approving Reimbursement Id: " + reimbId);
	let xhr = new XMLHttpRequest();
	xhr.onload = function() {
		console.log("approve button");
		
	};
// var data = {};
// data.id = reimbId;
// var json = JSON.stringify(data);
	xhr.open("PUT", "../approve?id="+reimbId, true);
	xhr.setRequestHeader('Content-type','application/json');
	xhr.send();
//	if(xhr.readyState === 4 && xhr.status === 200) {
//		           loadPending();
//	}
	setTimeout('loadPending()', 2000);
}

function approvePending(reimbId) {	
	alert("You are Declining Reimbursement Id: " + reimbId);
	let xhr = new XMLHttpRequest();
	xhr.onload = function() {
		console.log("approve button");
		
	};
	xhr.open("PUT", "../decline?id="+reimbId, true);
	xhr.setRequestHeader('Content-type','application/json');
	xhr.send();
	setTimeout('loadPending()', 2000);
}
loadPending();