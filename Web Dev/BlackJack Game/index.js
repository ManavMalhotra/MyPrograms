let card = []
let sum = 0

function getRandomcard(){
	let cardNum = Math.floor(Math.random()*13) + 1
	return cardNum
}

function renderGame(){
	for (var i = 0; i <= card.length; i++) {
		sum = sum + card[i]
	}
	console.log(sum)
}

function cardList(){
	let firstCard = getRandomcard()
	let secondCard = getRandomcard()
	card = [firstCard, secondCard]
	sum = firstCard + secondCard
	renderGame()

	console.log(card)
}

function sumUp(){
	for (var i = 0; i <= card.length; i++) {
		let sum = sum + card[i] 
	}
}

function newCard(){
	let thirdCard = getRandomcard()
	card.push(thirdCard)
	renderGame()
	console.log(card.length)
}

console.log(sumUp())
