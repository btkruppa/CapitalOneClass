console.log("edit Reimbursement started")

window.onload = function(){
	console.log("edit Reimbursement loaded")
	let xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
			console.log(`state changed ${xhttp.readyState}`);
			if(xhttp.readyState === 4 && xhttp.status === 200) {
				console.log(xhttp.responseText);
				let reimb = JSON.parse(xhttp.responseText);
				console.log(reimb.get("reimbDescription"))
//				console.log(reimb.reimbDescription)
			}
		}
		xhttp.open('GET', '../GetReimbursement/'); //.. is to get rid of static
		xhttp.send()
}