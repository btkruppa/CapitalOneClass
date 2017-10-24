console.log("started")

window.onload = function() {
	console.log("loaded");
	retreiveAllTickets();
	 
}



function retreiveAllTickets() {
	console.log("retreiving tickets by STATUS");
	let ajax = new XMLHttpRequest();

	ajax.onreadystatechange = function() {
		console.log(`state changed ${ajax.readyState}`);
		
		if(ajax.readyState === 4 && ajax.status === 200) {
			console.log(ajax.responseText);
			
			  let reimbs = JSON.parse(ajax.responseText);
			  reimbs.forEach((reimb) => {
				document.getElementById('status-container').innerHTML += `
					<div class="user" >
				<table width =100% border="1" id="tb">
				<tr>
				<td><input type="radio" name="Radio1" value="${reimb.reimb_id}"></td>
				
				<td class="td1" id="td1">${reimb.reimb_id}</td>
				<td>${reimb.reimb_amount}</td>
				<td>${reimb.reimb_description}</td>
				<td>${reimb.reimb_status_id}</td>
				<td>${reimb.reimb_type_id}</td>
				</tr>
					</table>
					</div>
				`;
				
			});
			
			  

			  
			  
		}
	}
	ajax.open('GET', '../manager/viewbystatus');
	ajax.send();

}

