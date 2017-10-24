function retreiveEmpReq() {
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		console.log(`state changed ${xhttp.readyState}`);
		if(xhttp.readyState === 4 && xhttp.status === 200) {
			console.log(xhttp.responseText);			
			let req = JSON.parse(xhttp.responseText);
			console.log(req);
			req.forEach((empreq) => {
				document.getElementById('req-container').innerHTML += `
				<tr>
				<td>${empreq.reimb_id}</td>
				<td>${empreq.reimb_amount}</td>
				<td>${empreq.reimb_desc}</td>
				<td>${empreq.reimb_status}</td>
				</tr>
				`;
			
			})
			
		} 
	}

	xhttp.open('GET', './retrieveemp');
	xhttp.send();
}

retreiveEmpReq();


