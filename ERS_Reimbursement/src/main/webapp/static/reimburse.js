function loadDoc() {
	
	let xhr = new XMLHttpRequest();

	// on success callback function
	xhr.onload = function() {
		let empReimbList = JSON.parse(this.responseText);
		empReimbList.forEach((reimburse) => {
			console.log("here")
			document.getElementsByClassName('reimbursement-list')[0].innerHTML += `
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
  			</tr>`;
		})
		
		console.log(this.responseText) 
	};
	
	xhr.open("GET", "../empViewAll", true);
	xhr.send();
}
loadDoc();