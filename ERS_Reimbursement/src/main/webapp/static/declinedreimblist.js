function loadDeclined() {	
	let xhr = new XMLHttpRequest();
	// on success callback function
	xhr.onload = function() {
		let empReimbList = JSON.parse(this.responseText);
		empReimbList.forEach((reimburse) => {
			if(reimburse.reimbStatus === "Declined"){
				document.getElementsByClassName('reimbursement-list-pedning')[0].innerHTML += `
					<tr id="${reimburse.reimbId}">
					<td> ${reimburse.reimbId} </td>
					<td>	 ${reimburse.reimbAmount} </td>
					<td> ${reimburse.reimbSubmitted} </td>
					<td> ${reimburse.reimbResolved} </td>
					<td> ${reimburse.reimbDesc} </td>
					<td> ${reimburse.reimbReceipt} </td>
					<td> ${reimburse.reimbAuthor} </td>
					<td> ${reimburse.reimbResolver} </td>
					<td> ${reimburse.reimbStatus} </td>
					<td> ${reimburse.reimbType} </td>
					</tr>`;
				}
			
		
		})
	};
	xhr.open("GET", "../viewAll", true);
	xhr.send();
}
loadDeclined();