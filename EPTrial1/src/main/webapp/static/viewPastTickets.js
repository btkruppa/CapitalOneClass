console.log("started")

window.onload = function(){
	console.log("loaded")
	retreivePastReimbursements();
}

function retreivePastReimbursements() {
let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		console.log(`state changed ${xhttp.readyState}`);
		if(xhttp.readyState === 4 && xhttp.status === 200) {
			console.log(xhttp.responseText);			
			let accounts = JSON.parse(xhttp.responseText);
			console.log(accounts)
			accounts.forEach((Reimbursement) => {
				document.getElementById('emp-container').innerHTML += `			
				<tr>
				<td>${new Date(Reimbursement.reimbSubmitted).toString().substring(4,15)}</td>
				<td>${Reimbursement.reimbAuthor}</td>
				<td>${Reimbursement.reimbDescription}</td>
				<td>${Reimbursement.reimbAmount}</td>
				</tr>				
				`;			
			});
		} else {
			
		}
	}

	xhttp.open('GET', '../Employee'); //.. is to get rid of static
	xhttp.send()
}

function addNewReimb() {
	location.href = './addReimbursement.html';
}
console.log("this is going while the request is being processed")