
let count = 0

function counter() {
	count ++
	document.getElementById("timer").innerHTML = count
	console.log(count)
}

function reset() {
	count = 0
	document.getElementById("timer").innerHTML = count
	
}
function saved() {
	let countstr = count + " - " + " "
	document.getElementById("saved").textContent += countstr
	count = 0
	document.getElementById("timer").innerHTML = count

}
function clear(){
	document.getElementById("saved").innerHTML = "Your Numbers:"
}