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
				<td>
				<div style="display: inline-block">
				<form action="/ERSProjectTest/approve">
				<input type="hidden" name="reimb_id" value="${empreq.reimb_id}" />
				<input type="submit" name="decision" value="Approved" /> 
				</form>
				</div>
				<div style="display: inline-block;padding-left:20px;">
				<form action="/ERSProjectTest/deny">
				<input type="hidden" name="reimb_id" value="${empreq.reimb_id}" />
				<input type="submit" name="decision" value="Denied" />
				</form>
				</div>
				</td>
				
				</tr>
				`;
			
			})
			
		} 
	}

	xhttp.open('GET', './manageractionpend');
	xhttp.send();
}

retreiveEmpReq();


