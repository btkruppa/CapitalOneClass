

window.onload = function() {
	console.log("loaded view.js")
	retreivePastTickets();
}




function retreivePastTickets() {
	console.log("View Past tickets")
	let xhttp = new XMLHttpRequest();

	xhttp.onreadystatechange = function() {
		console.log(`state changed ${xhttp.readyState}`);
		
		if(xhttp.readyState === 4 && xhttp.status === 200) {
			console.log("server ready")
			console.log(xhttp.responseText);
			console.log("ajax parsing")
			  let reimbs = JSON.parse(xhttp.responseText);
			  reimbs.forEach((reimb) => {
				document.getElementById('user-container').innerHTML += `
					<div class="account" >
				<table width =100% border="1">
				<tr>
				<td>${reimb.reimb_id}</td>
				<td>${reimb.reimb_amount}</td>		
				<td>${reimb.reimb_description}</td>
				<td>${reimb.reimb_resolver}</td>
				<td>${reimb.reimb_status_id}</td>
				<td>${reimb.reimb_type_id}</td>
				</tr>
					</table>
					</div>
				`;
			});
		}
	}
	xhttp.open('GET', '../user/view');
	xhttp.send();

}