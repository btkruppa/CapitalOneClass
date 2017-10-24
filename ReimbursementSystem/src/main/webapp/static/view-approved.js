window.onload = function() {
console.log("loaded")
retreiveAllTickets();
}

function retreiveApprovedTicktes() {
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        console.log(`state changed ${xhttp.readyState}`);
        if(xhttp.readyState === 4 && xhttp.status === 200) {
            console.log(xhttp.responseText);
            let Reimbursement = JSON.parse(xhttp.responseText);
            console.log(Reimbursement);
            Reimbursement.forEach((account) => {
                document.getElementById('table-container').innerHTML +=`
               <tr>
                <td>${account.reimbId}</td>
                <td>$${account.reimbAmount.toFixed(2).replace(/(\d)(?=(\d{3})+\.)/g,'$1,')}</td>
                <td>${account.reimbSubmitted}</td>
                <td>${account.reimbDescription}</td>
                <td>${account.reimbReceipt}</td>
                <td>${account.userFirstName}</td>
                <td>${account.userLastName}</td>
                <td>${account.reimbType}</td>
                <td>${account.reimbStatus}</td>
                
                
                </tr>
                `;
            
            })
            
        } 
    }
    xhttp.open('GET', './approvedtickets');
    xhttp.send();
}
retreiveApprovedTicktes();
console.log("this is going while the request is being processed");
