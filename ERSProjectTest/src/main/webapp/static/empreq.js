function retreiveBankAccounts() {
	let xhttp = new XMLHttpRequest();

	xhttp.onreadystatechange = function() {
		console.log(`state changed ${xhttp.readyState}`);
		if(xhttp.readyState === 4 && xhttp.status === 200) {
			console.log(xhttp.responseText);
			
			let accounts = JSON.parse(xhttp.responseText);
			console.log(accounts);
			accounts.forEach((account) => {
				document.getElementById('table-container').innerHTML += `
				<tr>
				<td>${account.reimb_id}</td>
				<td>${account.reimb_amount}</td>
				<td>${account.reimb_desc}</td>
				<td>${account.reimb_status}</td>
				</tr>
				`;
			
			})
			
		} 
	}

	xhttp.open('GET', './retrievehistory');
	xhttp.send();
}

retreiveBankAccounts();


console.log("this is going while the request is being processed")