window.onload = function() {
	retreivePastTickets();
}


function retreivePastTickets() {
	let xhttp = new XMLHttpRequest();

	xhttp.onreadystatechange = function() {
		console.log(`state changed ${xhttp.readyState}`);
		
		if(xhttp.readyState === 4 && xhttp.status === 200) {
			console.log(xhttp.responseText);
			
			let reimb = JSON.parse(xhttp.responseText);
			console.log(accounts)
			accounts.forEach((account) => {
				document.getElementById('reimb-container').innerHTML += `
					<div class="account" id="${account.id}">
					reimb_id;
					reimb_amount;
					reimb_submitted;
					reimb_resolved;
					
				`;

	xhttp.open('GET', '../accounts');
	xhttp.send();
}

}