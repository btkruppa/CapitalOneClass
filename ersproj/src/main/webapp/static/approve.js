
function getId()
{	
	let xhr = new XMLHttpRequest();

	console.log("For Approving");
	let ajax = new XMLHttpRequest();
	let x;
	x=document.querySelector('input[name="Radio1"]:checked').value
			

	xhr.open('GET', '../manager/approve/'+ x);
	xhr.send();

	console.log("returning here");
	window.location="success.html";   
		    
			
}
	
