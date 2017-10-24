//window.onload = function() {
//console.log("loaded")
//retreivePendingTicktes();
//}


function retreivePendingTicktes() {
	let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        console.log(`state changed ${xhttp.readyState}`);
        if(xhttp.readyState === 4 && xhttp.status === 200) {
            console.log(xhttp.responseText);
            let Reimbursement = JSON.parse(xhttp.responseText);
            console.log(Reimbursement);
            Reimbursement.forEach((reimb) => {
                document.getElementById('table-container').innerHTML +=`
               <tr>
                <td><input value ="${reimb.reimbId}" type="radio" name="Radio1"></td>
                <td>${reimb.reimbId}</td>
                <td>$${reimb.reimbAmount.toFixed(2).replace(/(\d)(?=(\d{3})+\.)/g,'$1,')}</td>
                <td>${reimb.reimbSubmitted}</td>
                <th>${reimb.reimbResolved}</th>
                <td>${reimb.reimbDescription}</td>
                <td>${reimb.userFirstName}</td>
                <td>${reimb.userLastName}</td>
                <td>${reimb.reimbType}</td>
                <td>${reimb.reimbStatus}</td>
                
                
                </tr>
                `;
            
            })
            
        } 
    }
    xhttp.open('GET', './pendingtickets');
    xhttp.send();
}
retreivePendingTicktes();
console.log("this is going while the request is being processed");
