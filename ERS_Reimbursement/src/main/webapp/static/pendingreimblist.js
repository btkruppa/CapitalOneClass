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
						<button class="btn btn-sm btn-warning" onclick="declinePending(${reimburse.reimbId})">Decline</button></td>
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
//	xhr.onreadystatechange = function() {
//	    if (this.readyState == 4 && this.status == 200) {
//	    		loadPending(this);
//	    }
//	};
	xhr.open("PUT", "../approve?id="+reimbId, true);
	xhr.setRequestHeader('Content-type','application/json');
	xhr.send();
	location.reload(true);
	 //setTimeout('loadPending()', 2000);
}

function declinePending(reimbId) {	
	alert("You are Declining Reimbursement Id: " + reimbId);
	let xhr = new XMLHttpRequest();
	xhr.onload = function() {
		console.log("Decline button");
		
	};
	xhr.open("PUT", "../decline?id="+reimbId, true);
	xhr.setRequestHeader('Content-type','application/json');
	xhr.send();
	location.reload(true);
	//setTimeout('loadPending()', 2000);
}
loadPending();