
function getIdAgain()
{	
	let xhr = new XMLHttpRequest();

	console.log("For Denying");
	let ajax = new XMLHttpRequest();
	let x;
	x=document.querySelector('input[name="Radio1"]:checked').value
			

	xhr.open('GET', '../manager/deny/'+ x);
	xhr.send();
	
	
	console.log("returning here");
	window.location="deny.html";
		    
			
}
	
