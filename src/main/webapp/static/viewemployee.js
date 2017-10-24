function loadDoc() {

    let xhr = new XMLHttpRequest();
    var date = new Date();
    // on success callback function
    xhr.onload = function () {
        let empReimbList = JSON.parse(this.responseText);
        console.log(empReimbList)
        document.getElementsByClassName('reimbursement-list').innerHTML = ` `;

        empReimbList.forEach((reimburse) => {
            console.log("here");
            if (reimburse.reimbStatusType === "pending") {
                document.getElementsByClassName('reimbursement-list')[0].innerHTML += `
                                                                    <tr id="${reimburse.reimbId}">
                                                                    <td> ${reimburse.reimbId} </td>
                                                                    <td> ${reimburse.reimbAmount} </td>
                                                                    <td></td>
                                                                    <td></td>
                                                                    <td> ${reimburse.reimbDescription} </td>
                                                                    <td> ${reimburse.userFirstName + " " + reimburse.userLastName} </td>
                                                                    <td></td>
                                                                    <td> ${reimburse.reimbStatus} </td>
                                                                    <td> ${reimburse.reimbType} </td>
                                                    </tr>
                                                    `;

            } else {
                document.getElementsByClassName('reimbursement-list')[0].innerHTML += `
                <tr id="${reimburse.reimbId}">
                <td> ${reimburse.reimbId} </td>
                <td> ${reimburse.reimbAmount} </td>
                <td> ${new Date(reimburse.reimbSubmitted).toLocaleDateString()} </td>
                <td> ${new Date(reimburse.reimbResolved).toLocaleDateString()} </td>
                <td> ${reimburse.reimbDescription} </td>
                <td> ${reimburse.userFirstName + " " + reimburse.userLastName} </td>
                
                <td> ${reimburse.reimbStatus} </td>
                <td> ${reimburse.reimbType} </td>
</tr>
`;
            }
        });
console.log(this.responseText)
            };

xhr.open("GET", "../viewEmployeeClaims", true);
xhr.send();
        }
loadDoc();