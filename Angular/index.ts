type Product = {
    name: string,
    price: number,
}

const banana: Product = {
    name: "Banana",
    price: 1,
}

const apple: Product = {
    name: "Apple",
    price: 2,
}

const shoppingCard: Product[] = []

const addToShoppingCard = (product: Product): void => {
    shoppingCard.push(product)
}

const getTotalPrice = (): number => {
    let total
    for (let i =0; i < shoppingCard.length; i++) {
        total += shoppingCard[i].price
    }
    return total;
    // return shoppingCard.reduce((acc, cur) => acc += cur.price, 0)

    shoppingCard.forEach(item => console.log(item.price))
    const cheapProducts = shoppingCard.filter(item => item.price < 2)
}

addToShoppingCard(banana)
addToShoppingCard(apple)
console.log(getTotalPrice())



// old way
function myFunction() {return 0}

// arrow functions
const myFunction2 = () => {
    console.log('fgfg')
    return 1
}